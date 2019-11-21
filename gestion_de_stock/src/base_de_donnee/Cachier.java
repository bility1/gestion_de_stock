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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Cachier extends javax.swing.JFrame {

    ResultSet rs;
    BDD db;
    int old,dec,now;
    public Cachier() {
        db = new BDD(new Parameter().HOST_DB, new Parameter().USERNAME_DB, new Parameter().PASSWORD_DB, 
                new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
        jam();
        setSize(865, 783);
        setLocationRelativeTo(null);
    }
public void table() {
        String t[] = {"code_prod","reference","designation","rangement","fournisseur","remise","prix","stock"};
        rs = db.querySelect(t, "produit");
        table_prod.setModel(new ResultSetTableModel(rs));
    }
    
    public void importer() {
        String colon[] = {"num_fac","code_prod","reference","prix_vente","stock_sortie","subtotal"};
        rs = db.fcSelectCommand(colon, "vente", "num_fac='" + txt_fac.getText() + "'");
        table_vente.setModel(new ResultSetTableModel(rs));
    }
    public void jam() {
        Date s = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        lbl1.setText(jam.format(s));
        lbl2.setText(tgl.format(s));}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_prod = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comrech = new javax.swing.JComboBox<>();
        btnrech = new javax.swing.JButton();
        txtrech = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcode_prod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtreference = new javax.swing.JTextField();
        txtrangement = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfournisseur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprix = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtremise = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnouveauP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtstockS = new javax.swing.JTextField();
        lbltot1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_fac = new javax.swing.JTextField();
        btn_rech = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_vente = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lbltot2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtmontant = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnimprimer = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        btnretour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("LE CAHIER DE CHARGE");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 10, 170, 40);

        lbl1.setFont(new java.awt.Font("Tunga", 3, 14)); // NOI18N
        jPanel1.add(lbl1);
        lbl1.setBounds(540, 30, 140, 30);

        lbl2.setFont(new java.awt.Font("Tunga", 3, 14)); // NOI18N
        jPanel1.add(lbl2);
        lbl2.setBounds(20, 30, 140, 30);

        table_prod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "code_produit", "reference", "designation", "rangement", "fournisseur", "remise", "prix", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_prod);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 850, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 190);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel3.setText("LE CAHIER DE CHARGE");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(300, 10, 170, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Rechercher par Categorie :");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel1);
        jLabel1.setBounds(50, 10, 190, 40);

        comrech.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        comrech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "code_prod", "reference", "designation", "rangement", "fournisseur", "remise", "prix", "stock", " ", " " }));
        jPanel3.add(comrech);
        comrech.setBounds(50, 60, 190, 20);

        btnrech.setText("Recherche");
        btnrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrechActionPerformed(evt);
            }
        });
        jPanel3.add(btnrech);
        btnrech.setBounds(10, 90, 110, 30);
        jPanel3.add(txtrech);
        txtrech.setBounds(140, 90, 140, 30);

        jLabel4.setText("code_produit");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 130, 110, 30);

        txtcode_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcode_prodActionPerformed(evt);
            }
        });
        jPanel3.add(txtcode_prod);
        txtcode_prod.setBounds(140, 130, 140, 30);

        jLabel5.setText("reference");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 170, 110, 30);
        jPanel3.add(txtreference);
        txtreference.setBounds(140, 170, 140, 30);

        txtrangement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrangementActionPerformed(evt);
            }
        });
        jPanel3.add(txtrangement);
        txtrangement.setBounds(140, 210, 140, 30);

        jLabel6.setText("rangement");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 210, 110, 30);
        jPanel3.add(txtfournisseur);
        txtfournisseur.setBounds(140, 250, 140, 30);

        jLabel7.setText("fournisseur");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 250, 110, 30);

        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });
        jPanel3.add(txtprix);
        txtprix.setBounds(140, 290, 140, 30);

        jLabel8.setText("prix");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(10, 290, 110, 30);

        jLabel9.setText("remise");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 330, 110, 30);
        jPanel3.add(txtremise);
        txtremise.setBounds(140, 330, 140, 30);

        jLabel10.setText("Nouveau Prix");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 370, 110, 30);
        jPanel3.add(txtnouveauP);
        txtnouveauP.setBounds(140, 370, 140, 30);

        jLabel11.setText("Stock Sortie");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 410, 110, 30);

        txtstockS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstockSKeyReleased(evt);
            }
        });
        jPanel3.add(txtstockS);
        txtstockS.setBounds(140, 410, 140, 30);

        lbltot1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltot1.setText("0");
        jPanel3.add(lbltot1);
        lbltot1.setBounds(140, 450, 140, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("RP  :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 450, 120, 20);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton2.setText("Faire Ajout au Produit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(70, 480, 180, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 190, 290, 520);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 837));
        jPanel2.setLayout(null);

        jLabel12.setText("Num de Facture");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 10, 110, 30);
        jPanel2.add(txt_fac);
        txt_fac.setBounds(130, 10, 140, 30);

        btn_rech.setText("Rechercher");
        btn_rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rechActionPerformed(evt);
            }
        });
        jPanel2.add(btn_rech);
        btn_rech.setBounds(280, 10, 110, 30);

        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(400, 10, 100, 30);

        table_vente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "num_Fac", "code_prod", "reference", "prix_de_vente", "stock_sortie", "subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_vente);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 530, 140);

        jLabel14.setFont(new java.awt.Font("Tunga", 3, 14)); // NOI18N
        jLabel14.setText("Total");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 190, 100, 30);

        lbltot2.setFont(new java.awt.Font("Tunga", 3, 14)); // NOI18N
        lbltot2.setText("0");
        jPanel2.add(lbltot2);
        lbltot2.setBounds(280, 190, 90, 30);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel15.setText("Montant :");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 230, 110, 30);

        txtmontant.setPreferredSize(new java.awt.Dimension(850, 830));
        txtmontant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmontantKeyReleased(evt);
            }
        });
        jPanel2.add(txtmontant);
        txtmontant.setBounds(140, 230, 140, 30);

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Payé après");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(290, 230, 110, 30);

        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });
        jPanel2.add(txtpay);
        txtpay.setBounds(410, 230, 140, 30);

        jButton5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton5.setText("Annuler");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(300, 290, 240, 40);

        btnimprimer.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnimprimer.setText("Imprimer");
        btnimprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimerActionPerformed(evt);
            }
        });
        jPanel2.add(btnimprimer);
        btnimprimer.setBounds(40, 290, 240, 40);

        lbl.setFont(new java.awt.Font("Tunga", 3, 14)); // NOI18N
        lbl.setText("RP");
        jPanel2.add(lbl);
        lbl.setBounds(160, 190, 90, 30);

        btnretour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnretour.setText("Retour au Menu principal");
        btnretour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretourActionPerformed(evt);
            }
        });
        jPanel2.add(btnretour);
        btnretour.setBounds(140, 390, 250, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(290, 190, 560, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrechActionPerformed
        if (txtrech .getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP veuillez saisir la donnee");
        } else {
            if (comrech.getSelectedItem().equals("code_prod")) {
                rs = db.querySelectAll("produit", "code_prod LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }   else if (comrech.getSelectedItem().equals("reference")) {
                rs = db.querySelectAll("produit", "reference LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
           
            } else if (comrech.getSelectedItem().equals("designation")) {
                rs = db.querySelectAll("produit", "designation LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            } else if (comrech.getSelectedItem().equals("rangement")) {
                rs = db.querySelectAll("produit", "rangement LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comrech.getSelectedItem().equals("fournisseur")) {
                rs = db.querySelectAll("produit", "fournisseur LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comrech.getSelectedItem().equals("remise")) {
                rs = db.querySelectAll("produit", "remise LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comrech.getSelectedItem().equals("prix")) {
                rs = db.querySelectAll("produit", "prix LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }else if (comrech.getSelectedItem().equals("stock")) {
                rs = db.querySelectAll("produit", "stock LIKE '%" + txtrech.getText() + "%' ");
                table_prod.setModel(new ResultSetTableModel(rs));
            }
        } 
    }//GEN-LAST:event_btnrechActionPerformed

    private void txtcode_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcode_prodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcode_prodActionPerformed

    private void txtrangementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrangementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrangementActionPerformed

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtcode_prod.getText().equals("") || txtreference.getText().equals("") || txtrangement.getText().equals("")
                || txtfournisseur.getText().equals("") || txtremise.getText().equals("") || txtprix.getText().equals("") 
                || txtnouveauP.getText().equals("")|| txtstockS.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les info");
        } else if (txt_fac.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer le num de facture");
        } else {
            String[] colon = {"num_fac","code_prod", "reference", "prix_vente", "stock_sortie", "subtotal"};
            String[] isi = {txt_fac.getText(), txtcode_prod.getText(), txtreference.getText(),
                txtnouveauP.getText(), txtstockS.getText(),
                lbltot1.getText()};
            System.out.println(db.queryInsert("vente", colon, isi));
            try {
                if (!test_stock()) { 
                    JOptionPane.showMessageDialog(this, "le stock est Limite");
                } else {
                    def(); //true
                    table(); //true
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cachier.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("\n"+ex);
            }
            subtotal();
            importer();
            total();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rechActionPerformed
        importer(); total();
    }//GEN-LAST:event_btn_rechActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String id = String.valueOf(table_vente.getValueAt(table_vente.getSelectedRow(),0));
        if (JOptionPane.showConfirmDialog(this,"est ce que tu es sure que tu veux supprimer ",
                "attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("vente", "num_fac=" + id);
        } else {
            return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String invoice = txt_fac.getText();
        if (JOptionPane.showConfirmDialog(this,"est ce que tu es sure de vouloir annule ","attention", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            db.queryDelete("vente", "num_fac=" + invoice);
        } else {
            return;
        }
        importer();
        total();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnimprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimerActionPerformed
        recu d = new recu();d.setVisible(true);
    }//GEN-LAST:event_btnimprimerActionPerformed

    private void txtstockSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockSKeyReleased
        subtotal();
    }//GEN-LAST:event_txtstockSKeyReleased

    private void txtmontantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontantKeyReleased
        payapres();
    }//GEN-LAST:event_txtmontantKeyReleased

    private void table_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_prodMouseClicked
        txtcode_prod.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 0)));
        txtreference.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 1)));
        txtrangement.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 3)));
        txtfournisseur.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 4)));
        txtremise.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 5)));
        txtprix.setText(String.valueOf(table_prod.getValueAt(table_prod.getSelectedRow(), 6)));
       cout();
    }//GEN-LAST:event_table_prodMouseClicked

    private void btnretourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretourActionPerformed
        Principale a = new Principale();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnretourActionPerformed
 public void subtotal() {
        double a = Double.parseDouble(txtnouveauP.getText());
        double b = Double.parseDouble(txtstockS.getText());
        double c = a * b;
        lbltot1.setText(String.valueOf(c));}
   
    public boolean test_stock() throws SQLException {
        boolean teststock;
        rs = db.querySelectAll("produit","code_prod='" + txtcode_prod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stock");
        }
        dec = Integer.parseInt(txtstockS.getText());
        if (old < dec) {
            teststock = false;
        } else {
            teststock = true;
        }
        return teststock;
    }
 public void def() throws SQLException {
        rs = db.querySelectAll("produit", "code_prod='" + txtcode_prod.getText() + "'");
        while (rs.next()) {
            old = rs.getInt("stock");
        }
        dec = Integer.parseInt(txtstockS.getText());
        now = old - dec;
         String nvstock = Integer.toString(now);

        String a = String.valueOf(nvstock);
        String[] colon = {"stock"};
        String[] isi = {a};
        System.out.println(db.queryUpdate("produit", colon, isi, "code_prod='" + txtcode_prod.getText() + "'"));
    }
