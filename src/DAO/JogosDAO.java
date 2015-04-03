/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Jogo;
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
public class JogosDAO {

    private Connection con;

    public void inserir(Jogo j) {
        con = new Conexao().getConnection();

        String sql = "insert into jogos (nomeJogo, genero, distribuidora, valor, qtde, fornecedor, codInterno) values (?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            
            //stmt.setInt(1);
            stmt.setString(1, j.getNomeJogo());
            stmt.setString(2, j.getGenero());
            stmt.setString(3, j.getDistribuidora());
            stmt.setFloat(4, j.getValor());
            stmt.setInt(5, j.getQtde());
            stmt.setString(6, j.getFornecedor());
            stmt.setInt(7, j.getCodInterno());
            
            stmt.execute();

            stmt.close();

            con.close();
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");
        } catch (SQLException ex) {

            throw new RuntimeException(ex);

        }
    }

    //

}
