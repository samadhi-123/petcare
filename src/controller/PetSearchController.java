/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.PetSearchModel;
import java.sql.ResultSet;

public class PetSearchController {
    public ResultSet loadAllPets() {
        PetSearchModel model = new PetSearchModel();
        return model.getAllPets();
    }

    public ResultSet searchPet(String petName) {
        PetSearchModel model = new PetSearchModel();
        return model.searchPetByName(petName);
    }

    public boolean updatePetDetails(String ownerId, String ownerName, int ownerTel, String petName, int petAge, String gender, String breed) {
        PetSearchModel model = new PetSearchModel();
        return model.updatePet(ownerId, ownerName, ownerTel, petName, petAge, gender, breed);
    }

    public boolean saveMedicalReport(String petName, String ownerTel, String description) {
        PetSearchModel model = new PetSearchModel();
        return model.uploadMedicalReport(petName, ownerTel, description);
    }

    public void openDoctor() {
        view.Doctor d = new view.Doctor();
        d.setVisible(true);
    }
    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
}
