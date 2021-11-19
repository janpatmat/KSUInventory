/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ricky
 */
public class KsuFinal {
    static setup setupClass = new setup();
    
//    static Login loginClass = new Login();
    /**
     * @param args the command line arguments
     */
    
    static Connection con;
    static String user = "";
    static String pass = "";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        user = "root";
        pass = "Naiskongmagpakalasingdahilwalakana14";
        
//        String user = "root";
//        String pass = "Langgalangga1";

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expenses",user,pass);
        }
        catch(Exception e){
            System.out.println(e);
        }

        
        
        try{
           Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306",user,pass);
        String sql = "show databases like '%expenses%'";
        Statement st = connect.createStatement();
         ResultSet rs = st.executeQuery(sql);
         
      if(rs.next()){
        
        Login loginClass = new Login();
        loginClass.setVisible(true);
        loginClass.setLocationRelativeTo(null);
        
      }
      else{
          
        setupClass.setVisible(true);
        setupClass.setLocationRelativeTo(null);
          
      }

}
        catch(Exception le){
            System.out.println(le);

}
}




//        AddProduct index = new AddProduct();
//        index.setVisible(true);
        

        
        

        
    }
    

