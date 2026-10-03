/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Prabudda
 */
public class SlotsModel {
    
    public boolean saveDoctorTime(String doctorId, String docName, String year, String month, String day, String startTime, String leaveTime, String specialist) {
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String query = "INSERT INTO doctor_time_table1 (`Doctor_Id`, `Doctor_name`, `Year`, `Month`, `Date`, `start_time`, `Leave_time`, `specialist`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, doctorId);    
            pst.setString(2, docName);    
            pst.setString(3, year);        
            pst.setString(4, month);      
            pst.setString(5, day);        
            pst.setString(6, startTime);  
            pst.setString(7, leaveTime);  
            pst.setString(8, specialist);
            
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean updateDoctorTime(String doctorId, String docName, String year, String month, String day, String startTime, String leaveTime, String specialist) {
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String query = "UPDATE doctor_time_table1 SET `Doctor_name`=?, `Year`=?, `Month`=?, `Date`=?, `start_time`=?, `Leave_time`=?, `specialist`=? WHERE `Doctor_Id`=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, docName);
            pst.setString(2, year);
            pst.setString(3, month);
            pst.setString(4, day);
            pst.setString(5, startTime);
            pst.setString(6, leaveTime);
            pst.setString(7, specialist);
            pst.setString(8, doctorId);

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteDoctorTime(String doctorId) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String query = "DELETE FROM doctor_time_table1 WHERE `Doctor_Id`=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, doctorId);
            
            int rowsDeleted = pst.executeUpdate();
            return rowsDeleted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
