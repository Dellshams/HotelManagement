/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Shams
 */
public class UpdateClass {
    
    public UpdateClass(){
//        try{
//        Connection con;
//        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/shamshotel";
//        String user = "root";
//        String password = "";
//        con = DriverManager.getConnection(url, user, password);
//        PreparedStatement stmt = null;
//        String query = "update roomtype set Type_ID = ? where Standard = ?";
//        
//        stmt = con.prepareStatement(query);
//        stmt.setInt(1, 6);
//        stmt.setString(2, "SD106");
//
//        int qexecute=stmt.executeUpdate();
//        if(qexecute > 0){
//            System.out.println("Row updated!");
//        }
//        }catch (Exception e) 
//    {
//        System.out.println(e.getMessage());
//    }

        try{
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/shamshotel";
                String pass = "";
                String user = "root";
                Connection con = DriverManager.getConnection(url, user, pass);
                String str = "update login_details set User_Type = 'Staff' where Login_ID = 'chikah'";
                Statement smt = con.createStatement();
                int count = smt.executeUpdate(str);
                System.out.println(count);
                
            }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new UpdateClass();
    }
}
