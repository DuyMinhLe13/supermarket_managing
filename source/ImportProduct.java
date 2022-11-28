/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
public class ImportProduct extends javax.swing.JFrame {

    private String account;
    public ImportProduct(String account) {
        this.account = account;
        initComponents();
        NameLbl.setText(" "+this.account+" <3 ");
        SelectSk();
        GetCat();
    }

    Connection Con = null;
    Statement St = null;
    public void SelectSk(){
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProdCat = new javax.swing.JComboBox<>();
        ProdQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProdTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        TotalBillLabel = new javax.swing.JLabel();
        FilterBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        SearchNameLbl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BillId = new javax.swing.JLabel();
        BillIdBtn = new javax.swing.JLabel();
        ProdName = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("PRODUCT LIST");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 255));
        jLabel4.setText("BILL ID");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("NAME");

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

        ProdQty.setBackground(new java.awt.Color(0, 0, 0));
        ProdQty.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProdQty.setForeground(new java.awt.Color(255, 204, 255));
        ProdQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdQtyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("QUANTITY");

        ProdTable.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jLabel8.setText("IMPORT BILL");

        PrintBtn.setBackground(new java.awt.Color(255, 204, 255));
        PrintBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(0, 0, 0));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(255, 204, 255));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(0, 0, 0));
        AddBtn.setText("Add To Bill");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
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

        ClearBtn.setBackground(new java.awt.Color(255, 204, 255));
        ClearBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(0, 0, 0));
        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        BillTxt.setColumns(20);
        BillTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        TotalBillLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        TotalBillLabel.setForeground(new java.awt.Color(255, 204, 255));
        TotalBillLabel.setText("Total Bill: 0 $");

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
        jLabel9.setText("PRICE");

        SearchNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        SearchNameLbl.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        SearchNameLbl.setForeground(new java.awt.Color(255, 204, 255));
        SearchNameLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNameLblActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 255));
        jLabel7.setText("Search Name");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 255));
        jLabel10.setText("Category");

        BillId.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        BillId.setForeground(new java.awt.Color(255, 204, 255));

        BillIdBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        BillIdBtn.setForeground(new java.awt.Color(255, 204, 255));
        BillIdBtn.setText("Create");
        BillIdBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        BillIdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillIdBtnMouseClicked(evt);
            }
        });

        ProdName.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProdName.setForeground(new java.awt.Color(255, 204, 255));

        ProdPrice.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProdPrice.setForeground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(TotalBillLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProdCat, 0, 209, Short.MAX_VALUE)
                                    .addComponent(SearchNameLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RefreshBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FilterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ProdQty, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                            .addComponent(ProdPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(51, 51, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(BillId)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BillIdBtn))
                                            .addComponent(ProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(AddBtn)
                                .addGap(102, 102, 102)
                                .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 84, Short.MAX_VALUE))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel2)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FilterBtn)
                                    .addComponent(ProdCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SearchNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(RefreshBtn))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(BillId)
                                    .addComponent(BillIdBtn))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(ProdName))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(ProdPrice))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProdQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(ClearBtn))
                        .addGap(217, 217, 217)))
                .addComponent(TotalBillLabel)
                .addGap(18, 18, 18)
                .addComponent(PrintBtn)
                .addGap(104, 104, 104))
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

        LogOutBtn.setBackground(new java.awt.Color(255, 204, 255));
        LogOutBtn.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setText("MENU");
        LogOutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("STOREKEEPER");

        NameLbl.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(0, 0, 0));
        NameLbl.setText("name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(39, 39, 39)
                        .addComponent(NameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LogOutBtn)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(286, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ExitBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(NameLbl))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(LogOutBtn)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed
Double Uprice, ProdTot, TotalBill = 0.0;
int AvailQty;
    private void ProdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProdTable.getModel();
        int Myindex = ProdTable.getSelectedRow();
        ProdName.setText(model.getValueAt(Myindex, 0).toString());
        ProdPrice.setText(model.getValueAt(Myindex, 2).toString());
        AvailQty = Integer.valueOf(model.getValueAt(Myindex, 1).toString());
        Uprice = Double.valueOf(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_ProdTableMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try{BillTxt.print();}
        catch(Exception e){}
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed
int i = 0;
    public void Update(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            AvailQty += Integer.valueOf(ProdQty.getText());
            String Query = "update supermarket.producttbl set quantity="+AvailQty+" where name='"+ProdName.getText()+"'";
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            SelectSk();
            String selectQ = String.format("SELECT * FROM supermarket.import_bill where bill_id=%s and sk_acc='%s' and prod_name = '%s'", 
                    BillId.getText(), this.account, ProdName.getText()) ;
            ResultSet Rs = Add.executeQuery(selectQ);
            if(Rs.next()){
                String new_Qty = String.valueOf(Integer.valueOf(Rs.getString("quantity"))+Integer.valueOf(ProdQty.getText()));
                Add.executeUpdate("update supermarket.import_bill set quantity="+new_Qty+" where "
                        + "bill_id="+BillId.getText()+" and sk_acc='"+this.account+"'and "
                            + "prod_name='"+ProdName.getText()+"'");
            }
            else{
                Add.executeUpdate("insert into supermarket.import_bill values("+BillId.getText()+
                        ",'"+this.account+"','"+ProdName.getText()+"',"+ProdQty.getText()+")");
                
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
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
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProdQty.getText().isEmpty() || ProdName.getText().isEmpty() || BillId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else if(!isPositiveNumber(ProdQty.getText()))JOptionPane.showMessageDialog(this, "Quantity must be positive integer");
        else{
            i++;
            ProdTot = Uprice * Integer.valueOf(ProdQty.getText());
            TotalBill += ProdTot;
            if(i == 1){
                BillTxt.setText(BillTxt.getText() + "\t============VIN MART============\n" +
                    "\t NUM     PRODUCT     PRICE      QUANTITY     TOTAL\n\t"+
                    i + "            " + ProdName.getText() + "                "+
                    Uprice + "          "+
                    ProdQty.getText() + "                "+
                    ProdTot + "\n\t");
            }
            else{
                BillTxt.setText(BillTxt.getText() +
                    i + "            " + ProdName.getText() + "                "+
                    Uprice + "          "+
                    ProdQty.getText() + "                "+
                    ProdTot + "\n\t");
            }
            TotalBillLabel.setText("Total Bill: " + TotalBill + "$");
            Update();
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void RefreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshBtnMouseClicked
        SelectSk();
    }//GEN-LAST:event_RefreshBtnMouseClicked

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked

        ProdName.setText("");
        ProdQty.setText("");
        ProdPrice.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void FilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterBtnMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
            St = Con.createStatement();
            ResultSet Rs = null;
            if(ProdCat.getSelectedItem().toString().equals("Null"))Rs = St.executeQuery("select * from supermarket.producttbl");
            else Rs = St.executeQuery("select * from supermarket.producttbl where category='"+ProdCat.getSelectedItem().toString()+"'");
            if(SearchNameLbl.getText().length() > 0){
                if(ProdCat.getSelectedItem().toString().equals("Null")){
                    Rs = St.executeQuery("select * from supermarket.producttbl where substring(name, 1, "+
                        SearchNameLbl.getText().length()+") = '"+SearchNameLbl.getText()+"'");

                }
                else Rs = St.executeQuery("select * from supermarket.producttbl where category='"+ProdCat.getSelectedItem().toString()+
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

    private void BillIdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillIdBtnMouseClicked
        if(!BillId.getText().isEmpty())JOptionPane.showMessageDialog(this, "Bill Id Existed");
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","NewPassword");
                St = Con.createStatement();
                ResultSet Rs = St.executeQuery("select max(bill_id) from supermarket.import_bill");
                if(!Rs.next()){BillId.setText("0");}
                else{
                    if(Rs.getString(1) == null)BillId.setText("0");
                    else
                    BillId.setText(String.valueOf(Integer.valueOf(Rs.getString(1))+1));
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BillIdBtnMouseClicked

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void LogOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseClicked
        new StorekeeperMenu(this.account).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutBtnMouseClicked

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
//            java.util.logging.Logger.getLogger(ImportProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ImportProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ImportProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ImportProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ImportProduct().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel BillId;
    private javax.swing.JLabel BillIdBtn;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JButton FilterBtn;
    private javax.swing.JLabel LogOutBtn;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JComboBox<String> ProdCat;
    private javax.swing.JLabel ProdName;
    private javax.swing.JLabel ProdPrice;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProdTable;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTextField SearchNameLbl;
    private javax.swing.JLabel TotalBillLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
