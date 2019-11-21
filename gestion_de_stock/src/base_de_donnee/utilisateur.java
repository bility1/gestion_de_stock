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
import javax.swing.JOptionPane;

public class utilisateur extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
    public utilisateur() {
        db = new BDD(new Parameter().HOST_DB,new Parameter().USERNAME_DB,
             new Parameter().PASSWORD_DB,new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
       table();
       setSize(682, 440);
       setResizable(false);
        setLocationRelativeTo(null);
    }

   public void table(){
       String a[] = {"id","id_user","username","password","type"};
       rs = db.querySelect(a, "utilisateur");
       table_user.setModel(new ResultSetTableModel(rs));
   }
   void actualiser (){
       txtid.setText("");
       txtus.setText("");
       txtps.setText("");
       comty.setSelectedItem("type");
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        btnajouter = new javax.swing.JButton();
        btnmodifier = new javax.swing.JButton();
        btnsupprimer = new javax.swing.JButton();
        btnactualiser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtus = new javax.swing.JTextField();
        txtps = new javax.swing.JTextField();
        btnrecherche = new javax.swing.JButton();
        txtrecher = new javax.swing.JTextField();
        comty = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comCatego = new javax.swing.JComboBox<>();
        btnacceuil = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("         GESTION DU PERSONNEL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 290, 40);

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "id_user", "username", "password", "type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_user);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 40, 580, 100);

        btnajouter.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/enregistrer.jpg"))); // NOI18N
        btnajouter.setText("Ajouter");
        btnajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnajouterActionPerformed(evt);
            }
        });
        getContentPane().add(btnajouter);
        btnajouter.setBounds(50, 150, 140, 43);

        btnmodifier.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/modifier.jpg"))); // NOI18N
        btnmodifier.setText("Modifier");
        btnmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifierActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodifier);
        btnmodifier.setBounds(200, 150, 140, 43);

        btnsupprimer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnsupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/supprimer.jpg"))); // NOI18N
        btnsupprimer.setText("Supprimer");
        btnsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(btnsupprimer);
        btnsupprimer.setBounds(350, 150, 150, 43);

        btnactualiser.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnactualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/actualiser.jpg"))); // NOI18N
        btnactualiser.setText("actualiser");
        btnactualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualiserActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualiser);
        btnactualiser.setBounds(510, 150, 160, 43);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Rechercher par Catégorie");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 230, 210, 40);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Utilisateur");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 260, 110, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Mot de pass");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 320, 110, 20);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 370, 120, 30);

        txtid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtidMouseClicked(evt);
            }
        });
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(140, 210, 150, 40);
        getContentPane().add(txtus);
        txtus.setBounds(140, 260, 150, 40);

        txtps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpsActionPerformed(evt);
            }
        });
        getContentPane().add(txtps);
        txtps.setBounds(140, 310, 150, 40);

        btnrecherche.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnrecherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/rechercher.jpg"))); // NOI18N
        btnrecherche.setText("Recherche");
        btnrecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrechercheActionPerformed(evt);
            }
        });
        getContentPane().add(btnrecherche);
        btnrecherche.setBounds(310, 300, 150, 43);

        txtrecher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrecherActionPerformed(evt);
            }
        });
        getContentPane().add(txtrecher);
        txtrecher.setBounds(490, 300, 160, 40);

        comty.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        comty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "directeur", "agent", " ", " " }));
        getContentPane().add(comty);
        comty.setBounds(150, 360, 120, 40);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("id_utilisateur");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 210, 110, 30);

        comCatego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_user", "username", "password", "type" }));
        getContentPane().add(comCatego);
        comCatego.setBounds(530, 230, 140, 40);

        btnacceuil.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnacceuil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/retour.jpg"))); // NOI18N
        btnacceuil.setText("Retour");
        btnacceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceuilActionPerformed(evt);
            }
        });
        getContentPane().add(btnacceuil);
        btnacceuil.setBounds(500, 360, 150, 43);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/personnel.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 680, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnrechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrechercheActionPerformed
       if (txtrecher.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP veuillez saisir la donnee");
        } else {
            if (comCatego.getSelectedItem().equals("id_user")) {
                rs = db.querySelectAll("utilisateur", "id_user LIKE '%" + txtrecher.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (comCatego.getSelectedItem().equals("username")) {
                rs = db.querySelectAll("utilisateur", "username LIKE '%" + txtrecher.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (comCatego.getSelectedItem().equals("password")) {
                rs = db.querySelectAll("utilisateur", "password LIKE '%" + txtrecher.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            } else if (comCatego.getSelectedItem().equals("type")) {
                rs = db.querySelectAll("utilisateur", "type LIKE '%" + txtrecher.getText() + "%' ");
                table_user.setModel(new ResultSetTableModel(rs));
            }
        } 
    }//GEN-LAST:event_btnrechercheActionPerformed

    private void btnajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnajouterActionPerformed
        if (txtid.getText().equals("") || txtus.getText().equals("") || txtps.getText().equals("")
                || comty.getSelectedItem().equals("type")) {
            JOptionPane.showMessageDialog(this, "veillez saisir les informations completes");
        }else {
            String [] colon = {"id_user","username","password","type"};
            String [] inf = {txtid.getText(),txtus.getText(),txtps.getText(),comty.getSelectedItem().toString()};
            System.out.println(db.queryInsert("utilisateur", colon,inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_btnajouterActionPerformed

    private void btnmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifierActionPerformed
        if (txtid.getText().equals("") || txtus.getText().equals("") || txtps.getText().equals("")
                || comty.getSelectedItem().equals("type")) {
            JOptionPane.showMessageDialog(this, "veillez saisir les informations completes");
        }else {
            String [] colon = {"id_user","username","password","type"};
            String [] inf = {txtid.getText(),txtus.getText(),txtps.getText(),comty.getSelectedItem().toString()};
            String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(),0));
            System.out.println(db.queryUpdate("utilisateur", colon,inf,"id='"+ id +"'"));
            table();
            actualiser();
        }
    }//GEN-LAST:event_btnmodifierActionPerformed

    private void btnsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupprimerActionPerformed
        String id = String.valueOf(table_user.getValueAt(table_user.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "etes vous sur de vouloir supprimer ","Attention!!!",
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("utilisateur","id="+ id);
        }else {
            return ;
        }
        table();
    }//GEN-LAST:event_btnsupprimerActionPerformed

    private void btnactualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualiserActionPerformed
       actualiser();
       table();
    }//GEN-LAST:event_btnactualiserActionPerformed

    private void txtpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpsActionPerformed

    private void txtrecherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrecherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrecherActionPerformed

    private void txtidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidMouseClicked

    private void table_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userMouseClicked
        this.txtid.setText(String.valueOf(this.table_user.getValueAt(this.table_user.getSelectedRow(),1)));
        this.txtus.setText(String.valueOf(this.table_user.getValueAt(this.table_user.getSelectedRow(),2)));
        this.txtps.setText(String.valueOf(this.table_user.getValueAt(this.table_user.getSelectedRow(),3)));
        this.comty.setSelectedItem(String.valueOf(this.table_user.getValueAt(this.table_user.getSelectedRow(),4)));
    }//GEN-LAST:event_table_userMouseClicked

    private void btnacceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceuilActionPerformed
        Principale k = new Principale();
        k.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnacceuilActionPerformed

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
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceuil;
    private javax.swing.JButton btnactualiser;
    private javax.swing.JButton btnajouter;
    private javax.swing.JButton btnmodifier;
    private javax.swing.JButton btnrecherche;
    private javax.swing.JButton btnsupprimer;
    private javax.swing.JComboBox<String> comCatego;
    private javax.swing.JComboBox<String> comty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtps;
    private javax.swing.JTextField txtrecher;
    private javax.swing.JTextField txtus;
    // End of variables declaration//GEN-END:variables
}
