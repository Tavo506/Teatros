/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class CambiarPrecios extends javax.swing.JFrame {
    JFrame principal;
    DefaultTableModel modelo;
    ArrayList<Object[]> costos;
    String obra;
    
    public WindowListener c = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            cerrar();
        }
    };  
    /**
     * Creates new form IncluirAgente
     * @param p
     * @param produ
     * @param precio
     */
    public CambiarPrecios(JFrame p, String produ, ArrayList<Object[]> precio) {
        initComponents();
        principal = p;
        modelo = (DefaultTableModel) tablaPrecios.getModel();
        costos = precio;
        obra = produ;
        for(Object[] c : precio){
            modelo.addRow(c);
        }
        
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrecios = new javax.swing.JTable();
        bGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cambiar Precios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cambiar Precios Presentaci�n");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, -1));

        tablaPrecios.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        tablaPrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bloque", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPrecios.setRowHeight(40);
        tablaPrecios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPrecios);
        if (tablaPrecios.getColumnModel().getColumnCount() > 0) {
            tablaPrecios.getColumnModel().getColumn(0).setResizable(false);
            tablaPrecios.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 420, 230));

        bGuardar.setBackground(new java.awt.Color(51, 51, 51));
        bGuardar.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        bGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(bGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        boolean cambio = false;
        int monto;
        for(int i = 0; i < modelo.getRowCount(); i++){
            monto = (int)modelo.getValueAt(i, 1);
            
            if(monto != (int)costos.get(i)[1]){
                cambio = true;
                Teatros.updatePrecio(Teatros.Teatro, obra, modelo.getValueAt(i, 0).toString(), monto);
                costos.get(i)[1] = monto;
            }
        }
        
        if(!cambio){
            JOptionPane.showMessageDialog(this, "No hubieron datos qu� guardar", "Info", 1);
        }else{
            JOptionPane.showMessageDialog(this, "Datos actualizados", "Info", 1);
            Teatros.setBuffer(new Object[]{1,2});
        }
        cerrar();
    }//GEN-LAST:event_bGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarPrecios(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPrecios;
    // End of variables declaration//GEN-END:variables
}