public void total() {
        rs = db.executionQuery("SELECT SUM(subtotal) as subtotal FROM vente WHERE num_fac = '" + txt_fac.getText() + "'");
        try {
            rs.next();
            lbltot2.setText(rs.getString("subtotal"));
        } catch (SQLException ex) {
            Logger.getLogger(Cachier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 public void payapres() {
        int a = Integer.parseInt(lbltot2.getText());
        int b = Integer.parseInt(txtmontant.getText());
        int c = b - a;
        txtpay.setText(Integer.toString(c));
    }
 public void cout() {
        double a = Double.parseDouble(txtprix.getText());
        double b = Double.parseDouble(txtremise.getText());
        double c = a - a * (b / 100);
        txtnouveauP.setText(String.valueOf(c));
    }
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
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cachier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cachier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_rech;
    private javax.swing.JButton btnimprimer;
    private javax.swing.JButton btnrech;
    private javax.swing.JButton btnretour;
    private javax.swing.JComboBox<String> comrech;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    public static javax.swing.JLabel lbl1;
    public static javax.swing.JLabel lbl2;
    public static javax.swing.JLabel lbltot1;
    public static javax.swing.JLabel lbltot2;
    private javax.swing.JTable table_prod;
    private javax.swing.JTable table_vente;
    public static javax.swing.JTextField txt_fac;
    private javax.swing.JTextField txtcode_prod;
    private javax.swing.JTextField txtfournisseur;
    public static javax.swing.JTextField txtmontant;
    private javax.swing.JTextField txtnouveauP;
    public static javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtprix;
    private javax.swing.JTextField txtrangement;
    private javax.swing.JTextField txtrech;
    private javax.swing.JTextField txtreference;
    private javax.swing.JTextField txtremise;
    private javax.swing.JTextField txtstockS;
    // End of variables declaration//GEN-END:variables
}
