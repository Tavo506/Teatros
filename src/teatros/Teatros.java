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
import java.util.ArrayList;
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
    public static String User, Password, Tipo, Teatro;

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
        
        System.out.println("User: " + User + "\nPassword: " + Password + "\nTipo: " + Tipo + "\n" + Teatro);
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
                tipo = rs.getString(1);
                Teatro = rs.getString(2);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return tipo;
    }
    
    public static boolean checkEmpleado(JFrame p, String cedula, String telCelular, String correo, String usuario){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPStrabajadores");
            ResultSet rs = ct.executeQuery();
            
            while(rs.next()){
                if(cedula.equals(rs.getString(1))){
                    JOptionPane.showMessageDialog(p, "C�dula ya existe", "Advertencia",0);
                    return false;
                    
                }else if(telCelular.equals(Integer.toString(rs.getInt(2)))){
                    JOptionPane.showMessageDialog(p, "Tel�fono celular ya existe", "Advertencia",0);
                    return false;
                    
                }else if(correo.equals(rs.getString(3))){
                    JOptionPane.showMessageDialog(p, "Correo ya existe", "Advertencia",0);
                    return false;
                    
                }else if(usuario.equals(rs.getString(4))){
                    JOptionPane.showMessageDialog(p, "Nombre de usuario ya utilizado", "Advertencia",0);
                    return false;
                    
                }
            }
    
            return true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static boolean InsertAdmin(JFrame p, String teatro, String nombre, String cedula, String sexo, Date nacimiento, String direccion, String telCelular, String telCasa, String telOtro, String correo, String user, String pass) throws SQLException{
        try{
            
            if(!checkEmpleado(p, cedula, telCelular, correo, user)){
                return false;
            }
            
            PreparedStatement ct = con.prepareStatement("EXEC SPIAdminTeatro ?,?,?,?,?,?,?,?,?,?,?,?");
            ct.setString(1, teatro);
            ct.setString(2, nombre);
            ct.setInt(3, Integer.parseInt(cedula));
            ct.setString(4, sexo);
            ct.setDate(5, nacimiento);
            ct.setString(6, direccion);
            ct.setInt(7, Integer.parseInt(telCelular));
            ct.setInt(8, Integer.parseInt(telCasa));
            ct.setInt(9, Integer.parseInt(telOtro));
            ct.setString(10, correo);
            ct.setString(11, user);
            ct.setString(12, pass);
            
            ct.executeUpdate();

            
            return true;
        }catch (SQLException e){
            System.err.println(e.getMessage());
            throw e;
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
                    JOptionPane.showMessageDialog(p, "Direcci�n del teatro ya usado", "Advertencia",0);
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
    
    public static boolean insertTeatrosData(String nombre, String direccion, String telefono, String correo, String web, int cantidadAsientos, ArrayList<String> bloques, ArrayList<String[]> datos)throws SQLException{
        try{
            PreparedStatement sT = con.prepareStatement("EXEC SPITeatro ?,?,?,?,?,?");
            sT.setString(1, nombre);
            sT.setString(2, direccion);
            sT.setInt(3, Integer.parseInt(telefono));
            sT.setString(4, correo);
            sT.setString(5, web);
            sT.setInt(6, cantidadAsientos);
            sT.executeUpdate();            

            insertBloques(nombre, bloques);
            
            insertFilas(nombre, datos);
    
            return true;
        }catch (SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
    }
    
    static void insertBloques(String teatro, ArrayList<String> bloques)throws SQLException{
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPIBloque ?,?");
            ct.setString(1, teatro);
            
            for(String bloque : bloques){
                ct.setString(2, bloque);
                ct.executeUpdate();
            }

        }catch (SQLException e){
            throw e;
        }
    }
    
    static void insertFilas(String teatro, ArrayList<String[]> datos)throws SQLException{
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPIFila ?,?,?,?");
            ct.setString(1, teatro);
            
            for(String[] dato : datos){
                ct.setString(1, dato[0]);
                ct.setString(2, dato[1]);
                ct.setInt(3, Integer.parseInt(dato[2]));
                
                ct.executeQuery();
            }

        }catch (SQLException e){
            throw e;
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
