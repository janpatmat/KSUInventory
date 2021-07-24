package ksufinal;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ksufinal.sortProduct.selectedProducts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricky
 */
public class TransReport extends javax.swing.JFrame {

    Transaction transactionClass = new Transaction();
    adProd prodTrans = new adProd();
    
    static sortProduct sortproductClass = new sortProduct("TransReport");
    static sortUOM sortUOMClass = new sortUOM("TransReport");
    static sortBS sortBSClass = new sortBS("TransReport");
    static sortCategory sortCategoryClass = new sortCategory("TransReport");
    static String deliveryWithdrawStatement = "";
    
    static ResultSet rs;
//    Withdraw withdrawClass = new Withdraw();
    
    public TransReport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransactionTable = new javax.swing.JTable();
        deliveryCB = new javax.swing.JCheckBox();
        withdrawCB = new javax.swing.JCheckBox();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        toDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editDateCB = new javax.swing.JCheckBox();
        filterProdBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        prodSortTF = new javax.swing.JTextField();
        UOMSortTF = new javax.swing.JTextField();
        BSSortTF = new javax.swing.JTextField();
        UOMBtn = new javax.swing.JButton();
        BSBtn = new javax.swing.JButton();
        CategorySortTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CategoryBtn = new javax.swing.JButton();
        changePeriodBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TransactionTable.setAutoCreateRowSorter(true);
        TransactionTable.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TransactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trans. ID", "Prod. ID", "Date", "Name", "Category", "Price", "Quantity", "Total Price", "Unit of measure", "Branch/Supplier", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TransactionTable.setRowHeight(20);
        jScrollPane1.setViewportView(TransactionTable);

