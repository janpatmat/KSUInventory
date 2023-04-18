/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class AddTransaction extends javax.swing.JFrame {

    
    Login t = new Login();
    ResultSet rs;
    PreparedStatement st = null;
    ArrayList<String[]> transactionArr = new ArrayList<String[]>();
//    ArrayList <String> supar = new ArrayList <String>();
    String currRadioBtn = "deposit";
    
    ArrayList <String> supplierArr = new ArrayList<>();
    ArrayList <String> branchArr = new ArrayList<>();

    /**
     * Creates new form Transaction
     */
    public AddTransaction() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        instructionDialogue = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        depositRadioBtn = new javax.swing.JRadioButton();
        withdrawRadioBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        productComboBox = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        unitShow = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        transactionQtyTF = new javax.swing.JTextField();
        pptLabel = new javax.swing.JLabel();
        transactionPriceTF = new javax.swing.JTextField();
        transactionBtn = new javax.swing.JButton();
        suppBranchLabel = new javax.swing.JLabel();
        supCmb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        categoryTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        questionMarkIcon = new javax.swing.JLabel();
        quantityShow = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subCategoryTF = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        instructionDialogue.setMinimumSize(new java.awt.Dimension(292, 198));
        instructionDialogue.setResizable(false);
        instructionDialogue.setType(java.awt.Window.Type.POPUP);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("INSTRUCTIONS");

        javax.swing.GroupLayout instructionDialogueLayout = new javax.swing.GroupLayout(instructionDialogue.getContentPane());
        instructionDialogue.getContentPane().setLayout(instructionDialogueLayout);
        instructionDialogueLayout.setHorizontalGroup(
            instructionDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        instructionDialogueLayout.setVerticalGroup(
            instructionDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        buttonGroup1.add(depositRadioBtn);
        depositRadioBtn.setSelected(true);
        depositRadioBtn.setText("Delivery");
        depositRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(withdrawRadioBtn);
        withdrawRadioBtn.setText("Withdraw");
        withdrawRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawRadioBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Product");

        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Unit of Measure");

        unitShow.setEditable(false);

        jLabel3.setText("Quantity");

        pptLabel.setText("Price per Item");

        transactionBtn.setText("Receive");
        transactionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionBtnActionPerformed(evt);
            }
        });

        suppBranchLabel.setText("Supplier");

        jLabel5.setText("Category");

        categoryTF.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TRANSACTION MENU");

        questionMarkIcon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        questionMarkIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ksufinal/QuestionMark.png"))); // NOI18N
        questionMarkIcon.setMaximumSize(new java.awt.Dimension(880, 800));
        questionMarkIcon.setMinimumSize(new java.awt.Dimension(880, 800));
        questionMarkIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                questionMarkIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                questionMarkIconMouseExited(evt);
            }
        });

        quantityShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        quantityShow.setText("text");

        jLabel8.setText("Sub-Category");

        subCategoryTF.setEditable(false);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(transactionBtn)
                        .addGap(18, 18, 18)
                        .addComponent(quantityShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(suppBranchLabel)
                                            .addComponent(pptLabel))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(supCmb, javax.swing.GroupLayout.Alignment.LEADING, 0, 174, Short.MAX_VALUE)
                                            .addComponent(transactionPriceTF, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(transactionQtyTF, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(unitShow)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(depositRadioBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(withdrawRadioBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel8))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subCategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(productComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(categoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 103, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(78, 78, 78)
                                .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositRadioBtn)
                    .addComponent(withdrawRadioBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(categoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(subCategoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(unitShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(transactionQtyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pptLabel)
                    .addComponent(transactionPriceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suppBranchLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionBtn)
                    .addComponent(quantityShow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed
        System.out.println("entered");
        try{    
            if (transactionArr.size() > 0){
                int idx = productComboBox.getSelectedIndex();
                String quan = transactionArr.get(idx)[0];
                String unit = transactionArr.get(idx)[1];
                if (productComboBox.getSelectedItem().toString().length() == 0){
                    quantityShow.setText("");
                    transactionQtyTF.setText("");
                    transactionPriceTF.setText("");
                    categoryTF.setText("");
                    subCategoryTF.setText("");
                    unitShow.setText("");
                    supCmb.setSelectedItem("");
                }else{
                    if (currRadioBtn.equals("withdraw")){
                        quantityShow.setText("Current stocks: " + quan +  " " + transactionArr.get(idx)[1]);
                        transactionPriceTF.setText(transactionArr.get(idx)[5]);
                    }
                    categoryTF.setText(transactionArr.get(idx)[6]);
                    subCategoryTF.setText(transactionArr.get(idx)[7]);
                    unitShow.setText(unit);
                }
            }
        }catch (Exception ex){
            
        }
    }//GEN-LAST:event_productComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        instructionDialogue.setLocationRelativeTo(this);
    }//GEN-LAST:event_formWindowOpened

    private void depositRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositRadioBtnActionPerformed
        // TODO add your handling code here:
        
        // Edit text fields
        quantityShow.setText("");
        transactionPriceTF.setEditable(true);
        suppBranchLabel.setText("Supplier");
        transactionBtn.setText("Receive");
        currRadioBtn = "deposit";
        pptLabel.setText("Price per Item");
        
        
       supCmb.removeAllItems();
       supCmb.addItem("");
       for (String x: supplierArr){
           supCmb.addItem(x);
       }
       
        transactionQtyTF.setText("");
        transactionPriceTF.setText("");
        categoryTF.setText("");
        subCategoryTF.setText("");
        unitShow.setText("");
        productComboBox.setSelectedItem("");
        supCmb.setSelectedItem("");

        
        
        
    }//GEN-LAST:event_depositRadioBtnActionPerformed

    private void withdrawRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawRadioBtnActionPerformed
//       System.out.println("withdraw");

         // Edit text fields
        int idx = productComboBox.getSelectedIndex();
        quantityShow.setText("Current stocks: " + transactionArr.get(idx)[0] + " " + transactionArr.get(idx)[1]); 
        suppBranchLabel.setText("Branch");
        

        transactionQtyTF.setText("");
        transactionPriceTF.setText("");
        transactionBtn.setText("Withdraw");
        categoryTF.setText("");
        subCategoryTF.setText("");
        unitShow.setText("");
        currRadioBtn = "withdraw";
        pptLabel.setText("Standard Price");
       
       //Get standard price from the product table and setText to priceTF
       transactionPriceTF.setEditable(false);
       


       
       supCmb.removeAllItems();
       supCmb.addItem("");
       for (String x: branchArr){
           supCmb.addItem(x);
       }
        productComboBox.setSelectedItem("");
        supCmb.setSelectedItem("");

//        categoryTF.setText(transactionArr.get(idx)[6]);

        

    }//GEN-LAST:event_withdrawRadioBtnActionPerformed

    private void transactionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionBtnActionPerformed
        if (transactionPriceTF.getText().length() == 0 ||transactionQtyTF.getText().length() == 0 || productComboBox.getSelectedItem().toString().length() == 0 || supCmb.getSelectedItem().toString().length() == 0){
            JOptionPane.showMessageDialog(this,"Missing fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int yesNO = 0;
            boolean belowMinimum = false;
            try{
                //Edit the table in the products table
                int idx = productComboBox.getSelectedIndex();
                String nm = transactionArr.get(idx)[2];
                int quan = Integer.parseInt(transactionArr.get(idx)[0]);
                int inputQuan = Integer.parseInt(transactionQtyTF.getText());
                String newQuan = "";


                if (currRadioBtn.equals("deposit")){
                    newQuan = String.valueOf(quan + inputQuan);

                }else{
                    newQuan = String.valueOf(quan - inputQuan);
                    int intNewQuan = Integer.parseInt(newQuan);
                    int intMin = Integer.parseInt(transactionArr.get(idx)[3]);
                    if (intNewQuan >= 0){
                        if (intNewQuan < intMin){
                            // display Warning if below minimum
//                            yesNO = JOptionPane.showConfirmDialog (null, "Your product is now below the minimum, Would you still like to proceed?","Warning",JOptionPane.YES_NO_OPTION);
                            belowMinimum = true;
                        }
                    }else{

                        yesNO = JOptionPane.NO_OPTION;
                        JOptionPane.showMessageDialog(this,"You cannot withdraw this quantity");
                    }
                    inputQuan *= (-1); // put negative sign when withdrawing
                }
                if (yesNO == JOptionPane.YES_OPTION){
                    String statement = "UPDATE expenses.producttable SET productQuantity = " + newQuan + " WHERE productName = '" + nm + "'";
                    transactionArr.get(idx)[0] = newQuan;
                    KsuFinal.con.prepareStatement(statement).executeUpdate(); 

                    //Edit the table in the transactions table
                    PreparedStatement st = KsuFinal.con.prepareStatement("INSERT INTO expenses.producttrans (prodID,Name,Quantity,Unit,Price,SuppBranch,Date, Action, Sub , Transby, subsub)VALUES(?,?,?,?,?,?,?,?,?,?,?)");

                    st.setInt(1, Integer.parseInt(transactionArr.get(idx)[4])); // ProdID
                    st.setString(2, transactionArr.get(idx)[2]); // Name
                    st.setInt(3, inputQuan); // Quantity
                    st.setString(4, transactionArr.get(idx)[1]); // Unit
                    st.setDouble(5, Double.parseDouble(transactionPriceTF.getText())); // Price
                    st.setString(6, (String) supCmb.getSelectedItem()); // SuppBranch
                    st.setString(7, java.time.LocalDate.now().toString()); // Date
                    if (currRadioBtn.equals("deposit")){ // Action
                        st.setString(8, "deposit");
                    }else{
                        st.setString(8, "withdraw");
                    }
                    st.setString(9, categoryTF.getText()); // Sub
                    st.setString(10, t.fullName); // Transby
                    st.setString(11, subCategoryTF.getText()); // subsub

                    st.executeUpdate();            
                    transactionQtyTF.setText("");
                    transactionPriceTF.setText("");
                    categoryTF.setText("");
                    subCategoryTF.setText("");
                    unitShow.setText("");
                    productComboBox.setSelectedItem("");
                    supCmb.setSelectedItem("");
                    quantityShow.setText("");
                    if (currRadioBtn.equals("deposit")){
                        JOptionPane.showMessageDialog(this,"Successfully received the product");
                    }else{
                        JOptionPane.showMessageDialog(this,"Successfully withdrawn the product");
                        quantityShow.setText("");
                    }
                    if (belowMinimum){
                        JOptionPane.showMessageDialog(this,"Product Inventory is now below Minimum Quantity");
                    }
                    
                    yesNO = JOptionPane.showConfirmDialog (this, "Do you have anymore transactions?","Message",JOptionPane.YES_NO_OPTION);

                    if (yesNO != JOptionPane.YES_OPTION){
                        closeWindowAction();
                    }
                }
            }    
            catch(Exception ex){
                JOptionPane.showMessageDialog(this,ex, "Error", JOptionPane.ERROR_MESSAGE);
                    
            }
        }
    }//GEN-LAST:event_transactionBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        closeWindowAction();

    }//GEN-LAST:event_formWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
 
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated
    public void closeWindowAction(){
        Login.MenuClass.setVisible(true);
        this.setVisible(false);
        quantityShow.setText("");
        supCmb.removeAllItems();
        supplierArr.clear();
        productComboBox.removeAllItems();
        transactionArr.clear();
        branchArr.clear();
        depositRadioBtn.setSelected(true);
        transactionPriceTF.setText("");
        transactionPriceTF.setEditable(true);
        suppBranchLabel.setText("Supplier");
        transactionBtn.setText("Receive");
        currRadioBtn = "deposit";
        unitShow.setText("");
        
        
    }
    
    
    public void openWindowAction(){
        quantityShow.setText("");
        transactionQtyTF.setText("");
        transactionPriceTF.setText("");
        categoryTF.setText("");
        subCategoryTF.setText("");
        pptLabel.setText("Price per Item");

        try{
            String supplier;
            String branch;
            rs = KsuFinal.con.createStatement().executeQuery("SELECT * FROM expenses.producttable WHERE Active = 'TRUE';");
            ResultSet rsSupplier = KsuFinal.con.createStatement().executeQuery("SELECT * FROM suppliertable");
            ResultSet rsBranch = KsuFinal.con.createStatement().executeQuery("SELECT * FROM branchtable");
           
            productComboBox.addItem("");
            transactionArr.add(new String[]{"", "", "", "", "", "", "", ""});
            while(rs.next()){
                String id = rs.getString("productID");
                String nm = rs.getString("productName");
                String qt = rs.getString("productQuantity");
//                String qt = "null";
                String ut = rs.getString("Unit");
                String mm = rs.getString("prodMinq");
                String sp = String.format("%.2f" ,rs.getFloat("standardPrice"));
                String sb = rs.getString("Sub");
                String sbsb = rs.getString("subsub");
                
                productComboBox.addItem(nm);
                String[] item = {qt, ut, nm, mm, id, sp, sb, sbsb};
                
                transactionArr.add(item);
                
            }
            supCmb.addItem("");
            while(rsSupplier.next()){
                supplier = rsSupplier.getString("supplierName");
                supCmb.addItem(supplier);
                supplierArr.add(supplier);
            }
            while(rsBranch.next()){
                branch = rsBranch.getString("branchName");
                branchArr.add(branch);
            }
            productComboBox.setSelectedItem("");
            supCmb.setSelectedItem("");
        }
        catch(Exception e){
            System.out.println(e);
        }
        unitShow.setText("");
        
    }
    private void questionMarkIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseEntered
        instructionDialogue.setVisible(true);
    }//GEN-LAST:event_questionMarkIconMouseEntered

    private void questionMarkIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseExited
        instructionDialogue.setVisible(false);
    }//GEN-LAST:event_questionMarkIconMouseExited

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
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField categoryTF;
    private javax.swing.JRadioButton depositRadioBtn;
    private javax.swing.JDialog instructionDialogue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel pptLabel;
    private javax.swing.JComboBox<String> productComboBox;
    private javax.swing.JLabel quantityShow;
    private javax.swing.JLabel questionMarkIcon;
    private javax.swing.JTextField subCategoryTF;
    private javax.swing.JComboBox supCmb;
    private javax.swing.JLabel suppBranchLabel;
    private javax.swing.JButton transactionBtn;
    private javax.swing.JTextField transactionPriceTF;
    private javax.swing.JTextField transactionQtyTF;
    private javax.swing.JTextField unitShow;
    private javax.swing.JRadioButton withdrawRadioBtn;
    // End of variables declaration//GEN-END:variables
}
