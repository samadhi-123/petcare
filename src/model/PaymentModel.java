/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PaymentModel {
    
    public boolean savePayment(String date, String ownerId, String petName, String medicine, String quantity, String unit, double totalBill) {
        try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "INSERT INTO payments_details (Date, ownerId, petName, medicine, quantity, unit, totalBill) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, date);
            pst.setString(2, ownerId);
            pst.setString(3, petName);
            pst.setString(4, medicine);
            pst.setString(5, quantity);
            pst.setString(6, unit);
            pst.setDouble(7, totalBill);
            
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