        deliveryCB.setText("Delivery");
        deliveryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryCBActionPerformed(evt);
            }
        });

        withdrawCB.setText("Withdraw");
        withdrawCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawCBActionPerformed(evt);
            }
        });

        jLabel2.setText("From");

        jLabel3.setText("To");

        jLabel4.setText("Unit of Measure");

        jLabel5.setText("Branch/Supplier");

        editDateCB.setText("Edit Period");
        editDateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDateCBActionPerformed(evt);
            }
        });

        filterProdBtn.setText("Edit");
        filterProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterProdBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Products");

        prodSortTF.setEditable(false);
        prodSortTF.setText("All");

        UOMSortTF.setEditable(false);
        UOMSortTF.setText("All");

        BSSortTF.setEditable(false);
        BSSortTF.setText("All");

        UOMBtn.setText("Edit");
        UOMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UOMBtnActionPerformed(evt);
            }
        });

        BSBtn.setText("Edit");
        BSBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSBtnActionPerformed(evt);
            }
        });

        CategorySortTF.setEditable(false);
        CategorySortTF.setText("All");

        jLabel6.setText("Category");

        CategoryBtn.setText("Edit");
        CategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryBtnActionPerformed(evt);
            }
        });

        changePeriodBtn.setText("Change Period");
        changePeriodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePeriodBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("Transaction");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Products");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit transaction");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prodSortTF, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CategorySortTF, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filterProdBtn)
                                    .addComponent(CategoryBtn)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deliveryCB)
                                        .addGap(18, 18, 18)
                                        .addComponent(withdrawCB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UOMSortTF, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UOMBtn)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BSSortTF, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BSBtn))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editDateCB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(changePeriodBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deliveryCB)
                            .addComponent(withdrawCB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(prodSortTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editDateCB))
                            .addComponent(filterProdBtn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CategoryBtn)
                                    .addComponent(jLabel6)
                                    .addComponent(CategorySortTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(changePeriodBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(UOMSortTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UOMBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BSSortTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSBtn))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        transactionClass.setVisible(true);
        transactionClass.setDefaultCloseOperation(transactionClass.HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenu1MouseClicked


    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        prodTrans.setVisible(true);
        prodTrans.setDefaultCloseOperation(prodTrans.HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateTransReportTable();
        deliveryCB.setSelected(true);
        withdrawCB.setSelected(true);
        fromDateChooser.setEnabled(false);
        toDateChooser.setEnabled(false);  
        changePeriodBtn.setEnabled(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void editDateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDateCBActionPerformed
        if (editDateCB.isSelected()){
            fromDateChooser.setEnabled(true);
            toDateChooser.setEnabled(true);
            changePeriodBtn.setEnabled(true);
        }else{
            fromDateChooser.setEnabled(false);
            toDateChooser.setEnabled(false);
            changePeriodBtn.setEnabled(false);
            filterFunction();
        }
    }//GEN-LAST:event_editDateCBActionPerformed

    private void filterProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterProdBtnActionPerformed
        sortproductClass.setVisible(true);
        sortproductClass.setDefaultCloseOperation(sortproductClass.HIDE_ON_CLOSE);
        
    }//GEN-LAST:event_filterProdBtnActionPerformed

    private void UOMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UOMBtnActionPerformed
         sortUOMClass.setVisible(true);
         sortUOMClass.setDefaultCloseOperation(sortUOMClass.HIDE_ON_CLOSE);
    }//GEN-LAST:event_UOMBtnActionPerformed

    private void BSBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSBtnActionPerformed
         sortBSClass.setVisible(true);
         sortBSClass.setDefaultCloseOperation(sortUOMClass.HIDE_ON_CLOSE);
    }//GEN-LAST:event_BSBtnActionPerformed

    public static void filterFunction(){
        DefaultTableModel TransactionTableModel = (DefaultTableModel) TransactionTable.getModel();
        
        
        Boolean notChange = true;
        
        ArrayList<String> strArr = new ArrayList<String>();
        
        if (deliveryCB.isSelected()){
            strArr.add("Action = 'deposit'");
        }
        if (withdrawCB.isSelected()){
            strArr.add("Action = 'withdraw'");
        }
        
        deliveryWithdrawStatement = " (" + String.join(" or ", strArr) + ")";
        
        
        
        ArrayList<String> finalArr = new ArrayList<String>();
        
        if(prodSortTF.getText().equals("All")){
            //do Nothing
        }
        else if(sortproductClass.prodSortStatement.length() > 5){
            finalArr.add(sortproductClass.prodSortStatement);
            
        }
        else{
            TransactionTableModel.setRowCount(0);
            JOptionPane.showMessageDialog(null,"Please select a product");
            notChange = false;
        }

        
        if (UOMSortTF.getText().equals("All")){
            //do Nothing
        }
        else if(sortUOMClass.UOMSortStatement.length() > 5){
            
            finalArr.add(sortUOMClass.UOMSortStatement);
        }
        else{
            TransactionTableModel.setRowCount(0);
            JOptionPane.showMessageDialog(null,"Please select a Unit of Measure");
            notChange = false;
        }
        
        
        if (BSSortTF.getText().equals("All")){
            //do Nothing
        }
        else if(sortBSClass.BSSortStatement.length() > 5){
            
            finalArr.add(sortBSClass.BSSortStatement);
        }
        else{
            TransactionTableModel.setRowCount(0);
            JOptionPane.showMessageDialog(null,"Please select a Branch or Supplier");
            notChange = false;
        }
        
        
        if (CategorySortTF.getText().equals("All")){
            //do Nothing
        }
        else if(sortCategoryClass.categorySortStatement.length() > 5){
            
            finalArr.add(sortCategoryClass.categorySortStatement);
        }
        else{
            TransactionTableModel.setRowCount(0);
            JOptionPane.showMessageDialog(null,"Please select a Category");
            notChange = false;
        }
 
        
        if (deliveryWithdrawStatement.length() > 5){
            finalArr.add(deliveryWithdrawStatement);
        }
        else{
            TransactionTableModel.setRowCount(0);
            JOptionPane.showMessageDialog(null,"Please select if either withdraw or deposit");
            notChange = false;
        }
        
        if (notChange){
            
            String finalStatement = "SELECT * FROM expenses.producttrans";

            if (finalArr.size() > 0){
                finalStatement += " WHERE";
                finalStatement += String.join("and", finalArr);
            }
//            System.out.println(finalStatement);
            
            if (editDateCB.isSelected()){

                
                try{
                    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String fdate = dFormat.format(fromDateChooser.getDate()); 
                    String tdate = dFormat.format(toDateChooser.getDate());
                    TransactionTableModel.setRowCount(0);
                    try{
                        rs = KsuFinal.con.createStatement().executeQuery(finalStatement);
                        while(rs.next()){

                            String id = rs.getString("prodID");
                            String TranNo = rs.getString("TransactionNo");
                            String nm = rs.getString("Name");
                            String ct = rs.getString("Sub");
                            String qty = rs.getString("Quantity");
                            String ut = rs.getString("Unit");
                            String pr = rs.getString("Price");
                            String sb = rs.getString("SuppBranch");
                            String dt = rs.getString("Date");
                            String act = rs.getString("Action");


                            Date currdate = dFormat.parse(dt);
                            Date fromDate = dFormat.parse(fdate);
                            Date toDate = dFormat.parse(tdate);

                            if (((currdate.after(fromDate) && currdate.before(toDate)) || currdate.equals(fromDate) || currdate.equals(toDate)) && (fromDate.before(toDate) || fromDate.equals(toDate))){

                                String[] item = {TranNo, id, dt, nm, ct, pr, qty, ut, sb, act};
                                TransactionTableModel.addRow(item);
                            }

                        }
//                        JOptionPane.showMessageDialog(null,"Filtered Successfully!");
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }catch(NullPointerException ex){
                    JOptionPane.showMessageDialog(null,"Please input a period or uncheck the Edit Period checkbox");
                }
                
            }else{
                TransactionTableModel.setRowCount(0);
                try{
                    rs = KsuFinal.con.createStatement().executeQuery(finalStatement);
                    while(rs.next()){

                        String id = rs.getString("prodID");
                        String TranNo = rs.getString("TransactionNo");
                        String nm = rs.getString("Name");
                        String ct = rs.getString("Sub");
                        String qty = rs.getString("Quantity");
                        String ut = rs.getString("Unit"); 
                        String pr = rs.getString("Price");
                        String sb = rs.getString("SuppBranch");
                        String dt = rs.getString("Date");
                        String act = rs.getString("Action");

                        String[] item = {TranNo, id, dt, nm, ct, pr, qty, ut, sb, act};
                        TransactionTableModel.addRow(item);

                        
                    }
//                    JOptionPane.showMessageDialog(null,"Filtered Successfully!");
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            
        }
    }
    
    
    private void CategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryBtnActionPerformed
        sortCategoryClass.setVisible(true);
        sortCategoryClass.setDefaultCloseOperation(sortCategoryClass.HIDE_ON_CLOSE);
    }//GEN-LAST:event_CategoryBtnActionPerformed

    private void withdrawCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawCBActionPerformed
        filterFunction();
    }//GEN-LAST:event_withdrawCBActionPerformed

    private void deliveryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryCBActionPerformed
        filterFunction();
    }//GEN-LAST:event_deliveryCBActionPerformed

    private void changePeriodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePeriodBtnActionPerformed
        filterFunction();
    }//GEN-LAST:event_changePeriodBtnActionPerformed
    
    public static void updateTransReportTable(){
        System.out.println("1");
        DefaultTableModel TransactionTableModel = (DefaultTableModel) TransactionTable.getModel();
        System.out.println("2");
        TransactionTableModel.setRowCount(0);
        try{
            ResultSet rs = KsuFinal.con.createStatement().executeQuery("SELECT * FROM expenses.producttrans;");
            while(rs.next()){

                String id = rs.getString("prodID");
                String TranNo = rs.getString("TransactionNo");
                String nm = rs.getString("Name");
                String ct = rs.getString("Sub");
                String qty = rs.getString("Quantity");
                String ut = rs.getString("Unit");
                String pr = rs.getString("Price");
                String sb = rs.getString("SuppBranch");
                String dt = rs.getString("Date");
                String act = rs.getString("Action");
                
                if (Float.parseFloat(qty) < 0){
                    qty = String.valueOf(Float.parseFloat(qty) * -1);
                }
                
                String tp = String.valueOf(Float.parseFloat(pr) * Float.parseFloat(qty));

                String[] item = {TranNo, id, dt, nm, ct, pr, qty, tp, ut, sb, act};
                
                
                TransactionTableModel.addRow(item);

            }  
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    public static void changeTable(String[] items){
        DefaultTableModel TransactionTableModel = (DefaultTableModel) TransactionTable.getModel();
        TransactionTableModel.addRow(items);
        
          
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
            java.util.logging.Logger.getLogger(TransReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSBtn;
    public static javax.swing.JTextField BSSortTF;
    private javax.swing.JButton CategoryBtn;
    public static javax.swing.JTextField CategorySortTF;
    public static javax.swing.JTable TransactionTable;
    private javax.swing.JButton UOMBtn;
    public static javax.swing.JTextField UOMSortTF;
    private java.awt.Button button1;
    private javax.swing.JButton changePeriodBtn;
    public static javax.swing.JCheckBox deliveryCB;
    public static javax.swing.JCheckBox editDateCB;
    private javax.swing.JButton filterProdBtn;
    public static com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField prodSortTF;
    public static com.toedter.calendar.JDateChooser toDateChooser;
    public static javax.swing.JCheckBox withdrawCB;
    // End of variables declaration//GEN-END:variables
}
