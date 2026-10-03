/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.ManagerReportsModel;

public class ManagerReportsController {
    
    public void showPaymentReport() {
        ManagerReportsModel model = new ManagerReportsModel();
        model.generatePaymentReport();
    }

    public void showEmployeeReport() {
        ManagerReportsModel model = new ManagerReportsModel();
        model.generateEmployeeReport();
    }

    public void showTimeslotReport() {
        ManagerReportsModel model = new ManagerReportsModel();
        model.generateTimeslotReport();
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
