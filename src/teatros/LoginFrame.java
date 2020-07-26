/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        Password.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                Login();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Password = new javax.swing.JPasswordField();
        User = new javax.swing.JTextField();
        TeatrosText = new javax.swing.JLabel();
        TeatrosTextB = new javax.swing.JLabel();
        UserText = new javax.swing.JLabel();
        UserTextB = new javax.swing.JLabel();
        PassText = new javax.swing.JLabel();
        PassTextB = new javax.swing.JLabel();
        BotonLogin = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Teatros");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        getContentPane().add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });
        getContentPane().add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        jPanel1.setBackground(new java.awt.Color(41, 40, 40));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Password.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 230, 50));

        User.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        User.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 104, 230, 50));

        TeatrosText.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TeatrosText.setForeground(new java.awt.Color(255, 255, 255));
        TeatrosText.setText("Teatros");
        jPanel1.add(TeatrosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        TeatrosTextB.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TeatrosTextB.setForeground(new java.awt.Color(0, 0, 0));
        TeatrosTextB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TeatrosTextB.setText("Teatros");
        jPanel1.add(TeatrosTextB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 180, 70));

        UserText.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        UserText.setForeground(new java.awt.Color(255, 255, 255));
        UserText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UserText.setText("User");
        jPanel1.add(UserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 160, 50));

        UserTextB.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        UserTextB.setForeground(new java.awt.Color(0, 0, 0));
        UserTextB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UserTextB.setText("User");
        jPanel1.add(UserTextB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 160, 60));

        PassText.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        PassText.setForeground(new java.awt.Color(255, 255, 255));
        PassText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PassText.setText("Password");
        jPanel1.add(PassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, 50));

        PassTextB.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        PassTextB.setForeground(new java.awt.Color(0, 0, 0));
        PassTextB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PassTextB.setText("Password");
        jPanel1.add(PassTextB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, 60));

        BotonLogin.setBackground(new java.awt.Color(51, 51, 51));
        BotonLogin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BotonLogin.setForeground(new java.awt.Color(255, 255, 255));
        BotonLogin.setText("Login");
        BotonLogin.setFocusPainted(false);
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BotonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 230, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 550, 360));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FondoLogin.png"))); // NOI18N
        Fondo.setToolTipText("");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        Login();
    }//GEN-LAST:event_BotonLoginActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        Teatros.Login("aperez", "ova4Che");
        Teatros.Connect("LoginAdmin", "AdminLog");
        new AdminTeatro();
        this.dispose();
    }//GEN-LAST:event_TActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        Teatros.Login("aconejo", "Con4Use");
        Teatros.Connect("LoginSis", "SistemLog");
        new AdminSistema();
        this.dispose();
    }//GEN-LAST:event_SActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        Teatros.Login("jramos", "Efacha2");
        Teatros.Connect("LoginAgent", "AgenteLog");
        new Agente();
        this.dispose();
    }//GEN-LAST:event_AActionPerformed

    void Login(){
        String user = User.getText();
        String pass = Password.getText();
        
        String tipo = Teatros.Login(user, pass);
        
        if(tipo == null){
            JOptionPane.showMessageDialog(this, "Usuario o contraseņa incorrecta", "Advertencia",0);
            return;
        }else if("AdminSis".equals(tipo)){
            Teatros.Connect("LoginSis", "SistemLog");
            new AdminSistema();
        }else if("AdminTeatro".equals(tipo)){
            Teatros.Connect("LoginAdmin", "AdminLog");
            new AdminTeatro();
        }else if("Agente".equals(tipo)){
            Teatros.Connect("LoginAgent", "AgenteLog");
            new Agente();
        }
            this.dispose();
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel PassText;
    private javax.swing.JLabel PassTextB;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JLabel TeatrosText;
    private javax.swing.JLabel TeatrosTextB;
    private javax.swing.JTextField User;
    private javax.swing.JLabel UserText;
    private javax.swing.JLabel UserTextB;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
