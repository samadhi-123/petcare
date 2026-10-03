/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegistrationModel {
    
    public boolean savePet(String ownerId, String ownerName, String ownerTel, String petName, String petAge, String gender, String breed) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            String sql = "INSERT INTO pet_register (OwnerId, ownerName, OwnerTel, PetName, PetAge, Gender, Breed) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, ownerId);
            pst.setString(2, ownerName);
            pst.setString(3, ownerTel);
            pst.setString(4, petName);
            pst.setString(5, petAge);
            pst.setString(6, gender);
            pst.setString(7, breed);
            
            pst.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
