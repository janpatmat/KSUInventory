/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricky
 */
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
public class loading extends javax.swing.JFrame {

    /**
     * Creates new form loading
     */
    
    public void createDB(){
        String dbMaker = "Create database if not exists expenses";
String mbranchTable = "create table if not exists expenses.branchtable (branchID int not null unique AUTO_INCREMENT, branchName varchar(45) null, primary key(branchID))";
String mcategorytable = "create table if not exists expenses.categorytable (categoryID int not null unique, categoryName varchar(45) null, primary key(categoryID))"; 
String mproducttable = "create table if not exists expenses.producttable (productID int not null unique auto_increment , productName varchar(45) null, productQuantity double null, Unit varchar(45) null, prodMinq double null, Active varchar(45) null default 'TRUE' , standardPrice double null , dateFrom text null , dateTo text null , Sub text null , primary key(productID))";
String msuppliertable = "create table if not exists expenses.suppliertable (supplierID int not null unique auto_increment , supplierName varchar(45) null, Contact varchar(45) null, Address varchar(45) null, ContactPerson varchar(45) null, primary key(supplierID))";
String munittable = "create table if not exists expenses.unittable (unitID int not null unique AUTO_INCREMENT, Unit varchar(45) null, primary key(unitID))";
String musertable = "create table if not exists expenses.usertable (userID int not null unique auto_increment, Firstname text null, Lastname text null, Username text null, Password text null, Admin varchar(5) not null default 'FALSE', Active varchar(5) not null default 'TRUE', primary key(userID))";
String admaker = "insert into expenses.usertable (Firstname , Lastname , Username , Password, Admin, Active) values ('admin', 'admin', 'admin', 'admin', 'FALSE' , 'TRUE')";
 try{
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306" , "root" , "Naiskongmagpakalasingdahilwalakana14");
    PreparedStatement dbm;
PreparedStatement btm;
PreparedStatement ctm;

PreparedStatement ptm;
PreparedStatement stm;
PreparedStatement utm;
PreparedStatement ustm;
PreparedStatement adm;

dbm = con.prepareStatement(dbMaker);

btm = con.prepareStatement(mbranchTable);
ctm = con.prepareStatement(mcategorytable);



ptm = con.prepareStatement(mproducttable);

stm = con.prepareStatement(msuppliertable);

utm = con.prepareStatement(munittable);

ustm = con.prepareStatement(musertable);
adm = con.prepareStatement(admaker);
dbm.executeUpdate();
btm.executeUpdate();
ctm.executeUpdate();

ptm.executeUpdate();
stm.executeUpdate();
utm.executeUpdate();
ustm.executeUpdate();
adm.executeUpdate();
    System.err.println("Success");
    
        this.setVisible(false);
      
    
        KsuFinal.setupClass.setVisible(false);
        
    Login loginClass = new Login();
        loginClass.setVisible(true);
        loginClass.setLocationRelativeTo(null);

}
catch(Exception e){
    System.err.println(e);
}

        
    }
    public loading() {
        

        initComponents();
        
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
               for(int i = 0; i <= 100; i++){
                   jLabel1.setText(String.valueOf(i));
                   try {
                       pBar.setValue(i);
                       Thread.sleep(10);
                       if(i == 0){
                           txtStatus.setText("Preparing database");
                       }
                       else if(i == 15){
                            txtStatus.setText("Gathering Data");
                       }
                        else if(i == 25){
                            txtStatus.setText("Decompressing databases");
                       }
                        else if(i == 55){
                            txtStatus.setText("Installing databases");
                       }
                        else if(i == 75){
                            txtStatus.setText("Finalizing");
                       }
                      else if(i == 100){
                          txtStatus.setText("Finished");
                           createDB();

                       
                       }
                   } catch (InterruptedException ex) {
                       Logger.getLogger(loading.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
        });
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBar = new javax.swing.JProgressBar();
        txtStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtStatus.setText("jLabel1");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStatus)
                    .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtStatus)
                .addGap(18, 18, 18)
                .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables
}
