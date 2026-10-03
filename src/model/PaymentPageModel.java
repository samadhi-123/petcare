/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PaymentPageModel {
    
    public ResultSet getAllPayments() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "SELECT Date, ownerId, petName, totalBill, medicine, quantity, unit FROM payments_details";
            PreparedStatement pst = con.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public double getGrandTotal() {
        double total = 0.0;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sumSql = "SELECT SUM(totalBill) AS GrandTotal FROM payments_details";
            PreparedStatement pstSum = con.prepareStatement(sumSql);
            ResultSet rsSum = pstSum.executeQuery();
            
            if (rsSum.next()) {
                total = rsSum.getDouble("GrandTotal");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
    
}
