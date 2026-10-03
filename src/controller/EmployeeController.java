/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.EmployeeModel;

public class EmployeeController {
    
    public boolean saveEmp(String userId, String userName, String address, String phoneNo, String password, String role) {
        EmployeeModel model = new EmployeeModel();
        return model.saveEmployee(userId, userName, address, phoneNo, password, role);
    }
    
    public boolean updateEmp(String userId, String userName, String address, String phoneNo, String password, String role) {
        EmployeeModel model = new EmployeeModel();
        return model.updateEmployee(userId, userName, address, phoneNo, password, role);
    }
    
    public boolean deleteEmp(String userId) {
        EmployeeModel model = new EmployeeModel();
        return model.deleteEmployee(userId);
    }
    public void openManager() {
        view.Manager m = new view.Manager();
        m.setVisible(true);
    }
    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
}
