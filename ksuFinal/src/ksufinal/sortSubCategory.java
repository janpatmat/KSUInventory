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
public class sortSubCategory extends javax.swing.JFrame {

    ResultSet rs;
    
    static ArrayList<String> selectedSubCategories = new ArrayList<String>();
    static String subCategorySortStatement = "";
    
    static String currentUser = "";
    
    
    private String location;
    /**
     * Creates new form sortCategory
     */
    public sortSubCategory(String location) {
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

        selectAllCBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        sortSubCategoryTable = new javax.swing.JTable();
        saveprodSortBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        selectAllCBox.setText("Select All");
        selectAllCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllCBoxActionPerformed(evt);
            }
        });

        sortSubCategoryTable.setAutoCreateRowSorter(true);
        sortSubCategoryTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        sortSubCategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub-Categories", "Select Here"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sortSubCategoryTable.setRowHeight(25);
        jScrollPane1.setViewportView(sortSubCategoryTable);

        saveprodSortBtn.setText("Ok");
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
                .addContainerGap(14, Short.MAX_VALUE))
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
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectAllCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllCBoxActionPerformed
        DefaultTableModel sortSubCategoryTableModel = (DefaultTableModel)sortSubCategoryTable.getModel();
                
        if (selectAllCBox.isSelected()){
            for (int x = 0; x < sortSubCategoryTable.getRowCount(); x ++){
                sortSubCategoryTableModel.setValueAt(true, x, 1);
            }
            sortSubCategoryTable.setRowSelectionAllowed(false);
            sortSubCategoryTable.setEnabled(false);
            sortSubCategoryTable.setForeground(Color.LIGHT_GRAY);
            sortSubCategoryTable.setBackground(new Color(236, 236, 236));
            
        }
        else{
            for (int x = 0; x < sortSubCategoryTable.getRowCount(); x ++){
                sortSubCategoryTableModel.setValueAt(false, x, 1);
            }
            sortSubCategoryTable.setRowSelectionAllowed(true);
            sortSubCategoryTable.setEnabled(true);
            sortSubCategoryTable.setForeground(Color.black);
            sortSubCategoryTable.setBackground(Color.white);
        }
    }//GEN-LAST:event_selectAllCBoxActionPerformed

    private void saveprodSortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveprodSortBtnActionPerformed

        selectedSubCategories.clear();
        subCategorySortStatement = "";
        

//        if (selectAllCBox.isSelected()){
//            if (location.equals("TransReport")){
////                ViewTransactions.CategorySortTF.setText("All");
//                ViewTransactions.SubCategorySelectedAll = true;
//            }
//            else if (location.equals("report")){
////                Report.CategorySortTF.setText("All");
//                Report.SubCategorySelectedAll = true;
//            }
//            
//        }
//        else{
//            int l = sortSubCategoryTable.getRowCount();
//            for (int x = 0; x < l; x++){
//                if (sortSubCategoryTable.getValueAt(x, 1).toString().equals("true")){
//                    selectedSubCategories.add(sortSubCategoryTable.getValueAt(x, 0).toString());
//                }
//            }
////            String jointArray = String.join(", ", selectedCategories);
//            
//            if (location.equals("TransReport")){
////                ViewTransactions.CategorySortTF.setText(jointArray);
//                ViewTransactions.SubCategorySelectedAll = false;
//            }
//            else if (location.equals("report")){
////                Report.CategorySortTF.setText(jointArray);
//                Report.SubCategorySelectedAll = false;
//            }
//
//            ArrayList<String> strArr = new ArrayList<String>();
//
//            for (String x: selectedSubCategories){
//                strArr.add("subsub = '" + x + "'");
//            }
//
//            subCategorySortStatement = " (" + String.join(" or ", strArr) + ") ";
//
//        }

        this.setVisible(false);
        
        if (location.equals("report")){
            Report.sortFunction();
        }
        else if (location.equals("TransReport")){
            ViewTransactions.filterFunction();
        }

    }//GEN-LAST:event_saveprodSortBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public void openWindowAction(){
        
//        if (!currentUser.equals(Login.fullName)){
            DefaultTableModel sortSubCategoryTableModel = (DefaultTableModel)sortSubCategoryTable.getModel();
            sortSubCategoryTableModel.setRowCount(0);
            selectAllCBox.setSelected(false);
            
            sortSubCategoryTable.setRowSelectionAllowed(true);
            sortSubCategoryTable.setEnabled(true);
            sortSubCategoryTable.setForeground(Color.black);
            sortSubCategoryTable.setBackground(Color.white);
//            sortCategoryTable.setRowSelectionAllowed(false);
//            sortCategoryTable.setEnabled(false);
//            sortCategoryTable.setForeground(Color.LIGHT_GRAY);
//            sortCategoryTable.setBackground(new Color(236, 236, 236));

            try{
                rs = KsuFinal.con.createStatement().executeQuery("SELECT * FROM expenses.subcategorytable;");
                while(rs.next()){
                    String nm = rs.getString("subCategoryName");
                    Object [] nmArr = {nm, false};

                    sortSubCategoryTableModel.addRow(nmArr);

                }  
            }
            catch(Exception e){
                System.out.println(e);
            }
//            currentUser = Login.fullName;
//        }
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
            java.util.logging.Logger.getLogger(sortSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sortSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sortSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sortSubCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sortSubCategory("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveprodSortBtn;
    private javax.swing.JCheckBox selectAllCBox;
    private javax.swing.JTable sortSubCategoryTable;
    // End of variables declaration//GEN-END:variables
}
