/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.SearchModel;
import java.sql.ResultSet;

public class SearchController {
    public ResultSet loadAllPets() {
        SearchModel model = new SearchModel();
        return model.getAllPets();
    }
    public ResultSet searchPetByOwnerId(String ownerId) {
        SearchModel model = new SearchModel();
        return model.searchByOwnerId(ownerId);
    }

    public boolean updatePetDetails(String ownerId, String ownerName, int ownerTel, String petName, int petAge, String gender, String breed) {
        SearchModel model = new SearchModel();
        return model.updatePet(ownerId, ownerName, ownerTel, petName, petAge, gender, breed);
    }

    public void openStaff() {
        view.staff s = new view.staff();
        s.setVisible(true);
    }
    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
}
