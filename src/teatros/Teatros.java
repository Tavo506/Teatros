/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * Eje users:
 * AdminSis: aconejo, Con4Use
 * AdminTeatro aperez, ova4Che
 * Agente jramos, Efacha2
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
    
    public static String Login(String user, String pass){
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
            return null;

        }
        String tipo = getTipo(user);
        Tipo = tipo;
        
        System.out.println("User: " + User + "\nPassword: " + Password + "\nTipo: " + Tipo);
        return tipo;
    }
    
    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Long.parseLong(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
    
    private static String getTipo(String user){
        String tipo = null;
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPStipoLogin ?");
            ct.setString(1, user);
            ResultSet rs = ct.executeQuery();
            
            if(rs.next()){
                System.out.println(rs.getString(1));
                tipo = rs.getString(1);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return tipo;
    }
    
    public static boolean InsertAdmin(String teatro, String nombre, String cedula, String sexo, Date nacimiento, String direccion, String telCelular, String telCasa, String telOtro, String correo, String user, String pass){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC func ?,?,?,?,?,?,?,?,?,?,?,?");
            ResultSet rs = ct.executeQuery();
            
            return true;
        }catch (SQLException e){
            return false;
        }
    }
    
    public static void selectTeatros(JComboBox combo){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPSteatros");
            ResultSet rs = ct.executeQuery();
            
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
    
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean revisaTeatro(JFrame p, String nombre, String direccion, int telefono, String correo, String web){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPSteatros");
            ResultSet rs = ct.executeQuery();
    
            while(rs.next()){
            
                if(nombre.equals(rs.getString(1))){
                    JOptionPane.showMessageDialog(p, "Nombre del teatro ya usado", "Advertencia",0);
                    return false;
                    
                }else if(direccion.equals(rs.getString(2))){
                    JOptionPane.showMessageDialog(p, "Dirección del teatro ya usado", "Advertencia",0);
                    return false;
                    
                }else if(telefono == rs.getInt(3)){
                    JOptionPane.showMessageDialog(p, "Telefono del teatro ya usado", "Advertencia",0);
                    return false;
                    
                }else if(correo.equals(rs.getString(4))){
                    JOptionPane.showMessageDialog(p, "Correo del teatro ya usado", "Advertencia",0);
                    return false;
                    
                }else if(web.equals(rs.getString(5))){
                    JOptionPane.showMessageDialog(p, "Sitio web del teatro ya usado", "Advertencia",0);
                    return false;
                }
            }
            
            return true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    /* Plantilla 
    
    public static boolean name()throws SQLException{
        try{
            PreparedStatement ct = con.prepareStatement("EXEC func");
            ResultSet rs = ct.executeQuery();
    
            return true;
        }catch (SQLException e){
            throw e;
        }
    }
    
    */
}
