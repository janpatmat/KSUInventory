/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

/**
 *
 * @author Rickyincld
 */
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewBranch extends javax.swing.JFrame {
    PreparedStatement st = null;
    static String currentUser = "";
    
    /**
     * Creates new form addSupplier
     */
    public NewBranch() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        branchNameTF = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        questionMarkIcon = new javax.swing.JLabel();

        instructionDialogue.setBackground(new java.awt.Color(240, 240, 240));
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Branch name");

        branchNameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                branchNameTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                branchNameTFFocusLost(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("NEW BRANCH MENU");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(branchNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(questionMarkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(branchNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        if (branchNameTF.getText().length() == 0){
            JOptionPane.showMessageDialog(this,"Please input a Branch Name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                ResultSet rs = KsuFinal.con.createStatement().executeQuery("SELECT * FROM branchtable WHERE branchName = '" + branchNameTF.getText() + "'");
                
                if (rs.next()){
                    JOptionPane.showMessageDialog(this,"Branch Name already exist", "Error", JOptionPane.ERROR_MESSAGE);
                    
                }else{
                    
                    st = KsuFinal.con.prepareStatement("INSERT INTO branchtable (branchName) VALUES (?)");
                    st.setString(1, branchNameTF.getText());
                    st.executeUpdate();
                    
                    branchNameTF.setText("");
                    JOptionPane.showMessageDialog(this,"Successfully added the Branch");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }


        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        instructionDialogue.setLocationRelativeTo(this);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        login.MenuClass.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    public void openWindowAction(){
        
        if (!currentUser.equals(login.fullName)){
            branchNameTF.setText("");
            currentUser = login.fullName;
        }
        
        
    }
    
    private void questionMarkIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseEntered
        instructionDialogue.setVisible(true);
    }//GEN-LAST:event_questionMarkIconMouseEntered

    private void questionMarkIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMarkIconMouseExited
        // TODO add your handling code here:
        instructionDialogue.setVisible(false);
    }//GEN-LAST:event_questionMarkIconMouseExited

    private void branchNameTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_branchNameTFFocusGained
              
    }//GEN-LAST:event_branchNameTFFocusGained

    private void branchNameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_branchNameTFFocusLost
         
    }//GEN-LAST:event_branchNameTFFocusLost

    
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
            java.util.logging.Logger.getLogger(NewBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBranch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField branchNameTF;
    private javax.swing.JDialog instructionDialogue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel questionMarkIcon;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
