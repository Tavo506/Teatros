/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author Admin
 */
public class IncluirAdmin extends javax.swing.JFrame {

    JFrame principal;
    public WindowListener c = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            cerrar();
        }
    };
    /**
     * Creates new form IncluirAdmin
     * @param p
     */
    public IncluirAdmin(JFrame p) {
        initComponents();
        principal = p;
        cargarTeatros();
        this.addWindowListener(c);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    void cerrar(){
        this.dispose();
        principal.setVisible(true);
    }
    
    void cargarTeatros(){
        Teatros.selectTeatros(ComboTeatros);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ComboTeatros = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CrearAdmin = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();
        tConfirmPassword = new javax.swing.JPasswordField();
        tCorreo = new javax.swing.JTextField();
        tUsuario = new javax.swing.JTextField();
        tDirecci�n = new javax.swing.JTextField();
        tOtro = new javax.swing.JTextField();
        tCasa = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tCelular = new javax.swing.JTextField();
        tAnno = new javax.swing.JTextField();
        tMes = new javax.swing.JTextField();
        tDia = new javax.swing.JTextField();
        tCedula = new javax.swing.JTextField();
        tApellido = new javax.swing.JTextField();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar Teatro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboTeatros.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        ComboTeatros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTeatrosActionPerformed(evt);
            }
        });
        jPanel1.add(ComboTeatros, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 470, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Administrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 30, 800, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Teatro :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 240, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("C�dula :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 240, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha Nacimiento :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 240, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sexo :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 240, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Direcci�n :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 240, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("telCelular :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 240, 20));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("telCasa :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 240, 20));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("otroTel�fono :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 240, 20));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Correo :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 240, 20));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Usuario :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 240, 20));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Contrase�a :");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 240, 20));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Confirmar Contrase�a :");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 240, 20));

        CrearAdmin.setBackground(new java.awt.Color(51, 51, 51));
        CrearAdmin.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        CrearAdmin.setForeground(new java.awt.Color(255, 255, 255));
        CrearAdmin.setText("Crear Administrador");
        CrearAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearAdminActionPerformed(evt);
            }
        });
        jPanel1.add(CrearAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 810, 350, 80));

        tPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, 190, -1));

        tConfirmPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 760, 190, -1));

        tCorreo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 350, -1));

        tUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, 190, -1));

        tDirecci�n.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tDirecci�n, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 350, 30));

        tOtro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 140, 30));

        tCasa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 140, 30));

        tNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 350, 30));

        tCelular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 140, 30));

        tAnno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tAnno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 50, 30));

        tMes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 40, 30));

        tDia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 40, 30));

        tCedula.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 140, 30));

        tApellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(tApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 350, 30));

        Masculino.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(Masculino);
        Masculino.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Masculino.setForeground(new java.awt.Color(255, 255, 255));
        Masculino.setSelected(true);
        Masculino.setText("Masculino");
        jPanel1.add(Masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        Femenino.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(Femenino);
        Femenino.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Femenino.setForeground(new java.awt.Color(255, 255, 255));
        Femenino.setText("Femenino");
        jPanel1.add(Femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoIncAdmin.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTeatrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTeatrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTeatrosActionPerformed

    @SuppressWarnings("deprecation")
    private void CrearAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearAdminActionPerformed
        String teatro, nombre, apellido, cedula, sexo, direccion, telCelular, telCasa, telOtro, correo, user, pass, passConf, dia, mes, anno;
        Date nacimiento = null;
        
        //Toma de datos
        teatro = ComboTeatros.getSelectedItem().toString();
        nombre = tNombre.getText();
        apellido = tApellido.getText();
        cedula = tCedula.getText();
        
        dia = tDia.getText();
        mes = tMes.getText();
        anno = tAnno.getText();
        
        
        if(Masculino.isSelected())
            sexo = "m";
        else
            sexo = "f";
        
        direccion = tDirecci�n.getText();
        telCelular = tCelular.getText();
        telCasa = tCasa.getText();
        telOtro = tOtro.getText();
        correo = tCorreo.getText();
        user = tUsuario.getText();
        pass = tPassword.getText();
        passConf = tConfirmPassword.getText();
        

        if(!comprobar(nombre, apellido, cedula, dia, mes, anno,direccion, telCelular, telCasa, telOtro, correo, user, pass, passConf)){
            return;
        }
        
        try{
            nacimiento = Date.valueOf(anno + "-" + mes + "-" + dia);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Fecha de nacimiento inv�lido", "Advertencia",0);
        }
        

        boolean state = Teatros.InsertAdmin(this, teatro, nombre + " " + apellido, cedula, sexo, nacimiento, direccion, telCelular, telCasa, telOtro, correo, user, pass);
        
        if(!state){
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Administrador agregado exitosamente", "Info",1);
        cerrar();

        
    }//GEN-LAST:event_CrearAdminActionPerformed

    boolean comprobar(String nombre, String apellido, String cedula, String dia, String mes, String anno, String direccion, String telCelular, String telCasa, String telOtro, String correo, String user, String pass, String passConf){
        //Valida que los campos no est�n vac�os
        if(nombre.trim().isEmpty() || apellido.trim().isEmpty() || cedula.trim().isEmpty() || dia.trim().isEmpty() || mes.trim().isEmpty() || anno.trim().isEmpty() || direccion.trim().isEmpty() || telCelular.trim().isEmpty() || correo.trim().isEmpty() || user.trim().isEmpty() || pass.trim().isEmpty() || passConf.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Hay datos obligatorios sin llenar", "Advertencia",0);
            
        //Valida la cedula
        }else if(!(cedula.length() == 9 && Teatros.isNumeric(cedula))){
            JOptionPane.showMessageDialog(this, "C�dula inv�lida", "Advertencia",0);
            
        //Valida el celular
        }else if(!(!"0".equals(telCelular.substring(0, 1)) && telCelular.length() == 8 && Teatros.isNumeric(telCelular))){
            JOptionPane.showMessageDialog(this, "Tel�fono celular inv�lido", "Advertencia",0);
            
        //Valida el telefono de la casa
        }else if(!(telCasa.trim().isEmpty() || (!"0".equals(telCasa.substring(0, 1)) && telCasa.length() == 8 && Teatros.isNumeric(telCasa)))){
            JOptionPane.showMessageDialog(this, "Tel�fono casa inv�lido", "Advertencia",0);
            
        //Valida el telefono extra
        }else if(!(telOtro.trim().isEmpty() || (!"0".equals(telOtro.substring(0, 1)) && telOtro.length() == 8 && Teatros.isNumeric(telOtro)))){
            JOptionPane.showMessageDialog(this, "Otro tel�fono inv�lido", "Advertencia",0);
            
        }else if(!(pass.equals(passConf))){
            JOptionPane.showMessageDialog(this, "La confirmaci�n de la contrase�a no coincide", "Advertencia",0);
            
        }else{
            return true;
        }
        
        return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncluirAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncluirAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncluirAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncluirAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncluirAdmin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTeatros;
    private javax.swing.JButton CrearAdmin;
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JLabel Fondo;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tAnno;
    private javax.swing.JTextField tApellido;
    private javax.swing.JTextField tCasa;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tCelular;
    private javax.swing.JPasswordField tConfirmPassword;
    private javax.swing.JTextField tCorreo;
    private javax.swing.JTextField tDia;
    private javax.swing.JTextField tDirecci�n;
    private javax.swing.JTextField tMes;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tOtro;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
}
