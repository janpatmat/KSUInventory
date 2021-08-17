    /*                                           
 * To change this license header, choose License Headers in Project Properties.                                          
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricky
 */
public class Menu extends javax.swing.JFrame {
    AddTransaction transactionClass = new AddTransaction();
    NewProduct NewProductClass = new NewProduct();
    NewSupplier NewSupplierClass = new NewSupplier();
    NewUnit NewUnitClass = new NewUnit();
    NewCategory NewCategoryClass = new NewCategory();
    NewBranch NewBranchClass = new NewBranch();
    ViewProducts ViewProductsClass = new ViewProducts();
    Report ReportClass = new Report();
    ViewTransactions ViewTransactionsClass = new ViewTransactions();
    EditProduct EditProductClass = new EditProduct();
    EditTransaction EditTransactionClass = new EditTransaction();
    EditUnit EditUnitClass = new EditUnit();
    EditBranch EditBranchClass = new EditBranch();
    EditSupplier EditSupplierClass = new EditSupplier();
    EditUser EditUserClass = new EditUser();


    

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewProductMenu = new javax.swing.JMenuItem();
        NewUnitMenu = new javax.swing.JMenuItem();
        newSupplierMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        EditItemsMenu = new javax.swing.JMenu();
        EditProductMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ReceiveWithdrawMenu = new javax.swing.JMenuItem();
        EditTransactionMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ViewTransactionMenu = new javax.swing.JMenuItem();
        ViewProductsMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        CreateReportMenu = new javax.swing.JMenuItem();
        UsersMainMenu = new javax.swing.JMenu();
        editUserMenu = new javax.swing.JMenuItem();

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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel1.setText("KSU INVENTORY SYSTEM");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Username:");

        usernameTF.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        usernameTF.setText("Text Here");

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setText("First Name:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setText("Last Name:");

        firstNameTF.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        firstNameTF.setText("Text Here");

        lastNameTF.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lastNameTF.setText("Text Here");

        jMenu1.setText("New Items");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        NewProductMenu.setText("New product");
        NewProductMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewProductMenuActionPerformed(evt);
            }
        });
        jMenu1.add(NewProductMenu);

        NewUnitMenu.setText("New unit");
        NewUnitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUnitMenuActionPerformed(evt);
            }
        });
        jMenu1.add(NewUnitMenu);

        newSupplierMenu.setText("New Supplier");
        newSupplierMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSupplierMenuActionPerformed(evt);
            }
        });
        jMenu1.add(newSupplierMenu);

        jMenuItem1.setText("New Branch");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("New Category");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        EditItemsMenu.setText("Edit Items");

        EditProductMenu.setText("Edit Product");
        EditProductMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProductMenuActionPerformed(evt);
            }
        });
        EditItemsMenu.add(EditProductMenu);

        jMenuItem2.setText("Edit Unit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        EditItemsMenu.add(jMenuItem2);

        jMenuItem3.setText("Edit Supplier");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        EditItemsMenu.add(jMenuItem3);

        jMenuItem4.setText("Edit Branch");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        EditItemsMenu.add(jMenuItem4);

        jMenuBar1.add(EditItemsMenu);

        jMenu2.setText("Transaction");

        ReceiveWithdrawMenu.setText("Recieve/Withdraw items");
        ReceiveWithdrawMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiveWithdrawMenuActionPerformed(evt);
            }
        });
        jMenu2.add(ReceiveWithdrawMenu);

        EditTransactionMenu.setText("Edit Transaction");
        EditTransactionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTransactionMenuActionPerformed(evt);
            }
        });
        jMenu2.add(EditTransactionMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");

        ViewTransactionMenu.setText("View Transactions");
        ViewTransactionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewTransactionMenuActionPerformed(evt);
            }
        });
        jMenu3.add(ViewTransactionMenu);

        ViewProductsMenu.setText("View Products");
        ViewProductsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductsMenuActionPerformed(evt);
            }
        });
        jMenu3.add(ViewProductsMenu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Report");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        CreateReportMenu.setText("Create Report");
        CreateReportMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateReportMenuActionPerformed(evt);
            }
        });
        jMenu4.add(CreateReportMenu);

        jMenuBar1.add(jMenu4);

        UsersMainMenu.setText("Users");

        editUserMenu.setText("Edit Users");
        editUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserMenuActionPerformed(evt);
            }
        });
        UsersMainMenu.add(editUserMenu);

        jMenuBar1.add(UsersMainMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewUnitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUnitMenuActionPerformed
       
        NewUnitClass.setVisible(true);
        NewUnitClass.setDefaultCloseOperation(NewUnitClass.DISPOSE_ON_CLOSE);
        NewUnitClass.setLocationRelativeTo(null);
        this.setVisible(false);
        NewUnitClass.openWindowAction();

    }//GEN-LAST:event_NewUnitMenuActionPerformed

    private void ViewTransactionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewTransactionMenuActionPerformed
        
        ViewTransactionsClass.setVisible(true);
        ViewTransactionsClass.setDefaultCloseOperation(ViewTransactionsClass.HIDE_ON_CLOSE);
        ViewTransactionsClass.setLocationRelativeTo(null);
        this.setVisible(false);
        ViewTransactionsClass.openWindowAction();
    }//GEN-LAST:event_ViewTransactionMenuActionPerformed

    private void NewProductMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewProductMenuActionPerformed
        // TODO add your handling code here:
