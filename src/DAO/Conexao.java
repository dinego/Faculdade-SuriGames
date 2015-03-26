/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diego Moreira
 */
public class Conexao {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/surigames", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
