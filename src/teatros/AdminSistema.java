/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

/**
 *
 * @author Admin
 */
public class AdminSistema extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public AdminSistema() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IncTeatroB = new javax.swing.JButton();
        IncAdminB = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador del Sistema");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(102, 0, 0));
        Panel.setMinimumSize(new java.awt.Dimension(900, 720));
        Panel.setOpaque(false);
        Panel.setPreferredSize(new java.awt.Dimension(650, 720));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrar Sistema");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 650, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrar Sistema");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 650, 70));

        IncTeatroB.setBackground(new java.awt.Color(51, 51, 51));
        IncTeatroB.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        IncTeatroB.setForeground(new java.awt.Color(255, 255, 255));
        IncTeatroB.setText("Incluir Teatro");
        IncTeatroB.setToolTipText("Incluir un nuevo teatro");
        IncTeatroB.setFocusPainted(false);
        IncTeatroB.setPreferredSize(new java.awt.Dimension(280, 93));
        Panel.add(IncTeatroB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 390, 140));

        IncAdminB.setBackground(new java.awt.Color(51, 51, 51));
        IncAdminB.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        IncAdminB.setForeground(new java.awt.Color(255, 255, 255));
        IncAdminB.setText("Incluir Administrador");
        IncAdminB.setToolTipText("Incluir un nuevo administrador para un teatro");
        IncAdminB.setFocusPainted(false);
        IncAdminB.setPreferredSize(new java.awt.Dimension(280, 93));
        Panel.add(IncAdminB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 390, 140));

        Cerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Cerrar.setText("Cerrar Sesi�n");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        Panel.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, -1, -1));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoAdminSis.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
        new LoginFrame();
    }//GEN-LAST:event_CerrarActionPerformed

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
            java.util.logging.Logger.getLogger(AdminSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton IncAdminB;
    private javax.swing.JButton IncTeatroB;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}