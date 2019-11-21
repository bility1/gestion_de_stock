
package base_de_donnee;

import Application.BDD;
import Application.Parameter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class FenConnection extends javax.swing.JFrame {

 ResultSet rs;
    BDD db;
    String username1,password1,hak;
    public FenConnection() {

       db = new BDD(new Parameter().HOST_DB,new Parameter().USERNAME_DB,
             new Parameter().PASSWORD_DB,new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        setSize(448, 261);
        setResizable(false);
        setLocationRelativeTo(null);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtutilisateur = new javax.swing.JTextField();
        btnvalider = new javax.swing.JButton();
        btnfermer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("PAGE DE CONNECTION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 170, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Nom d'utilisateur :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 70, 150, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Mot de passe :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 160, 30);

        txtutilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtutilisateurActionPerformed(evt);
            }
        });
        getContentPane().add(txtutilisateur);
        txtutilisateur.setBounds(240, 70, 150, 30);

        btnvalider.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnvalider.setText("VALIDER");
        btnvalider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvaliderActionPerformed(evt);
            }
        });
        getContentPane().add(btnvalider);
        btnvalider.setBounds(70, 170, 120, 30);

        btnfermer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfermer.setText("fermer");
        btnfermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfermerActionPerformed(evt);
            }
        });
        getContentPane().add(btnfermer);
        btnfermer.setBounds(280, 170, 100, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("UNIVERSITE D'ARTOIS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 20, 170, 30);

        jlabel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jlabel);
        jlabel.setBounds(310, 70, 150, 30);
        getContentPane().add(txtpass);
        txtpass.setBounds(240, 120, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/fac.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 440, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnfermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfermerActionPerformed
        dispose();
    }//GEN-LAST:event_btnfermerActionPerformed

    private void btnvaliderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvaliderActionPerformed
        rs = db.querySelectAll("utilisateur","username ='"+ txtutilisateur.getText()
            + "' and password ='"+txtpass.getText()+"'");
        try {
            while (rs.next()) {
                username1 = rs.getString("username");
                password1 = rs.getString("password");
                hak = rs.getString("type");
            }
        }catch (SQLException ex){
            Logger.getLogger(FenConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
        if (username1 == null && password1 ==null) {
            JOptionPane.showMessageDialog(this,"le nom d'utilisateur ou mot de pass est incorrecte");
            jlabel.setText("erreur d'utilisateur");
            jlabel.setVisible(true);
        }else {
            if (hak.equals("directeur") || hak.equals("agent")){
                Principale h = new Principale();
                h.setVisible(true);
                this.dispose();
            }else {
                Cachier k = new Cachier();
                k.setVisible(true);
                this.dispose();

            }
        }
    }//GEN-LAST:event_btnvaliderActionPerformed

    private void txtutilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtutilisateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtutilisateurActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenConnection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfermer;
    private javax.swing.JButton btnvalider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlabel;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtutilisateur;
    // End of variables declaration//GEN-END:variables

     
}