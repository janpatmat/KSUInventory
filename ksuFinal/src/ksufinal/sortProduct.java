/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Viver
 */
public class sortProduct extends javax.swing.JFrame {
    ResultSet rs;
    
    static ArrayList<String> selectedProducts = new ArrayList<String>();
    static String prodSortStatement = "";
    static String currentUser = "";
    private String location;
    /**
     * Creates new form sortProduct
     */
    public sortProduct(String location) {
        initComponents();
        this.location = location;
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
        sortProdTable = new javax.swing.JTable();
        selectAllCBox = new javax.swing.JCheckBox();
        saveprodSortBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        sortProdTable.setAutoCreateRowSorter(true);
        sortProdTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        sortProdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Products", "Select Here"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sortProdTable.setRowHeight(25);
        jScrollPane1.setViewportView(sortProdTable);

        selectAllCBox.setText("Select All");
        selectAllCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllCBoxActionPerformed(evt);
            }
        });

        saveprodSortBtn.setText("Save");
        saveprodSortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveprodSortBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectAllCBox)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveprodSortBtn))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(selectAllCBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(saveprodSortBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    public void openWindowAction(){
//        if (!currentUser.equals(Login.fullName)){
            DefaultTableModel sortProdTableModel = (DefaultTableModel)sortProdTable.getModel();
            sortProdTableModel.setRowCount(0);
            
            selectAllCBox.setSelected(false);
            
            sortProdTable.setRowSelectionAllowed(true);
            sortProdTable.setEnabled(true);
            sortProdTable.setForeground(Color.black);
            sortProdTable.setBackground(Color.white);
//            sortProdTable.setRowSelectionAllowed(false);
//            sortProdTable.setEnabled(false);
//            sortProdTable.setForeground(Color.LIGHT_GRAY);
//            sortProdTable.setBackground(new Color(236, 236, 236));

            try{
                rs = KsuFinal.con.createStatement().executeQuery("SELECT * FROM expenses.producttable;");
                while(rs.next()){
                    String nm = rs.getString("productName");
                    Object [] nmArr = {nm, false};

                    sortProdTableModel.addRow(nmArr);

                }  
            }
            catch(Exception e){
                System.out.println(e);
            }
            
            currentUser = Login.fullName;
//        }
        
        
    }
    private void selectAllCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllCBoxActionPerformed
        DefaultTableModel sortProdTableModel = (DefaultTableModel)sortProdTable.getModel();
        if (selectAllCBox.isSelected()){
            for (int x = 0; x < sortProdTableModel.getRowCount(); x ++){
                sortProdTableModel.setValueAt(true, x, 1);
            }
            sortProdTable.setRowSelectionAllowed(false);
            sortProdTable.setEnabled(false);
            sortProdTable.setForeground(Color.LIGHT_GRAY);
            sortProdTable.setBackground(new Color(236, 236, 236));
        }
        else{
            for (int x = 0; x < sortProdTableModel.getRowCount(); x ++){
                sortProdTableModel.setValueAt(false, x, 1);
            }
            sortProdTable.setRowSelectionAllowed(true);
            sortProdTable.setEnabled(true);
            sortProdTable.setForeground(Color.black);
            sortProdTable.setBackground(Color.white);
        }
    }//GEN-LAST:event_selectAllCBoxActionPerformed

    private void saveprodSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveprodSortBtnActionPerformed

        selectedProducts.clear();
        prodSortStatement = "";
        
        if (selectAllCBox.isSelected()){
            if (location.equals("TransReport")){
//                ViewTransactions.prodSortTF.setText("All");
                ViewTransactions.ProductSelectedAll = true;
            }
            else if (location.equals("report")){
//                Report.prodSortTF.setText("All");
                Report.ProductSelectedAll = true;
            }
        }
        else{
            int l = sortProdTable.getRowCount();
            for (int x = 0; x < l; x++){
                if (sortProdTable.getValueAt(x, 1).toString().equals("true")){
                    selectedProducts.add(sortProdTable.getValueAt(x, 0).toString());
                }
            }
//            String jointArray = String.join(", ", selectedProducts);
            
            if (location.equals("TransReport")){
//                ViewTransactions.prodSortTF.setText(jointArray);
                ViewTransactions.ProductSelectedAll = false;
            }
            else if (location.equals("report")){
//                Report.prodSortTF.setText(jointArray);
                Report.ProductSelectedAll = false;
            }
            
            ArrayList<String> strArr = new ArrayList<String>();
            
            for (String x: selectedProducts){
                strArr.add("Name = '" + x + "'");
            }
            
            prodSortStatement = " (" + String.join(" or ", strArr) + ") ";
            
        }
        
        
        
//        System.out.println(prodSortStatement);
        
        if (location.equals("report")){
            Report.sortFunction();
            
        }
        else if (location.equals("TransReport")){
            ViewTransactions.filterFunction();
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_saveprodSortBtnActionPerformed

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
            java.util.logging.Logger.getLogger(sortProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sortProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sortProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sortProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sortProduct("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton saveprodSortBtn;
    private javax.swing.JCheckBox selectAllCBox;
    private javax.swing.JTable sortProdTable;
    // End of variables declaration//GEN-END:variables
}
