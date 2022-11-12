/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jonix
 */
public class connection {
      static Connection contacto = null;

    public static Connection getConnection(){

        Connection on = null;
        try{
            String user = "root";
            String pass = "";
            String url = "jdbc:mysql://localhost:3306/library";
            Class.forName("com.mysql.cj.jdbc.Driver");
            on = DriverManager.getConnection(url,user,pass);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return on;
    }
    
    public static boolean validateConnection(){
        contacto = getConnection();
          return contacto != null;
    }
}
