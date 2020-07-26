/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatros;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author iFreuk
 */
public class Bloques extends javax.swing.JFrame {

    /**
     * Creates new form Bloques
     */
    private String teatro;
    public Bloques(String ObraName, String Teatro) {
        this.teatro = Teatro;
        initComponents();
        Titulo.setText(ObraName);
        CargaBloques(ObraName, Teatro);
        
        
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBloques = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        Comprar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaBloques.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TablaBloques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha                  Hora                            ", "Bloque", "Precio"
            }
        ));
        jScrollPane1.setViewportView(TablaBloques);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 700, 430));

        Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        Comprar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Comprar.setForeground(new java.awt.Color(0, 0, 0));
        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        getContentPane().add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        String Bloque = TablaBloques.getValueAt(TablaBloques.getSelectedRow(), 1).toString();
        int Precio = Integer.parseInt(TablaBloques.getValueAt(TablaBloques.getSelectedRow(), 2).toString());
        new PagoFilas(Titulo.getText() + " - Bloque: " + Bloque, Precio, teatro, Bloque, Titulo.getText());
    }//GEN-LAST:event_ComprarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], String ObraName, String Teatro) {
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
            java.util.logging.Logger.getLogger(Bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bloques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bloques(ObraName, Teatro).setVisible(true);
            }
        });
    }
    public void CargaBloques(String ObraName, String Teatro){
    DefaultTableModel modelo = (DefaultTableModel) TablaBloques.getModel();
        try {
            Agente.VerPresentaciones(ObraName, Teatro, modelo);
            
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(modelo);
            TablaBloques.setRowSorter(sorter);

            List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);
        } catch (SQLException ex) {
            Logger.getLogger(Cartelera.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    public static javax.swing.JTable TablaBloques;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}