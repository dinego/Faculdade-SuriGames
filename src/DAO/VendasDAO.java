/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class VendasDAO {

    private Connection con;
    private int QTDNova;

    public void inserir(Venda v) {
        con = new Conexao().getConnection();

        String sql = "insert into vendas (idCliente, idJogo, qtdVenda, valorVenda) values (?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, v.getIdCliente());
            stmt.setInt(2, v.getIdProd());
            stmt.setInt(3, v.getQtdProduto());
            stmt.setFloat(4, v.getValorVenda());
            
            this.atualizaEstoque(v);
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Jogo cadastrado com sucesso!");
        } catch (SQLException ex) {

            throw new RuntimeException(ex);

        }
    }

    //

    private void atualizaEstoque(Venda venda) {
        
        this.buscaEstoqueAtual(venda.getIdProd());
        
        con = new Conexao().getConnection();

        String sql = "UPDATE vendas SET qtde = ?";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            
            QTDNova = venda.getQtdAntiga() - venda.getQtdProduto();
            stmt.setInt(1, QTDNova);
            
            stmt.execute();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {

            throw new RuntimeException(ex);

        }
    }

    private Venda buscaEstoqueAtual(int idJogo) {
        con = new Conexao().getConnection();
        Venda total = null;
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("select qtde from jogos where id = ?");

            stmt.setInt(1, idJogo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                total = new Venda();
                total.setQtdAntiga(rs.getInt("qtde"));
            }

            stmt.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return total;
    }

}
