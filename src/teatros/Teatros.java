/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Teatros {
    public static Connection con;
    public static String User, Password, Tipo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new LoginFrame();
    }
    
    public static boolean Login(String user, String pass){
        try {
          String connectionUrl = "jdbc:sqlserver://;database=TEATROS;";
          Connection c = DriverManager.getConnection(connectionUrl, user, pass);
          con = c;
          System.out.println("Conectado.");
          User = user;
          Password = pass;
        } 
        catch (SQLException ex) 
        {
            System.err.println(ex.toString());
            return false;

        }
        getTipo(user);
        System.out.println("User: " + User + "\nPassword: " + Password + "\nTipo: " + Tipo);
        return true;
    }
    
    private static void getTipo(String user){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPStipoLogin ?");
            ct.setString(1, user);
            ResultSet rs = ct.executeQuery();
            
            if(rs.next()){
                System.out.println(rs.getString(1));
                Tipo = rs.getString(1);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
