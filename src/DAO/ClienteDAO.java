/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Cliente;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Moreira
 */
public class ClienteDAO {

    private Connection con;

    public void inserir(Cliente c) {
        con = new Conexao().getConnection();

        String sql = "insert into clientes (nome, telefone, email, endereco, numero, uf, cpfCNPJ) values (?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement(sql);
            
            //stmt.setInt(1);
            stmt.setString(1, c.getNomeRazao());
            stmt.setString(2, c.getTelefone());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getEndereco());
            stmt.setInt(5, c.getNum());
            stmt.setString(6, c.getUF());
            stmt.setString(7, c.getCpfCNPJ());
            
            stmt.execute();

            stmt.close();

            con.close();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (SQLException ex) {

            throw new RuntimeException(ex);

        }
    }
    
    public Cliente getCliente(int id) {
        Cliente cliente = new Cliente();
        con = new Conexao().getConnection();
        
        String s = null;
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("select * from clientes where id = ?");
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
           
            cliente.setNomeRazao(rs.getString("nome"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setNum(rs.getInt("numero"));
            cliente.setUF(rs.getString("uf"));
            cliente.setCpfCNPJ(rs.getString("cpfCNPJ"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEmail(rs.getString("email"));

            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return cliente;        
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> listClientes = new ArrayList<Cliente>();
        con = new Conexao().getConnection();
        
        String s = null;
        PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("select * from clientes");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNomeRazao(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNum(rs.getInt("numero"));
                cliente.setUF(rs.getString("uf"));
                cliente.setCpfCNPJ(rs.getString("cpfCNPJ"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                listClientes.add(cliente);
            }            
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return listClientes;
    }

}
