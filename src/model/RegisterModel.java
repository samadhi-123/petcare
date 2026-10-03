/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterModel {
    public boolean registerUser(String userId, String userName, String address, String phoneNo, String password, String role) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "INSERT INTO register_tbl (UserId, username, Address, PhoneNo, Password, Role) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, userId);
            pst.setString(2, userName);
            pst.setString(3, address);
            pst.setString(4, phoneNo);
            pst.setString(5, password);
            pst.setString(6, role);
            
            pst.executeUpdate();
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
