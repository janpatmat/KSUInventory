/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksufinal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ricky
 */
public class KsuFinal {
    
//    static Login loginClass = new Login();
    /**
     * @param args the command line arguments
     */
    
    static Connection con;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      
//        String user = "root";
//        String pass = "Naiskongmagpakalasingdahilwalakana14";
        
        String user = "root";
        String pass = "Corei810thgen";

//        String pass = "Corei810thgen";

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expenses",user,pass);
        }
        catch(Exception e){
            System.out.println(e);
        }

        
        
        
        Login loginClass = new Login();
        loginClass.setVisible(true);
        loginClass.setLocationRelativeTo(null);


//        AddProduct index = new AddProduct();
//        index.setVisible(true);
        

        
        

        
    }
    
}
