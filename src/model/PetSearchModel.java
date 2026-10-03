/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PetSearchModel {
    
    public ResultSet getAllPets() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "SELECT * FROM pet_register";
            PreparedStatement pst = con.prepareStatement(sql);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public ResultSet searchPetByName(String petName) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "SELECT * FROM pet_register WHERE petName = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, petName);
            return pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean updatePet(String ownerId, String ownerName, int ownerTel, String petName, int petAge, String gender, String breed) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "UPDATE pet_register SET ownerName=?, OwnerTel=?, PetName=?, PetAge=?, Gender=?, Breed=? WHERE OwnerId=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, ownerName);
            pst.setInt(2, ownerTel);
            pst.setString(3, petName);
            pst.setInt(4, petAge);
            pst.setString(5, gender);
            pst.setString(6, breed);
            pst.setString(7, ownerId);

            int rowsUpdated = pst.executeUpdate();
            con.close();
            return rowsUpdated > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean uploadMedicalReport(String petName, String ownerTel, String description) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String query = "INSERT INTO medicale (`petName`, `ownerTel`, `description`) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, petName);
            pst.setString(2, ownerTel);
            pst.setString(3, description);

            pst.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
