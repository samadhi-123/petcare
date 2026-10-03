/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeModel {
    
    public boolean saveEmployee(String userId, String userName, String address, String phoneNo, String password, String role) {
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
            con.close();
            return true;
        } 
        catch (Exception e) 
        {
           e.printStackTrace();
            return false;
        }
    }
    
    public boolean updateEmployee(String userId, String userName, String address, String phoneNo, String password, String role) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "UPDATE register_tbl SET UserName = ?, Address = ?, PhoneNo = ?, Password = ?, Role = ? WHERE UserId = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, userName);
            pst.setString(2, address);
            pst.setString(3, phoneNo);
            pst.setString(4, password);
            pst.setString(5, role);
            pst.setString(6, userId);
            
            int rowsUpdated = pst.executeUpdate();
            con.close();
            return rowsUpdated > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteEmployee(String userId) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String query = "DELETE FROM register_tbl WHERE UserId = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, userId);
            
            int rowsDeleted = pst.executeUpdate();
            con.close();
            return rowsDeleted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
