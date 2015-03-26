/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author binho
 */
public class FornecedorDAO {

    private Connection con;

    public void inserir(Fornecedor f) {
        con = new Conexao().getConnection();

        String sql = "insert into fornecedores (cpf_CNPJ, nome_razao, telefone, nome_contato, email_contato, endereco, num, uf) values (?,?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            
            //stmt.setInt(1);
            stmt.setString(1, f.getCpfCNPJ());
            stmt.setString(2, f.getNomeRazao());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getNomeContato());
            stmt.setString(5, f.getEmailContato());
            stmt.setString(6, f.getEndereco());
            stmt.setInt(7, f.getNum());
            stmt.setString(8, f.getUF());
            
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
