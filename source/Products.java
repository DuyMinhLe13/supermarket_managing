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
public class Products extends javax.swing.JFrame {

    /** Creates new form Products */
<<<<<<< HEAD
    public Products() {
        initComponents();
        SelectProd();
        GetCat();
=======
    private String account;
    public Products(String account) {
        this.account = account;
        initComponents();
        SelectProd();
        GetCat();
        NameLbl.setText(" "+this.account+" <3 ");
>>>>>>> 1bd4629 (first commit)
    }

    Connection Con = null;
    Statement St = null;
    public void SelectProd(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            Rs = St.executeQuery("select * from supermarket.producttbl");
            ProdTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}
    public void GetCat(){
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            String Query = "select * from supermarket.categorytbl";
            ResultSet Rs = null;
            Rs = St.executeQuery(Query);
            while(Rs.next()){
                String Mycat = Rs.getString("name");
                ProdCatCb.addItem(Mycat);
                ProdCat.addItem(Mycat);
            }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProdCatCb = new javax.swing.JComboBox<>();
<<<<<<< HEAD
        ProdQty = new javax.swing.JTextField();
=======
>>>>>>> 1bd4629 (first commit)
        jLabel6 = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProdTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JLabel();
        EditBtn = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ProdCat = new javax.swing.JComboBox<>();
        FilterBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        SearchNameLbl = new javax.swing.JTextField();
        RefreshBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ProdName = new javax.swing.JLabel();
        NewProdName = new javax.swing.JTextField();
<<<<<<< HEAD
        ExitBtn = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JLabel();
        CategoriesBtn1 = new javax.swing.JLabel();
=======
        ProdQty = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JLabel();
        CategoriesBtn1 = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();
>>>>>>> 1bd4629 (first commit)

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("PRODUCT LIST");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("CATEGORY");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("NAME");

        ProdCatCb.setBackground(new java.awt.Color(255, 204, 255));
        ProdCatCb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProdCatCb.setForeground(new java.awt.Color(0, 0, 0));

<<<<<<< HEAD
        ProdQty.setBackground(new java.awt.Color(0, 0, 0));
        ProdQty.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(255, 204, 255));
        ProdQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdQtyActionPerformed(evt);
            }
        });

=======
>>>>>>> 1bd4629 (first commit)
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("QUANTITY");

        ProdPrice.setBackground(new java.awt.Color(0, 0, 0));
        ProdPrice.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProdPrice.setForeground(new java.awt.Color(255, 204, 255));
        ProdPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdPriceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("PRICE");

        ProdTable.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProdTable.setRowHeight(40);
        ProdTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        ProdTable.setSelectionForeground(new java.awt.Color(255, 204, 255));
        ProdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProdTable);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 255));
        jLabel8.setText("MANAGING PRODUCT");

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

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 255));
        jLabel10.setText("Category");

        ProdCat.setBackground(new java.awt.Color(255, 204, 255));
        ProdCat.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProdCat.setForeground(new java.awt.Color(0, 0, 0));
        ProdCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Null" }));
        ProdCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProdCatItemStateChanged(evt);
            }
        });
        ProdCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdCatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProdCatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProdCatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProdCatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ProdCatMouseReleased(evt);
            }
        });
        ProdCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdCatActionPerformed(evt);
            }
        });

        FilterBtn.setBackground(new java.awt.Color(255, 204, 255));
        FilterBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        FilterBtn.setForeground(new java.awt.Color(0, 0, 0));
        FilterBtn.setText("Filter");
        FilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterBtnMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 255));
        jLabel9.setText("Search Name");

        SearchNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        SearchNameLbl.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        SearchNameLbl.setForeground(new java.awt.Color(255, 204, 255));
        SearchNameLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNameLblActionPerformed(evt);
            }
        });

        RefreshBtn.setBackground(new java.awt.Color(255, 204, 255));
        RefreshBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        RefreshBtn.setForeground(new java.awt.Color(0, 0, 0));
        RefreshBtn.setText("Refresh");
        RefreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshBtnMouseClicked(evt);
            }
        });
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 255));
        jLabel11.setText("NAME");

        ProdName.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProdName.setForeground(new java.awt.Color(255, 204, 255));
        ProdName.setText("Please click to table to show information");

        NewProdName.setBackground(new java.awt.Color(0, 0, 0));
        NewProdName.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        NewProdName.setForeground(new java.awt.Color(255, 204, 255));
        NewProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewProdNameActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
        ProdQty.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(255, 204, 255));
        ProdQty.setText("QUANTITY");

