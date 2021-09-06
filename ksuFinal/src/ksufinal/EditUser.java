/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricky
 */
public class EditUser extends javax.swing.JFrame {
    PreparedStatement st;
    static String currentUser = "";
    /**
     * Creates new form editUser
     */
    public EditUser() {
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
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        questionMarkIcon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        activeBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        instructionDialogue.setMinimumSize(new java.awt.Dimension(292, 198));
        instructionDialogue.setResizable(false);
        instructionDialogue.setType(java.awt.Window.Type.POPUP);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("INSTRUCTIONS");

        javax.swing.GroupLayout instructionDialogueLayout = new javax.swing.GroupLayout(instructionDialogue.getContentPane());
        instructionDialogue.getContentPane().setLayout(instructionDialogueLayout);
        instructionDialogueLayout.setHorizontalGroup(
            instructionDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        instructionDialogueLayout.setVerticalGroup(
            instructionDialogueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructionDialogueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Password", "First name", "Last name", "Admin", "Active"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(0).setResizable(false);
            userTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("EDIT USER MENU");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        activeBtn.setText("Activate / Deactivate");
        activeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeBtnActionPerformed(evt);
            }
        });

        adminBtn.setText("Promote / Demote");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(activeBtn)
                .addGap(18, 18, 18)
                .addComponent(adminBtn)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTF)
                            .addComponent(passwordTF)
                            .addComponent(firstNameTF)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameTF))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showTable(){
        try{
            DefaultTableModel t = (DefaultTableModel)userTable.getModel();
            t.setRowCount(0);
            Statement state = KsuFinal.con.createStatement();
            String sql = "SELECT * FROM usertable";
            ResultSet rs = state.executeQuery(sql);

            while(rs.next()){
                String id = rs.getString("userID");
                String us = rs.getString("Username");
                String ps = rs.getString("Password");
                String fn = rs.getString("Firstname");
                String ln = rs.getString("Lastname");
                String ad = rs.getString("Admin");
                String ac = rs.getString("Active");
                String item[] = {id, us, ps, fn , ln , ad, ac};
                t.addRow(item);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        instructionDialogue.setLocationRelativeTo(this);
    }//GEN-LAST:event_formWindowOpened

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
        try{
            if (userTable.getSelectedRowCount() > 0){

                for (int index: userTable.getSelectedRows()){
                    String id = userTable.getValueAt(index, 0).toString();
                    if (userTable.getValueAt(index, 5).toString().equals("FALSE")){
                        
                        String sql = "UPDATE usertable SET Admin = 'TRUE' WHERE userID = '" + id + "'";
                        st = KsuFinal.con.prepareStatement(sql);
                        st.executeUpdate();
                    }else{
                        String sql = "UPDATE usertable SET Admin = 'FALSE' WHERE userID = '" + id + "'";
                        st = KsuFinal.con.prepareStatement(sql);
                        st.executeUpdate();
                    }
                }
                showTable();
                JOptionPane.showMessageDialog(this,"Successfully changed");
            }else{
                JOptionPane.showMessageDialog(this,"Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_adminBtnActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void questionMarkIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseEntered
        instructionDialogue.setVisible(true);
    }//GEN-LAST:event_questionMarkIconMouseEntered

    private void questionMarkIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseExited
        instructionDialogue.setVisible(false);
    }//GEN-LAST:event_questionMarkIconMouseExited

    private void activeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeBtnActionPerformed
        try{
            if (userTable.getSelectedRowCount() > 0){

                    for (int index: userTable.getSelectedRows()){
                    String id = userTable.getValueAt(index, 0).toString();
                    if (userTable.getValueAt(index, 6).toString().equals("FALSE")){
                        
                        String sql = "UPDATE usertable SET Active = 'TRUE' WHERE userID = '" + id + "'";
                        st = KsuFinal.con.prepareStatement(sql);
                        st.executeUpdate();
                    }else{
                        String sql = "UPDATE usertable SET Active = 'FALSE' WHERE userID = '" + id + "'";
                        st = KsuFinal.con.prepareStatement(sql);
                        st.executeUpdate();
                    }
                }
                showTable();
                JOptionPane.showMessageDialog(this,"Successfully changed");
            }else{
                JOptionPane.showMessageDialog(this,"Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_activeBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Login.MenuClass.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        int selectedRow = userTable.getSelectedRow();
        
        usernameTF.setText(userTable.getValueAt(selectedRow, 1).toString());
        passwordTF.setText(userTable.getValueAt(selectedRow, 2).toString());
        firstNameTF.setText(userTable.getValueAt(selectedRow, 3).toString());
        lastNameTF.setText(userTable.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_userTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String username = usernameTF.getText();
            String password = passwordTF.getText();
            String firstName = firstNameTF.getText();
            String lastName = lastNameTF.getText();
            if (userTable.getSelectedRowCount() > 0){
                if (username.length() > 0 && password.length() > 0 && firstName.length() > 0 && lastName.length() > 0){


                    int index = userTable.getSelectedRow();
                    String id = userTable.getValueAt(index, 0).toString();

                    String sql = "UPDATE usertable SET Username = ?, Password = ?, Firstname = ?, Lastname = ? WHERE userID = '" + id + "'";
                    st = KsuFinal.con.prepareStatement(sql);

                    st.setString(1, username);
                    st.setString(2, password);
                    st.setString(3, firstName);
                    st.setString(4, lastName);

                    st.executeUpdate();

                    showTable();
                    JOptionPane.showMessageDialog(this,"Successfully edited");
                    
                    usernameTF.setText("");
                    passwordTF.setText("");
                    firstNameTF.setText("");
                    lastNameTF.setText("");
                    
                }else{
                    JOptionPane.showMessageDialog(this,"There are empty fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this,"Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception ex){
            
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void openWindowAction(){
        
        if (!currentUser.equals(Login.fullName)){
            showTable();
            currentUser = Login.fullName;
        }
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
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activeBtn;
    private javax.swing.JButton adminBtn;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JDialog instructionDialogue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JLabel questionMarkIcon;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
