/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Samuel
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {   
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1234");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