>>>>>>> 1bd4629 (first commit)
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(AddBtn)
                        .addGap(218, 218, 218)
                        .addComponent(EditBtn)
                        .addGap(238, 238, 238)
                        .addComponent(DeleteBtn)
                        .addGap(201, 201, 201)
                        .addComponent(ClearBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(841, 841, 841)
                        .addComponent(jLabel7)
                        .addGap(133, 133, 133)
                        .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
<<<<<<< HEAD
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
=======
>>>>>>> 1bd4629 (first commit)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                                    .addComponent(ProdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
=======
                                    .addComponent(ProdCat, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProdQty)
                                    .addComponent(NewProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
>>>>>>> 1bd4629 (first commit)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(70, 70, 70)
                                .addComponent(ProdCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FilterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RefreshBtn))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(549, 549, 549)
                        .addComponent(jLabel11)
                        .addGap(74, 74, 74)
                        .addComponent(ProdName)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilterBtn)
                            .addComponent(ProdCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SearchNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RefreshBtn)))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ProdName))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ProdCatCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(NewProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
<<<<<<< HEAD
                    .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
=======
                    .addComponent(jLabel6)
                    .addComponent(ProdQty))
>>>>>>> 1bd4629 (first commit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addGap(25, 25, 25))
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
        });

        CategoriesBtn1.setBackground(new java.awt.Color(255, 204, 255));
        CategoriesBtn1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        CategoriesBtn1.setForeground(new java.awt.Color(0, 0, 0));
<<<<<<< HEAD
        CategoriesBtn1.setText("Admin");
=======
        CategoriesBtn1.setText("Storekeeper");
>>>>>>> 1bd4629 (first commit)
        CategoriesBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesBtn1MouseClicked(evt);
            }
        });

<<<<<<< HEAD
=======
        NameLbl.setBackground(new java.awt.Color(255, 204, 255));
        NameLbl.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(0, 0, 0));
        NameLbl.setText("name");
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
                .addGap(26, 26, 26)
<<<<<<< HEAD
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MenuBtn)
                    .addComponent(CategoriesBtn1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1507, Short.MAX_VALUE)
                        .addComponent(ExitBtn)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
=======
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CategoriesBtn1)
                        .addGap(29, 29, 29)
                        .addComponent(NameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBtn)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(MenuBtn)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(136, Short.MAX_VALUE))))
>>>>>>> 1bd4629 (first commit)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExitBtn)
<<<<<<< HEAD
                    .addComponent(CategoriesBtn1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(MenuBtn)))
                .addContainerGap(115, Short.MAX_VALUE))
=======
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CategoriesBtn1)
                        .addComponent(NameLbl)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(MenuBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
>>>>>>> 1bd4629 (first commit)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addGap(0, 204, Short.MAX_VALUE))
=======
                .addGap(0, 111, Short.MAX_VALUE))
>>>>>>> 1bd4629 (first commit)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed

=======
>>>>>>> 1bd4629 (first commit)
    private void ProdPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdPriceActionPerformed

    private void ProdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProdTable.getModel();
        int Myindex = ProdTable.getSelectedRow();
        ProdName.setText(model.getValueAt(Myindex, 0).toString());
        NewProdName.setText(model.getValueAt(Myindex, 0).toString());
        ProdQty.setText(model.getValueAt(Myindex, 1).toString());
        ProdPrice.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_ProdTableMouseClicked

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

    private void CategoriesBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriesBtn1MouseClicked