//          AddProduct adPrdct = new AddProduct();
        NewProductClass.setVisible(true);
        NewProductClass.setDefaultCloseOperation(NewProductClass.DISPOSE_ON_CLOSE);
        NewProductClass.setLocationRelativeTo(null);
        this.setVisible(false);
        NewProductClass.openWindowAction();
    }//GEN-LAST:event_NewProductMenuActionPerformed

    private void ReceiveWithdrawMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiveWithdrawMenuActionPerformed
        // TODO add your handling code here:
        
        transactionClass.setVisible(true);
        transactionClass.setDefaultCloseOperation(transactionClass.DISPOSE_ON_CLOSE);
        transactionClass.setLocationRelativeTo(null);
        this.setVisible(false);
        transactionClass.openWindowAction();
    }//GEN-LAST:event_ReceiveWithdrawMenuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void EditProductMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProductMenuActionPerformed

        EditProductClass.setVisible(true);
        EditProductClass.setDefaultCloseOperation(EditProductClass.DISPOSE_ON_CLOSE);
        EditProductClass.setLocationRelativeTo(null);
        this.setVisible(false);
        EditProductClass.openWindowAction();
    }//GEN-LAST:event_EditProductMenuActionPerformed

    private void newSupplierMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSupplierMenuActionPerformed
       
        NewSupplierClass.setVisible(true);
        NewSupplierClass.setDefaultCloseOperation(NewSupplierClass.DISPOSE_ON_CLOSE);
        NewSupplierClass.setLocationRelativeTo(null);
        this.setVisible(false);
        NewSupplierClass.openWindowAction();
    }//GEN-LAST:event_newSupplierMenuActionPerformed

    private void ViewProductsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductsMenuActionPerformed
        ViewProductsClass.setVisible(true);
        ViewProductsClass.setDefaultCloseOperation(ViewProductsClass.DISPOSE_ON_CLOSE);
        ViewProductsClass.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_ViewProductsMenuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void CreateReportMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateReportMenuActionPerformed
        ReportClass.setVisible(true);
        ReportClass.setDefaultCloseOperation(ReportClass.DISPOSE_ON_CLOSE);
        ReportClass.setLocationRelativeTo(null);
        this.setVisible(false);
        ReportClass.openWindowAction();
    }//GEN-LAST:event_CreateReportMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        NewBranchClass.setVisible(true);
        NewBranchClass.setDefaultCloseOperation(NewBranchClass.DISPOSE_ON_CLOSE);
        NewBranchClass.setLocationRelativeTo(null);
        this.setVisible(false);
        NewBranchClass.openWindowAction();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void EditTransactionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTransactionMenuActionPerformed
        EditTransactionClass.setVisible(true);
        EditTransactionClass.setDefaultCloseOperation(EditTransactionClass.DISPOSE_ON_CLOSE);
        EditTransactionClass.setLocationRelativeTo(null);
        this.setVisible(false);
        EditTransactionClass.openWindowAction();

    }//GEN-LAST:event_EditTransactionMenuActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        EditUnitClass.setVisible(true);
        EditUnitClass.setDefaultCloseOperation(EditUnitClass.DISPOSE_ON_CLOSE);
        EditUnitClass.setLocationRelativeTo(null);
        this.setVisible(false);
        EditUnitClass.openWindowAction();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        EditSupplierClass.setVisible(true);
        EditSupplierClass.setDefaultCloseOperation(EditSupplierClass.DISPOSE_ON_CLOSE);
        EditSupplierClass.setLocationRelativeTo(null);
        this.setVisible(false);
        EditSupplierClass.openWindowAction();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        EditBranchClass.setVisible(true);
        EditBranchClass.setDefaultCloseOperation(EditBranchClass.DISPOSE_ON_CLOSE);
        EditBranchClass.setLocationRelativeTo(null);
        this.setVisible(false);
        EditBranchClass.openWindowAction();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int log = 0;
        log = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Warning",JOptionPane.YES_NO_OPTION);
        if(log == JOptionPane.YES_OPTION){
            this.dispose();
            
            Login loginClass = new Login();
            loginClass.setVisible(true);
            loginClass.setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        NewCategoryClass.setVisible(true);
        NewCategoryClass.setDefaultCloseOperation(NewCategoryClass.DISPOSE_ON_CLOSE);
        NewCategoryClass.setLocationRelativeTo(null);
        this.setVisible(false);
        NewCategoryClass.openWindowAction();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        usernameTF.setText(Login.userName);
        firstNameTF.setText(Login.firstName);
        lastNameTF.setText(Login.lastName);
        
//        System.out.print("window opened");
        if (!Login.admin){
            EditItemsMenu.setVisible(false);
            EditTransactionMenu.setVisible(false);
            UsersMainMenu.setVisible(false);
        }else{
            EditItemsMenu.setVisible(true);
            EditTransactionMenu.setVisible(true);
            UsersMainMenu.setVisible(true);

        }
    }//GEN-LAST:event_formWindowActivated

    private void editUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserMenuActionPerformed

        EditUserClass.setVisible(true);
        EditUserClass.setDefaultCloseOperation(EditUserClass.DISPOSE_ON_CLOSE);
        EditUserClass.setLocationRelativeTo(null);
        this.setVisible(false);
        EditUserClass.openWindowAction();       
    }//GEN-LAST:event_editUserMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CreateReportMenu;
    private javax.swing.JMenu EditItemsMenu;
    private javax.swing.JMenuItem EditProductMenu;
    private javax.swing.JMenuItem EditTransactionMenu;
    private javax.swing.JMenuItem NewProductMenu;
    private javax.swing.JMenuItem NewUnitMenu;
    private javax.swing.JMenuItem ReceiveWithdrawMenu;
    private javax.swing.JMenu UsersMainMenu;
    private javax.swing.JMenuItem ViewProductsMenu;
    private javax.swing.JMenuItem ViewTransactionMenu;
    private javax.swing.JMenuItem editUserMenu;
    private javax.swing.JLabel firstNameTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel lastNameTF;
    private javax.swing.JMenuItem newSupplierMenu;
    private javax.swing.JLabel usernameTF;
    // End of variables declaration//GEN-END:variables
}
