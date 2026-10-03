/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.RegistrationModel;

public class RegistrationController {
    public boolean registerPet(String ownerId, String ownerName, String ownerTel, String petName, String petAge, String gender, String breed)
    {
        RegistrationModel model = new RegistrationModel();
        return model.savePet(ownerId, ownerName, ownerTel, petName, petAge, gender, breed);
    }
     public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
    
}
