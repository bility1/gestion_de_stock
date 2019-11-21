/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_de_donnee;



import Application.BDD;
import Application.Parameter;
import Application.ResultSetTableModel;
import java.sql.*;

public class recu extends javax.swing.JFrame {
 ResultSet rs;
    BDD db;
    public recu() {
         db = new BDD(new Parameter().HOST_DB,new Parameter().USERNAME_DB,
             new Parameter().PASSWORD_DB,new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        setSize(667, 460);
        setResizable(false);
        setLocationRelativeTo(null);
        importer();
        date();
    }
      public void importer() {
       String colon[] = {"num_fac","code_prod","reference","prix_vente","stock_sortie","subtotal"};
        rs = db.fcSelectCommand(colon, "vente", "num_fac='" + Cachier.txt_fac.getText() + "'");
        table_rec.setModel(new ResultSetTableModel(rs));
        lbltot.setText(Cachier.lbltot2.getText());
        lblM.setText(Cachier.txtmontant.getText());
        payapres();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_rec = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblheure = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPa = new javax.swing.JLabel();
        lbltot = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Recu de payement");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 20, 270, 50);

        table_rec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_fac", "code_prod", "reference", "prix_de_vente", "stock_sortie", "subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_rec);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 580, 100);

        jButton1.setFont(new java.awt.Font("Bodoni MT Black", 1, 11)); // NOI18N
        jButton1.setText("Imprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 260, 140, 40);

        jButton2.setFont(new java.awt.Font("Bodoni MT Black", 1, 11)); // NOI18N
        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 330, 140, 50);
        jPanel1.add(lblheure);
        lblheure.setBounds(300, 70, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel3.setText("Montant");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 310, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel4.setText("Montant Payé après");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 370, 130, 30);

        lblPa.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        lblPa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPa.setText("xxx");
        lblPa.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblPa);
        lblPa.setBounds(420, 370, 110, 30);

        lbltot.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        lbltot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltot.setText("xxx");
        jPanel1.add(lbltot);
        lbltot.setBounds(420, 260, 110, 30);

        lblM.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        lblM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblM.setText("xxx");
        jPanel1.add(lblM);
        lblM.setBounds(420, 320, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel5.setText("Total");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 250, 100, 40);
        jPanel1.add(lbldate);
        lbldate.setBounds(50, 70, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/recu.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 660, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 660, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.printComponents(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cachier p = new Cachier();p.setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
public void date(){
         
        lbldate.setText(Cachier.lbl1.getText());
        lblheure.setText(Cachier.lbl2.getText());
    }
    public void payapres() {
        int a = Integer.parseInt(Cachier.lbltot2.getText());
        int b = Integer.parseInt(Cachier.txtmontant.getText());
        int c = b - a;
        lblPa.setText(Integer.toString(c));
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
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblPa;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblheure;
    private javax.swing.JLabel lbltot;
    private javax.swing.JTable table_rec;
    // End of variables declaration//GEN-END:variables
}