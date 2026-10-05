/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TimeFrameModel {
    
    public ResultSet getAllTimeFrames() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "SELECT * FROM doctor_time_table1";
            PreparedStatement pst = con.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public ResultSet getTimeFrameByDoctor(String doctorName) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "SELECT * FROM doctor_time_table1 WHERE doctor_name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, doctorName);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public boolean deleteTimeFrame(String doctorId) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String query = "DELETE FROM doctor_time_table1 WHERE doctor_name = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, doctorId);
            
            int rowsDeleted = pst.executeUpdate();
            con.close();
            return rowsDeleted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
}
