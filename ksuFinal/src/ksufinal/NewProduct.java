/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class NewProduct extends javax.swing.JFrame {
ArrayList <String> unitar = new ArrayList <String>();
ArrayList <String> subar = new ArrayList <String>();
PreparedStatement st = null;
public String prdnm = null;

    /**
     * Creates new form AddProduct
     */
    public NewProduct() {
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

        instructionDialogue = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        minQ = new javax.swing.JTextField();
        unitCmb = new javax.swing.JComboBox();
        catCmb = new javax.swing.JComboBox();
        questionMarkIcon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        instructionDialogue.setBackground(new java.awt.Color(240, 240, 240));
        instructionDialogue.setMinimumSize(new java.awt.Dimension(292, 198));
        instructionDialogue.setResizable(false);
        instructionDialogue.setType(java.awt.Window.Type.POPUP);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("INSTRUCTIONS");

        javax.swing.GroupLayout instructionDialogueLayout = new javax.swing.GroupLayout(instructionDialogue.getContentPane());
        instructionDialogue.getContentPane().setLayout(instructionDialogueLayout);
        instructionDialogueLayout.setHorizontalGroup(
            instructionDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        instructionDialogueLayout.setVerticalGroup(
            instructionDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        jButton1.setText("Add Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NEW PRODUCT MENU");

        jLabel4.setText("Category");

        jLabel5.setText("Product Name");

        jLabel6.setText("Minimum Quantity");

        jLabel7.setText("Unit of Measure");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(unitCmb, 0, 109, Short.MAX_VALUE)
                        .addComponent(catCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productName)
                        .addComponent(minQ)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(catCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(unitCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (productName.getText().length() > 0 && minQ.getText().length() > 0){    
            try{
                boolean checker = false;
                st = KsuFinal.con.prepareStatement("INSERT INTO producttable (productName,productQuantity, Unit,prodMinq, Active, Sub, standardPrice, dateFrom, dateTo) VALUES (?,?,?,?,?,?,?,?,?)");
                String nm = productName.getText();
                Statement sta = KsuFinal.con.createStatement();
                ResultSet rs = sta.executeQuery("SELECT productName from producttable");
                while(rs.next()){
                    prdnm = rs.getString("productName");
                    if (prdnm.equals(nm)){
                        checker = true;
                        break;
                    }
                    else{
                        checker = false;
                    }
                }
                if(checker == true){
                    JOptionPane.showMessageDialog(this,"Please select a new Product Name", "Error", JOptionPane.ERROR_MESSAGE);

                }
                else{
                    st.setString(1, productName.getText());
                    st.setInt(2, 0);
                    st.setString(3,(String) unitCmb.getSelectedItem());
                    st.setInt(4, Integer.parseInt(minQ.getText()));
                    st.setString(5, "TRUE");
                    st.setString(6,(String) catCmb.getSelectedItem());
                    st.setFloat(7, 0);
                    st.setString(8, "0");
                    st.setString(9, "0");
                    st.executeUpdate();

                    JOptionPane.showMessageDialog(this,"Successfully registered the product");
                }
            }
            catch(Exception ex){
                if (ex instanceof NumberFormatException){
                    JOptionPane.showMessageDialog(this,"Please put a numeric value in the Minimum Quantity Field", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"There are missing inputs", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        instructionDialogue.setLocationRelativeTo(this);
       
    }//GEN-LAST:event_formWindowOpened

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        
    }//GEN-LAST:event_formFocusLost

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        Login.MenuClass.setVisible(true);
        productName.setText("");
        minQ.setText("");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
  
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    public void openWindowAction(){
        unitCmb.removeAllItems();
        catCmb.removeAllItems();
        
        try{
            String unit;
            String category;
            ResultSet rs = KsuFinal.con.createStatement().executeQuery("SELECT Unit FROM unittable");
            ResultSet res = KsuFinal.con.createStatement().executeQuery("SELECT categoryName FROM categorytable");
            
            while(rs.next()){
                unit = rs.getString("Unit");
                unitCmb.addItem(unit);
            }
            while(res.next()){
                category = res.getString("categoryName");
                catCmb.addItem(category);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void questionMarkIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseExited
        instructionDialogue.setVisible(false);
    }//GEN-LAST:event_questionMarkIconMouseExited

    private void questionMarkIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseEntered
        instructionDialogue.setVisible(true);

    }//GEN-LAST:event_questionMarkIconMouseEntered

    public void test(){
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
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox catCmb;
    private javax.swing.JDialog instructionDialogue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField minQ;
    private javax.swing.JTextField productName;
    private javax.swing.JLabel questionMarkIcon;
    private javax.swing.JComboBox unitCmb;
    // End of variables declaration//GEN-END:variables
}
