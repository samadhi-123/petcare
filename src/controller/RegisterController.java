/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.RegisterModel;


public class RegisterController {
    
    public boolean register(String userId, String userName, String address, String phoneNo, String password, String role) {
        RegisterModel model = new RegisterModel();
        return model.registerUser(userId, userName, address, phoneNo, password, role);
    }
    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
    
}
