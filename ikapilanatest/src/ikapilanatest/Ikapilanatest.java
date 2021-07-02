/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikapilanatest;
import java.sql.*;
import java.beans.AppletInitializer;
import java.awt.AWTError;

public class Ikapilanatest {
int z = 4;
    
  
    public static void main(String[] args) {
        

        for (int x = 0 ; x < 5; x++){
            System.out.println("hello world");
        }
   

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("arururu");
            //connection
//            Connection mycon = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/awts" , "root" , "Naiskongmagpakalasingdahilwalakana14");
//            if(mycon != null){
//                System.out.println("Success");
//            }
            
            
            System.out.println("hehehehehehehehehehe");
            /*
            //statement
            Statement myStat = mycon.createStatement();
            //execute query
            ResultSet myRs = myStat.executeQuery("select * from hotdog");
            //print result set
            while(myRs.next()){
                System.out.println(myRs.getString("HDName") + ", " + myRs.getString("HDAdress"));
            }*/
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }


    }
    
}
