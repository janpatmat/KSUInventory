/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikapilanatest;
import java.sql.*;
public class Ikapilanatest {

   
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
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

      System.out.println("Cid pisot");
      System.out.println("Hehehehe");
      System.out.println("awiwt");

    }
    
}