<<<<<<< HEAD

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(NewProdName.getText().isEmpty() || ProdQty.getText().isEmpty() || ProdPrice.getText().isEmpty())
=======
    public static boolean isPositiveNumber(String strNum){
        if(strNum == null)return false;
        try{
            int num = Integer.valueOf(strNum);
        }
        catch(Exception e){
            return false;
        }
        int num = Integer.valueOf(strNum);
        if(num <= 0) return false;
        return true;
    }
    public static boolean isRealNumber(String strNum){
        if(strNum == null)return false;
        try{
            double d = Double.valueOf(strNum);
        }
        catch(Exception e){
            return false;
        }
        double d = Double.valueOf(strNum);
        if(d < 0)return false;
        return true;
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(NewProdName.getText().isEmpty() || ProdPrice.getText().isEmpty())
>>>>>>> 1bd4629 (first commit)
        {
            JOptionPane.showMessageDialog(this, "Mising Information");
        }
        else{
<<<<<<< HEAD
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            Rs = St.executeQuery("select * from supermarket.producttbl where name='"+NewProdName.getText()+"'");
            if(Rs.next()){
                JOptionPane.showMessageDialog(this, "this product existed");
            }
            else{
                PreparedStatement add = Con.prepareStatement("insert into supermarket.producttbl values(?, ?, ?, ?)");
                add.setString(1, NewProdName.getText());
                add.setInt(2, Integer.valueOf(ProdQty.getText()));
                add.setDouble(3, Double.parseDouble(ProdPrice.getText()));
                add.setString(4, ProdCatCb.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Added Successfully");
                Con.close();
                SelectProd();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(NewProdName.getText().isEmpty() || ProdQty.getText().isEmpty())
=======
            if(!isRealNumber(ProdPrice.getText()))JOptionPane.showMessageDialog(this, "Price must be real number");
            else{
                try{
                    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                    St = Con.createStatement();
                    ResultSet Rs = null;
                    Rs = St.executeQuery("select * from supermarket.producttbl where name='"+NewProdName.getText()+"'");
                    if(Rs.next()){
                        JOptionPane.showMessageDialog(this, "this product existed");
                    }
                    else{
                        PreparedStatement add = Con.prepareStatement("insert into supermarket.producttbl values(?, ?, ?, ?)");
                        add.setString(1, NewProdName.getText());
                        add.setInt(2, 0);
                        add.setDouble(3, Double.parseDouble(ProdPrice.getText()));
                        add.setString(4, ProdCatCb.getSelectedItem().toString());
                        int row = add.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Product Added Successfully");
                        Con.close();
                        SelectProd();
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(NewProdName.getText().isEmpty() || ProdPrice.getText().isEmpty())
>>>>>>> 1bd4629 (first commit)
        {
            JOptionPane.showMessageDialog(this, "Mising Information");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                St = Con.createStatement();
                ResultSet Rs = null;
                Rs = St.executeQuery("select * from supermarket.producttbl where name='"+ProdName.getText()+"'");
                if(!Rs.next()){
                    JOptionPane.showMessageDialog(this, "Do not exist this product");
                }
                else{
<<<<<<< HEAD
                    String Query = "update supermarket.producttbl set name='"+NewProdName.getText()+"',quantity="+ProdQty.getText()+",price=" + 
=======
                    String Query = "update supermarket.producttbl set name='"+NewProdName.getText()+"',price=" + 
>>>>>>> 1bd4629 (first commit)
                            ProdPrice.getText()+",category='"+ProdCatCb.getSelectedItem().toString()+"' where name='"+
                            ProdName.getText()+"'";
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(Query);
                    JOptionPane.showMessageDialog(this, "Product Updated");
                    SelectProd();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(ProdName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please pick the Product to be deleted");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                String SId = ProdName.getText();
                String Query = "delete from supermarket.producttbl where name = '" + SId+"'";
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked

        NewProdName.setText("");
        ProdQty.setText("");
        ProdPrice.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ProdCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProdCatItemStateChanged

    }//GEN-LAST:event_ProdCatItemStateChanged

    private void ProdCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdCatMouseClicked

    }//GEN-LAST:event_ProdCatMouseClicked

    private void ProdCatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdCatMouseEntered

    }//GEN-LAST:event_ProdCatMouseEntered

    private void ProdCatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdCatMouseExited

    }//GEN-LAST:event_ProdCatMouseExited

    private void ProdCatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdCatMousePressed

    }//GEN-LAST:event_ProdCatMousePressed

    private void ProdCatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdCatMouseReleased

    }//GEN-LAST:event_ProdCatMouseReleased

    private void FilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterBtnMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            if(ProdCat.getSelectedItem().toString().equals("Null"))Rs = St.executeQuery(
                    "select * from supermarket.producttbl");
            else Rs = St.executeQuery("select * from supermarket.producttbl where category='"+
                    ProdCat.getSelectedItem().toString()+"'");
            if(SearchNameLbl.getText().length() > 0){
                if(ProdCat.getSelectedItem().toString().equals("Null")){
                    Rs = St.executeQuery("select * from supermarket.producttbl where substring(name, 1, "+
                            SearchNameLbl.getText().length()+") = '"+SearchNameLbl.getText()+"'");
                }
                else Rs = St.executeQuery("select * from supermarket.producttbl where category='"+
                        ProdCat.getSelectedItem().toString()+
                        "' and substring(name, 1, "+SearchNameLbl.getText().length()+") = '"+SearchNameLbl.getText()+"'");
            }
            ProdTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_FilterBtnMouseClicked

    private void SearchNameLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNameLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchNameLblActionPerformed

    private void RefreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshBtnMouseClicked
        SelectProd();
    }//GEN-LAST:event_RefreshBtnMouseClicked

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void ProdCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdCatActionPerformed

    private void NewProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewProdNameActionPerformed

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
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
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Products().setVisible(true);
//            }
//        });
//    }
>>>>>>> 1bd4629 (first commit)

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBtn;
    private javax.swing.JLabel CategoriesBtn1;
    private javax.swing.JLabel ClearBtn;
    private javax.swing.JLabel DeleteBtn;
    private javax.swing.JLabel EditBtn;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JLabel MenuBtn;
<<<<<<< HEAD
=======
    private javax.swing.JLabel NameLbl;
>>>>>>> 1bd4629 (first commit)
    private javax.swing.JTextField NewProdName;
    private javax.swing.JComboBox<String> ProdCat;
    private javax.swing.JComboBox<String> ProdCatCb;
    private javax.swing.JLabel ProdName;
    private javax.swing.JTextField ProdPrice;
<<<<<<< HEAD
    private javax.swing.JTextField ProdQty;
=======
    private javax.swing.JLabel ProdQty;
>>>>>>> 1bd4629 (first commit)
    private javax.swing.JTable ProdTable;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTextField SearchNameLbl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
