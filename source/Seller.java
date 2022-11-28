/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class Seller extends javax.swing.JFrame {

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        SelectSeller();
    }
Connection Con = null;
Statement St = null;
public void SelectSeller(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            Rs = St.executeQuery("select * from supermarket.sellertbl");
            SellerTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SelGend = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JLabel();
        EditBtn = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JLabel();
        SearchNameLbl = new javax.swing.JTextField();
        FilterBtn = new javax.swing.JButton();
        SelAccount = new javax.swing.JLabel();
        SelPass = new javax.swing.JLabel();
        NewSelAcc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NewSelPass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("SELLERS LIST");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("GENDER");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("ACCOUNT");

        SelGend.setBackground(new java.awt.Color(255, 204, 255));
        SelGend.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        SelGend.setForeground(new java.awt.Color(0, 0, 0));
        SelGend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        SelGend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelGendActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("PASSWORD");

        SellerTable.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        SellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ACCOUNT", "PASSWORD", "GENDER"
            }
        ));
        SellerTable.setRowHeight(40);
        SellerTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        SellerTable.setSelectionForeground(new java.awt.Color(255, 204, 255));
        SellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellerTable);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 255));
        jLabel8.setText("MANAGING SELLER");

        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 204, 255));
        AddBtn.setText("ADD");
        AddBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 204, 255));
        EditBtn.setText("EDIT");
        EditBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 204, 255));
        DeleteBtn.setText("DELETE");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 204, 255));
        ClearBtn.setText("CLEAR");
        ClearBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        SearchNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        SearchNameLbl.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        SearchNameLbl.setForeground(new java.awt.Color(255, 204, 255));
        SearchNameLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNameLblActionPerformed(evt);
            }
        });

        FilterBtn.setBackground(new java.awt.Color(255, 204, 255));
        FilterBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        FilterBtn.setForeground(new java.awt.Color(0, 0, 0));
        FilterBtn.setText("Search");
        FilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterBtnMouseClicked(evt);
            }
        });
        FilterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBtnActionPerformed(evt);
            }
        });

        SelAccount.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        SelAccount.setForeground(new java.awt.Color(255, 204, 255));
        SelAccount.setText("SelAccount");

        SelPass.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        SelPass.setForeground(new java.awt.Color(255, 204, 255));
        SelPass.setText("SelPass");

        NewSelAcc.setBackground(new java.awt.Color(0, 0, 0));
        NewSelAcc.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        NewSelAcc.setForeground(new java.awt.Color(255, 204, 255));
        NewSelAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSelAccActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("NEW");

        NewSelPass.setBackground(new java.awt.Color(0, 0, 0));
        NewSelPass.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        NewSelPass.setForeground(new java.awt.Color(255, 204, 255));
        NewSelPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSelPassActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 255));
        jLabel10.setText("NEW");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(AddBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditBtn)
                        .addGap(163, 163, 163)
                        .addComponent(DeleteBtn)
                        .addGap(129, 129, 129)
                        .addComponent(ClearBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SearchNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelAccount)
                    .addComponent(NewSelAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(SelPass))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(NewSelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(272, 272, 272)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(370, 370, 370))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(83, 83, 83)
                        .addComponent(SelGend, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SearchNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(FilterBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(SelAccount)
                            .addComponent(SelPass))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NewSelAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NewSelPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel10)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelGend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(EditBtn)
                    .addComponent(AddBtn))
                .addGap(116, 116, 116))
        );

        ExitBtn.setBackground(new java.awt.Color(255, 204, 255));
        ExitBtn.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(0, 0, 0));
        ExitBtn.setText("X");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 204, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Admin");

        MenuBtn.setBackground(new java.awt.Color(255, 204, 255));
        MenuBtn.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(0, 0, 0));
        MenuBtn.setText("MENU");
        MenuBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MenuBtn)
                        .addGap(59, 59, 59)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1323, Short.MAX_VALUE)
                        .addComponent(ExitBtn)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(ExitBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(MenuBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelGendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelGendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelGendActionPerformed

    private void SellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) SellerTable.getModel();
        int Myindex = SellerTable.getSelectedRow();
        SelAccount.setText(model.getValueAt(Myindex, 0).toString());
        SelPass.setText(model.getValueAt(Myindex, 1).toString());
        NewSelAcc.setText(model.getValueAt(Myindex, 0).toString());
        NewSelPass.setText(model.getValueAt(Myindex, 1).toString());
    }//GEN-LAST:event_SellerTableMouseClicked

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
        new AdminMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(NewSelAcc.getText().isEmpty() || NewSelPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Mising Information");
        }
        else{
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            Rs = St.executeQuery("select * from supermarket.sellertbl where account='"+NewSelAcc.getText()+"'");
            if(Rs.next()){
                JOptionPane.showMessageDialog(this, "this account existed");
            }
            else{
                PreparedStatement add = Con.prepareStatement("insert into supermarket.sellertbl values(?, ?, ?)");
                add.setString(1, NewSelAcc.getText());
                add.setString(2, NewSelPass.getText());
                add.setString(3, SelGend.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Seller Added Successfully");
                Con.close();
                SelectSeller();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(NewSelAcc.getText().isEmpty() || NewSelPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Mising Information");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                St = Con.createStatement();
                ResultSet Rs = null;
                Rs = St.executeQuery("select * from supermarket.sellertbl where account='"+SelAccount.getText()+"'");
                if(!Rs.next()){
                    JOptionPane.showMessageDialog(this, "Do not exist this account");
                }
                else{
                    String Query = "update supermarket.sellertbl set account='"+NewSelAcc.getText()+"' ,password='"+NewSelPass.getText()+"',gender='"+
                            SelGend.getSelectedItem().toString()+"' where account='"+SelAccount.getText()+"'";
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(Query);
                    JOptionPane.showMessageDialog(this, "Seller Updated");
                    SelectSeller();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(SelAccount.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please pick the Seller to be deleted");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                String SId = SelAccount.getText();
                String Query = "delete from supermarket.sellertbl where account = '" + SId+"'";
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectSeller();
                JOptionPane.showMessageDialog(this, "Seller Deleted Successfully");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked

        NewSelAcc.setText("");
        NewSelPass.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void SearchNameLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNameLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchNameLblActionPerformed

    private void FilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterBtnMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            Rs = St.executeQuery("select * from supermarket.sellertbl");
            if(SearchNameLbl.getText().length() > 0){
                Rs = St.executeQuery("select * from supermarket.sellertbl where substring(account, 1, "+
                        SearchNameLbl.getText().length()+") = '"+SearchNameLbl.getText()+"'");
                
            }
            SellerTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_FilterBtnMouseClicked

    private void FilterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBtnActionPerformed

    private void NewSelAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSelAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSelAccActionPerformed

    private void NewSelPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSelPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSelPassActionPerformed

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBtn;
    private javax.swing.JLabel ClearBtn;
    private javax.swing.JLabel DeleteBtn;
    private javax.swing.JLabel EditBtn;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JLabel MenuBtn;
    private javax.swing.JTextField NewSelAcc;
    private javax.swing.JTextField NewSelPass;
    private javax.swing.JTextField SearchNameLbl;
    private javax.swing.JLabel SelAccount;
    private javax.swing.JComboBox<String> SelGend;
    private javax.swing.JLabel SelPass;
    private javax.swing.JTable SellerTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
