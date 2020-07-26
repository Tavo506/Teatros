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
import java.sql.Time;
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
    public static Object[] buffer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new LoginFrame();
    }
    
    public static void Connect(String user, String pass){
        try {
            String connectionUrl = "jdbc:sqlserver://;database=TEATROS;";
            Connection c = DriverManager.getConnection(connectionUrl, user, pass);
            con = c;
            System.out.println("Conectado.");
            User = user;
            Password = pass;
            System.out.println("User: " + User + "\nPassword: " + Password + "\nTipo: " + Tipo + "\n" + Teatro);
        } 
        catch (SQLException ex) 
        {
            System.err.println(ex.toString());

        }
    }
    
    public static String Login(String user, String pass){
        try {
          String connectionUrl = "jdbc:sqlserver://;database=TEATROS;";
          Connection c = DriverManager.getConnection(connectionUrl, "Default", "12345");
          con = c;
        } 
        catch (SQLException ex) 
        {
            System.err.println(ex.toString());

        }
        String[] datos = getTipo(user);
        Tipo = datos[0];
        Teatro = datos[1];
        
        return datos[0];
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
    
    //Buffer Controller
    public static Object[] getBuffer(){
        return buffer;
    }
    
    public static void setBuffer(Object[] obj){
        buffer = obj;
    }
    
    public static void nullBuffer(){
        buffer = null;
    }
    
    
    
    private static String[] getTipo(String user){
        String[] datos = null;
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPStipoLogin ?");
            ct.setString(1, user);
            ResultSet rs = ct.executeQuery();
            
            if(rs.next()){
                datos = new String[]{rs.getString(1), rs.getString(2)};
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public static boolean checkEmpleado(JFrame p, String cedula, String telCelular, String correo, String usuario){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPStrabajadores");
            ResultSet rs = ct.executeQuery();
            
            while(rs.next()){
                if(cedula.equals(rs.getString(1))){
                    JOptionPane.showMessageDialog(p, "Cédula ya existe", "Advertencia",0);
                    return false;
                    
                }else if(telCelular.equals(Integer.toString(rs.getInt(2)))){
                    JOptionPane.showMessageDialog(p, "Teléfono celular ya existe", "Advertencia",0);
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
            ct.setDate(4, nacimiento);
            ct.setString(5, sexo);
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
            System.err.println(e.getLocalizedMessage());
            throw e;
        }
    }
    
    public static boolean InsertAgente(JFrame p, String teatro, String nombre, String cedula, String sexo, Date nacimiento, String direccion, String telCelular, String telCasa, String telOtro, String correo, String user, String pass) throws SQLException{
        try{
            
            if(!checkEmpleado(p, cedula, telCelular, correo, user)){
                return false;
            }
            
            PreparedStatement ct = con.prepareStatement("EXEC SPIAgente ?,?,?,?,?,?,?,?,?,?,?,?");
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
    
    public static boolean revisaTeatro(JFrame p, String nombre, String direccion, int telefono, String correo, String web, int boleteria){
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
                }else if(boleteria == rs.getInt(6)){
                    JOptionPane.showMessageDialog(p, "Teléfono de boletería ya usado", "Advertencia",0);
                    return false;
                }
            }
            
            return true;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static boolean insertTeatrosData(String nombre, String direccion, String telefono, String correo, String web, String boleteria, int cantidadAsientos, ArrayList<String> bloques, ArrayList<String[]> datos){
        try{
            PreparedStatement sT = con.prepareStatement("EXEC SPITeatro ?,?,?,?,?,?,?");
            sT.setString(1, nombre);
            sT.setString(2, direccion);
            sT.setInt(3, Integer.parseInt(telefono));
            sT.setString(4, correo);
            sT.setString(5, web);
            sT.setInt(6, cantidadAsientos);
            sT.setInt(7, Integer.parseInt(boleteria));
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
                ct.setString(2, dato[0]);
                ct.setString(3, dato[1]);
                ct.setInt(4, Integer.parseInt(dato[2]));
                
                ct.executeUpdate();
            }

        }catch (SQLException e){
            throw e;
        }
    }
    
    public static boolean insertProduccion(JFrame p, String teatro, String obra, String detalles, String tipo, String estado, Date fechaI, Date fehcaF)throws SQLException{
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPIProduccion ?,?,?,?,?,?,?");
            ct.setString(1, teatro);
            ct.setString(2, obra);
            ct.setString(3, tipo);
            ct.setString(4, detalles);
            ct.setString(5, estado);
            ct.setDate(6, fechaI);
            ct.setDate(7, fehcaF);
            ct.executeUpdate();
    
            return true;
        }catch (SQLException e){
            System.err.println(e.getMessage());
            throw e;
        }
    }
    
    
    public static ArrayList<String[]> selectProduc(String teatro){
        ArrayList<String[]> producciones = new ArrayList<>();
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPSproducciones ?");
            ct.setString(1, teatro);
            ResultSet rs = ct.executeQuery();
            
            while(rs.next()){
                producciones.add(new String[]{rs.getString(1), rs.getString(2)});
            }
    
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return producciones;
    }
    
    
    public static ArrayList<Object[]> selectFechasProdu(String teatro, String produ){
        ArrayList<Object[]> fechas = new ArrayList<>();
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPSfechasProdu ?, ?");
            ct.setString(1, teatro);
            ct.setString(2, produ);
            ResultSet rs = ct.executeQuery();
            
            while(rs.next()){
                fechas.add(new Object[]{rs.getDate(1), rs.getTime(2)});
                
            }
    
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return fechas;
    }
    
    
    public static ArrayList<Object[]> selectPreciosProdu(String teatro, String produ){
        ArrayList<Object[]> fechas = new ArrayList<>();
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPSprecioProdu ?, ?");
            ct.setString(1, teatro);
            ct.setString(2, produ);
            ResultSet rs = ct.executeQuery();
            
            while(rs.next()){
                fechas.add(new Object[]{rs.getString(1), rs.getInt(2)});
                
            }
    
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return fechas;
    }
    
    
    public static boolean insertPresentacion(String teatro, String obra, Date fecha, Time hora)throws SQLException{
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPIPresentacion ?,?,?,?");
            ct.setString(1, teatro);
            ct.setString(2, obra);
            ct.setDate(3, fecha);
            ct.setTime(4, hora);
            ct.executeUpdate();
    
            return true;
        }catch (SQLException e){
            System.err.println(e.getMessage());
            throw e;
        }
    }
    
    
    public static void updateEstado(String teatro, String obra, String estado){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPUestadoProdu ?,?,?");
            ct.setString(1, teatro);
            ct.setString(2, obra);
            ct.setString(3, estado);
            ct.executeUpdate();
    
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
    
    
    public static void updatePrecio(String teatro, String obra, String bloque, int precio){
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPUprecioProdu ?,?,?,?");
            ct.setString(1, teatro);
            ct.setString(2, obra);
            ct.setString(3, bloque);
            ct.setInt(4, precio);
            ct.executeUpdate();
    
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
    
    public static String[] selectFechas(String teatro, String obra){
        String[] fechas = null;
        try{
            PreparedStatement ct = con.prepareStatement("EXEC SPSlimFechas ?,?");
            ct.setString(1, teatro);
            ct.setString(2, obra);
            ResultSet rs = ct.executeQuery();
            
            rs.next();
            
            fechas = new String[]{rs.getDate(1).toString(), rs.getDate(2).toString()};
    
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return fechas;
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
