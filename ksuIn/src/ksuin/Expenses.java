package ksuin;


import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricky
 */
public class Expenses extends javax.swing.JFrame {
    //################## COMMENT OUT MO LANG TO#############\\
    public static final String dbURL = "jdbc:mysql://localhost:3306/";
    public static final String username = "root";
    public static final String password = "Naiskongmagpakalasingdahilwalakana14";
     //################## BUHAT OG SAME VARIABLE NAMES PERO LAHI ANG VALUES #############\\

    // MAO NA NING FORMAT NIMO
//    public static final String dbURL = "jdbc:mysql://127.0.0.1:3306/";
//    public static final String username = "root";
//    public static final String password = "Langgalangga1";
    
    
    
    // DECLARING VARIABLES //
    ArrayList<String[]> SupplierArr = new ArrayList<String[]>();
    ArrayList<ArrayList<String[]>> ProductArr = new ArrayList<ArrayList<String[]>>();
    
    int SupplierRow;
    int ProductRow;




/**
     * Creates new form Expenses
     */
    public Expenses() {
        initComponents();
    }

   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        voucherTF = new javax.swing.JTextField();
        invoiceTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        productTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        quantTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        perUnitTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        supplierTF = new javax.swing.JTextField();
        AddSupplierBtn = new javax.swing.JButton();
        DltSupplierBtn = new javax.swing.JButton();
        AddProductBtn = new javax.swing.JButton();
        DltProductBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Voucher No.");

        voucherTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voucherTFActionPerformed(evt);
            }
        });

        invoiceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceTFActionPerformed(evt);
            }
        });

        jLabel2.setText("Invoice No.");

        productTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTFActionPerformed(evt);
            }
        });

        jLabel3.setText("Product Name");

        quantTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantTFActionPerformed(evt);
            }
        });

        jLabel4.setText("Product Quantity");

        jLabel5.setText("Price per Unit");

        perUnitTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perUnitTFActionPerformed(evt);
            }
        });

        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voucher No.", "Supplier Name", "Total Cost"
            }
        ));
        SupplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierTable);
        if (SupplierTable.getColumnModel().getColumnCount() > 0) {
            SupplierTable.getColumnModel().getColumn(0).setMinWidth(150);
            SupplierTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            SupplierTable.getColumnModel().getColumn(0).setMaxWidth(150);
            SupplierTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            SupplierTable.getColumnModel().getColumn(2).setMinWidth(100);
            SupplierTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            SupplierTable.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jButton1.setText("TEST DATABASE CONNECTION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Product Name", "Quantity", "Price per Unit", "Total Cost"
            }
        ));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProductTable);

        jLabel7.setText("Supplier Name");

        supplierTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierTFActionPerformed(evt);
            }
        });

        AddSupplierBtn.setText("Add Supplier");
        AddSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSupplierBtnActionPerformed(evt);
            }
        });

        DltSupplierBtn.setText("Delete Supplier");
        DltSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DltSupplierBtnActionPerformed(evt);
            }
        });

        AddProductBtn.setText("Add Product");
        AddProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductBtnActionPerformed(evt);
            }
        });

        DltProductBtn.setText("Delete Product");
        DltProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DltProductBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(19, 19, 19))
                            .addComponent(AddSupplierBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(supplierTF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(voucherTF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(DltSupplierBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(perUnitTF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quantTF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(productTF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(invoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AddProductBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(DltProductBtn)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(voucherTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(supplierTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddSupplierBtn)
                            .addComponent(DltSupplierBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invoiceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(productTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(perUnitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddProductBtn)
                            .addComponent(DltProductBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voucherTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voucherTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voucherTFActionPerformed

    private void invoiceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceTFActionPerformed

    private void productTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productTFActionPerformed

    private void quantTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantTFActionPerformed

    private void perUnitTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perUnitTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perUnitTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //#############################TEST LANG ANG CONNECTION NG JAVA TO DATABASE#####################\\
        try{
        Connection myCon = DriverManager.getConnection(dbURL, username, password);//COMMENT OUT MO LANG ANG LOGIN INFO KO
        if(myCon != null){
            System.out.println("Connected");
        }
    }
    catch(Exception ex){
        System.out.println("Not connected");
        System.out.println(ex);
        
    }
        //#############################TEST LANG ANG CONNECTION NG JAVA TO DATABASE#####################\\
    }//GEN-LAST:event_jButton1ActionPerformed

    private void supplierTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierTFActionPerformed

    private void DltSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DltSupplierBtnActionPerformed
        DefaultTableModel supplierTableMmodel = (DefaultTableModel) SupplierTable.getModel();
        DefaultTableModel productTableMmodel = (DefaultTableModel) ProductTable.getModel();
        
        if (SupplierTable.getSelectionModel().isSelectionEmpty()){
            MsgBox("Please Select a supplier", "Error!");
        }else{
            MsgBox("Successfully deleted the Supplier", "Message!");
            supplierTableMmodel.removeRow(SupplierRow);
            SupplierArr.remove(SupplierRow);
            ProductArr.remove(SupplierRow);
            productTableMmodel.setRowCount(0);
            SupplierTable.clearSelection();
            ProductTable.clearSelection();
        }
        
//        System.out.println(Arrays.deepToString(SupplierArr.toArray()));
        
        
    }//GEN-LAST:event_DltSupplierBtnActionPerformed

    private void DltProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DltProductBtnActionPerformed
        DefaultTableModel productTableMmodel = (DefaultTableModel) ProductTable.getModel();
        
        if (ProductTable.getSelectionModel().isSelectionEmpty()){
            MsgBox("Please Select a product", "Error!");
        }else{
            MsgBox("Successfully deleted the Product", "Message!");
            productTableMmodel.removeRow(ProductRow);
            ProductArr.get(SupplierRow).remove(ProductRow);
            ProductTable.clearSelection();
            
        }
        
    }//GEN-LAST:event_DltProductBtnActionPerformed

    private void AddSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSupplierBtnActionPerformed
        DefaultTableModel supplierTableMmodel = (DefaultTableModel) SupplierTable.getModel();
        
        
        if (voucherTF.getText().length() > 0 && supplierTF.getText().length() > 0){
            
            MsgBox("Successfully added", "Message!");
            String[] item = {voucherTF.getText(), supplierTF.getText(), "0"};
            supplierTableMmodel.addRow(item);
            SupplierArr.add(item);
            
            ProductArr.add(new ArrayList<String[]>());
            
        }else{
            MsgBox("Please fill up all the text field", "Error!");
        }
        
           
    }//GEN-LAST:event_AddSupplierBtnActionPerformed

    private void SupplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTableMouseClicked
        DefaultTableModel productTableMmodel = (DefaultTableModel) ProductTable.getModel();
        
        SupplierRow = SupplierTable.getSelectedRow();
        
        voucherTF.setText(SupplierTable.getValueAt(SupplierRow, 0).toString());
        supplierTF.setText(SupplierTable.getValueAt(SupplierRow, 1).toString());
        
        productTableMmodel.setRowCount(0);
        
        for (int x = 0; x < ProductArr.get(SupplierRow).size(); x ++){
            productTableMmodel.addRow(ProductArr.get(SupplierRow).get(x));
        }
    }//GEN-LAST:event_SupplierTableMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        // Voucher Text Field Placeholder //
        voucherTF.setForeground(Color.GRAY);
        voucherTF.setText("Ex. 01/01/2001");
        voucherTF.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (voucherTF.getText().equals("Ex. 01/01/2001")) {
                voucherTF.setText("");
                voucherTF.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(FocusEvent e) {
            if (voucherTF.getText().isEmpty()) {
                voucherTF.setForeground(Color.GRAY);
                voucherTF.setText("Ex. 01/01/2001");
            }
        }
        });
    }//GEN-LAST:event_formWindowOpened

    private void AddProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductBtnActionPerformed
        DefaultTableModel supplierTableMmodel = (DefaultTableModel) SupplierTable.getModel();
        DefaultTableModel productTableMmodel = (DefaultTableModel) ProductTable.getModel();
        
        if (SupplierTable.getSelectionModel().isSelectionEmpty()){
            MsgBox("Please Select a supplier", "Error!");
        }else{
            if (invoiceTF.getText().length() > 0 && productTF.getText().length() > 0 && perUnitTF.getText().length() > 0 && quantTF.getText().length() > 0){

                MsgBox("Successfully added", "Message!");

                String totalPrice = String.valueOf(Float.parseFloat(quantTF.getText()) * Float.parseFloat(perUnitTF.getText()));
                String[] items = {invoiceTF.getText(), productTF.getText(), quantTF.getText(), perUnitTF.getText(), totalPrice};
                ProductArr.get(SupplierRow).add(items);
                productTableMmodel.addRow(items);
                
                
                float newTotPrice = Float.parseFloat(SupplierTable.getValueAt(SupplierRow, 2).toString()) + Float.parseFloat(totalPrice);
                
                
                supplierTableMmodel.setValueAt(newTotPrice, SupplierRow, 2);
                

            }else{
                MsgBox("Please fill up all the text field", "Error!");
            }
        }
        
        
        
    }//GEN-LAST:event_AddProductBtnActionPerformed

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        ProductRow = ProductTable.getSelectedRow();
        
        invoiceTF.setText(ProductTable.getValueAt(ProductRow, 0).toString());
        productTF.setText(ProductTable.getValueAt(ProductRow, 0).toString());
        quantTF.setText(ProductTable.getValueAt(ProductRow, 0).toString());
        perUnitTF.setText(ProductTable.getValueAt(ProductRow, 0).toString());
        
        
    }//GEN-LAST:event_ProductTableMouseClicked
    
    private void MsgBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expenses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductBtn;
    private javax.swing.JButton AddSupplierBtn;
    private javax.swing.JButton DltProductBtn;
    private javax.swing.JButton DltSupplierBtn;
    private javax.swing.JTable ProductTable;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JTextField invoiceTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField perUnitTF;
    private javax.swing.JTextField productTF;
    private javax.swing.JTextField quantTF;
    private javax.swing.JTextField supplierTF;
    private javax.swing.JTextField voucherTF;
    // End of variables declaration//GEN-END:variables
}
