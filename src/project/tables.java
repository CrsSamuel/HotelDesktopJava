/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author samue
 */
public class tables {
    public static void main(String[] args)
    {

        try
        {
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
            st.executeUpdate("create table if not exists users(name varchar(200),email varchar(200),password varchar(50),relatorio varchar(200),status varchar(20))");
            st.executeUpdate("create table if not exists room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
            st.executeUpdate("create table if not exists customer(id int,name varchar(200),mobileNumber varchar(25),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int,numberOfDaysStay int,totalAmount varchar(200),checkout varchar(50))");
            st.executeUpdate("create table if not exists foods(price int,name varchar(200),amount int)");
            JOptionPane.showMessageDialog(null, "Table created Sucessfully");
            con.close();
            st.close();
        }
        catch(Exception e)
        {
                 e.printStackTrace();
                JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
             try
        {}
        catch(Exception e)
        {}
                
        }
    }
}
