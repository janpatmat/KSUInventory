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

    public static void main(String[] args) {
        
        
        for (int x = 0 ; x < 5; x++){
            System.out.println("hello world");
        }
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("arururu");          
            
            System.out.println("hehehehehehehehehehe");
        }
        catch(Exception ex){
            System.out.println(ex);
        }


    }
    
}
