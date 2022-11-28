/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
<<<<<<< HEAD
    public Category() {
        initComponents();
        SelectCat();
=======
    private String account;
    public Category(String account) {
        this.account = account;
        initComponents();
        SelectCat();
        NameLbl.setText(" "+this.account+" <3 ");
>>>>>>> 1bd4629 (first commit)
    }
    Connection Con = null;
    Statement St = null;
    public void SelectCat(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            Rs = St.executeQuery("select * from supermarket.categorytbl");
            CatTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CatTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JLabel();
        EditBtn = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JLabel();
        CatName = new javax.swing.JLabel();
        NewCatName = new javax.swing.JTextField();
        NewCatDesc = new javax.swing.JTextField();
        ExitBtn = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
<<<<<<< HEAD
=======
        NameLbl = new javax.swing.JLabel();
>>>>>>> 1bd4629 (first commit)

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("NAME");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("DESCRIPTION");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("NAME");

        CatTable.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        CatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NAME", "DESCRIPTION"
            }
        ));
        CatTable.setRowHeight(40);
        CatTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        CatTable.setSelectionForeground(new java.awt.Color(255, 204, 255));
        CatTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CatTable);
        if (CatTable.getColumnModel().getColumnCount() > 0) {
            CatTable.getColumnModel().getColumn(0).setResizable(false);
            CatTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 255));
        jLabel8.setText("MANAGING CATEGORIES");

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

        CatName.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        CatName.setForeground(new java.awt.Color(255, 204, 255));
        CatName.setText("CatName");

        NewCatName.setBackground(new java.awt.Color(0, 0, 0));
        NewCatName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        NewCatName.setForeground(new java.awt.Color(255, 204, 255));
        NewCatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCatNameActionPerformed(evt);
            }
        });

        NewCatDesc.setBackground(new java.awt.Color(0, 0, 0));
        NewCatDesc.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        NewCatDesc.setForeground(new java.awt.Color(255, 204, 255));
        NewCatDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCatDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(540, 540, 540)
                        .addComponent(jLabel5)
                        .addGap(320, 320, 320))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(75, 75, 75)
                                    .addComponent(AddBtn)
                                    .addGap(233, 233, 233)
                                    .addComponent(EditBtn))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(NewCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(86, 86, 86)
                        .addComponent(CatName)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewCatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DeleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClearBtn)))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(468, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(457, 457, 457)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CatName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewCatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewCatDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel8)
                    .addContainerGap(717, Short.MAX_VALUE)))
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

        MenuBtn.setBackground(new java.awt.Color(255, 204, 255));
        MenuBtn.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(0, 0, 0));
        MenuBtn.setText("MENU");
        MenuBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuBtnMouseEntered(evt);
            }
        });

        lbl.setBackground(new java.awt.Color(255, 204, 255));
        lbl.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbl.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
        lbl.setText("Admin");
=======
        lbl.setText("Storekeeper");
>>>>>>> 1bd4629 (first commit)
        lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMouseClicked(evt);
            }
        });

<<<<<<< HEAD
=======
        NameLbl.setBackground(new java.awt.Color(255, 204, 255));
        NameLbl.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(0, 0, 0));
        NameLbl.setText("name");
        NameLbl.setToolTipText("");
        NameLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameLblMouseClicked(evt);
            }
        });

>>>>>>> 1bd4629 (first commit)
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl)
<<<<<<< HEAD
=======
                        .addGap(32, 32, 32)
                        .addComponent(NameLbl)
>>>>>>> 1bd4629 (first commit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBtn)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MenuBtn)
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ExitBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
<<<<<<< HEAD
                        .addComponent(lbl)
=======
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl)
                            .addComponent(NameLbl))
>>>>>>> 1bd4629 (first commit)
                        .addGap(68, 68, 68)
                        .addComponent(MenuBtn)))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) CatTable.getModel();
        int Myindex = CatTable.getSelectedRow();
        CatName.setText(model.getValueAt(Myindex, 0).toString());
        NewCatName.setText(model.getValueAt(Myindex, 0).toString());
        NewCatDesc.setText(model.getValueAt(Myindex, 1).toString());
    }//GEN-LAST:event_CatTableMouseClicked

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
<<<<<<< HEAD
        new AdminMenu().setVisible(true);
=======
        new StorekeeperMenu(this.account).setVisible(true);
>>>>>>> 1bd4629 (first commit)
        this.dispose();
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void MenuBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseEntered
        // TODO add your handling code here
    }//GEN-LAST:event_MenuBtnMouseEntered

    private void lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(NewCatName.getText().isEmpty() || NewCatDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Mising Information");
        }
        else{
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            Rs = St.executeQuery("select * from supermarket.categorytbl where name='"+NewCatName.getText()+"'");
            if(Rs.next()){
                JOptionPane.showMessageDialog(this, "this category existed");
            }
            else{
                PreparedStatement add = Con.prepareStatement("insert into supermarket.categorytbl values(?, ?)");
                add.setString(1, NewCatName.getText());
                add.setString(2, NewCatDesc.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Category Added Successfully");
                Con.close();
                SelectCat();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(NewCatName.getText().isEmpty() || NewCatDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Mising Information");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                St = Con.createStatement();
                ResultSet Rs = null;
                Rs = St.executeQuery("select * from supermarket.categorytbl where name='"+CatName.getText()+"'");
                if(!Rs.next()){
                    JOptionPane.showMessageDialog(this, "Do not exist this category");
                }
                else{
                    String Query = "update supermarket.categorytbl set name='"+NewCatName.getText()+"' ,description='"+NewCatDesc.getText()+
                            "' where name='"+CatName.getText()+"'";
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(Query);
                    JOptionPane.showMessageDialog(this, "Category Updated");
                    SelectCat();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(CatName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please pick the Category to be deleted");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                String SId = CatName.getText();
                String Query = "delete from supermarket.categorytbl where name = '" + SId+"'";
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectCat();
                JOptionPane.showMessageDialog(this, "Category Deleted Successfully");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked

        NewCatName.setText("");
        NewCatDesc.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void NewCatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewCatNameActionPerformed

    private void NewCatDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCatDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewCatDescActionPerformed

<<<<<<< HEAD
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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }
=======
    private void NameLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NameLblMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Category().setVisible(true);
//            }
//        });
//    }
>>>>>>> 1bd4629 (first commit)

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBtn;
    private javax.swing.JLabel CatName;
    private javax.swing.JTable CatTable;
    private javax.swing.JLabel ClearBtn;
    private javax.swing.JLabel DeleteBtn;
    private javax.swing.JLabel EditBtn;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JLabel MenuBtn;
<<<<<<< HEAD
=======
    private javax.swing.JLabel NameLbl;
>>>>>>> 1bd4629 (first commit)
    private javax.swing.JTextField NewCatDesc;
    private javax.swing.JTextField NewCatName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}
