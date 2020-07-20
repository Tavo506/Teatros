/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class IncluirTeatro extends javax.swing.JFrame {
    JFrame principal;
    public WindowListener c = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            cerrar();
        }
    };
    
    
    /**
     * Creates new form IncluirTeatro
     * @param p
     */
    public IncluirTeatro(JFrame p) {
        initComponents();
        principal = p;
        PanelAsientos.setVisible(false);
        this.addWindowListener(c);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    void cerrar(){
        this.dispose();
        principal.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAsientos = new javax.swing.JPanel();
        BGuardar = new javax.swing.JButton();
        BAnterior = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tBloque = new javax.swing.JTextField();
        AgregarBloque = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        PanelDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BSiguiente = new javax.swing.JButton();
        tNombre = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        tCorreo = new javax.swing.JTextField();
        tWeb = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Insertar Teatro");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAsientos.setBackground(new java.awt.Color(0, 102, 51));
        PanelAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGuardar.setBackground(new java.awt.Color(51, 51, 51));
        BGuardar.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        BGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });
        PanelAsientos.add(BGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        BAnterior.setBackground(new java.awt.Color(51, 51, 51));
        BAnterior.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BAnterior.setForeground(new java.awt.Color(255, 255, 255));
        BAnterior.setText("Anterior");
        BAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnteriorActionPerformed(evt);
            }
        });
        PanelAsientos.add(BAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Filas :");
        PanelAsientos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 30));

        tBloque.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tBloque.setForeground(new java.awt.Color(255, 255, 255));
        PanelAsientos.add(tBloque, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 72, 420, -1));

        AgregarBloque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonMas.png"))); // NOI18N
        AgregarBloque.setBorderPainted(false);
        AgregarBloque.setFocusPainted(false);
        AgregarBloque.setPreferredSize(new java.awt.Dimension(37, 37));
        AgregarBloque.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonMasP.png"))); // NOI18N
        AgregarBloque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBloqueActionPerformed(evt);
            }
        });
        PanelAsientos.add(AgregarBloque, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Bloque :");
        PanelAsientos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 30));

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PanelAsientos.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 260, 30));

        getContentPane().add(PanelAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 600));

        PanelDatos.setBackground(new java.awt.Color(0, 102, 102));
        PanelDatos.setPreferredSize(new java.awt.Dimension(700, 600));
        PanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre :");
        PanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Direcci�n :");
        PanelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tel�fono :");
        PanelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Correo :");
        PanelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sitio web :");
        PanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 40));

        BSiguiente.setBackground(new java.awt.Color(51, 51, 51));
        BSiguiente.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        BSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        BSiguiente.setText("Siguiente");
        BSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSiguienteActionPerformed(evt);
            }
        });
        PanelDatos.add(BSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        tNombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PanelDatos.add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 420, 40));

        tDireccion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PanelDatos.add(tDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 420, 40));

        tTelefono.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PanelDatos.add(tTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, 40));

        tCorreo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PanelDatos.add(tCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 420, 40));

        tWeb.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        PanelDatos.add(tWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 420, 40));

        getContentPane().add(PanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Teatro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSiguienteActionPerformed
        PanelDatos.setVisible(false);
        PanelAsientos.setVisible(true);
    }//GEN-LAST:event_BSiguienteActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnteriorActionPerformed
        PanelAsientos.setVisible(false);
        PanelDatos.setVisible(true);
    }//GEN-LAST:event_BAnteriorActionPerformed

    private void AgregarBloqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBloqueActionPerformed

        
    }//GEN-LAST:event_AgregarBloqueActionPerformed

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
            java.util.logging.Logger.getLogger(IncluirTeatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncluirTeatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncluirTeatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncluirTeatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncluirTeatro(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBloque;
    private javax.swing.JButton BAnterior;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BSiguiente;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelAsientos;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tBloque;
    private javax.swing.JTextField tCorreo;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    private javax.swing.JTextField tWeb;
    // End of variables declaration//GEN-END:variables
}
