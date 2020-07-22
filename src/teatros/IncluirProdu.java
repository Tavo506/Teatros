/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class IncluirProdu extends javax.swing.JFrame {
    JFrame principal;
    public WindowListener c = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            cerrar();
        }
    };  
    /**
     * Creates new form IncluirAgente
     */
    public IncluirProdu(JFrame p) {
        initComponents();
        TeatroLabel.setText(Teatros.Teatro);
        principal = p;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TeatroLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDesc = new javax.swing.JTextArea();
        tNombre = new javax.swing.JTextField();
        bCrearProdu = new javax.swing.JButton();
        cEstado = new javax.swing.JComboBox<>();
        cTipo = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Incluir Producci�n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Producci�n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 30, 650, -1));

        TeatroLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        TeatroLabel.setForeground(new java.awt.Color(255, 255, 255));
        TeatroLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeatroLabel.setText("<Teatro>");
        jPanel1.add(TeatroLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 650, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 180, 210, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estado :");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 210, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Descripci�n :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo :");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 210, -1));

        tDesc.setColumns(20);
        tDesc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tDesc.setLineWrap(true);
        tDesc.setRows(5);
        jScrollPane1.setViewportView(tDesc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 350, 110));

        tNombre.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jPanel1.add(tNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 350, 40));

        bCrearProdu.setBackground(new java.awt.Color(51, 51, 51));
        bCrearProdu.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        bCrearProdu.setForeground(new java.awt.Color(255, 255, 255));
        bCrearProdu.setText("Crear Producci�n");
        bCrearProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearProduActionPerformed(evt);
            }
        });
        jPanel1.add(bCrearProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 360, 100));

        cEstado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confidencial", "Adelantada", "Anunciada", "Abierta" }));
        jPanel1.add(cEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 190, 40));

        cTipo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danza", "M�sica", "Teatro", "Otros" }));
        jPanel1.add(cTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 725));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoIncProd.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearProduActionPerformed
        String nombre, descripcion, tipo, estado;
        
        nombre = tNombre.getText();
        descripcion = tDesc.getText();
        tipo = cTipo.getSelectedItem().toString();
        estado = cEstado.getSelectedItem().toString();
        
        if(nombre.trim().isEmpty() || descripcion.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "No deben haber campos vac�os", "Advertencia",0);
            return;
        }
        
        try{
            Teatros.insertProduccion(this, Teatros.Teatro, nombre, descripcion, tipo, estado);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "La producci�n ya existe", "Advertencia",0);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Producci�n agregada", "Advertencia",1);
        cerrar();
    }//GEN-LAST:event_bCrearProduActionPerformed

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
            java.util.logging.Logger.getLogger(IncluirProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncluirProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncluirProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncluirProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncluirProdu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel TeatroLabel;
    private javax.swing.JButton bCrearProdu;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JComboBox<String> cTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tDesc;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables
}