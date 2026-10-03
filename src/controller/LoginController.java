/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.LoginModel;
import java.sql.ResultSet;

public class LoginController {
    
    public ResultSet loginUser(String username, String password, String role) {
        LoginModel model = new LoginModel();
        return model.validateUser(username, password, role);
    }

    public void openStaff() {
        view.staff s = new view.staff();
        s.setVisible(true);
    }

    public void openManager() {
        view.Manager m = new view.Manager();
        m.setVisible(true);
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
