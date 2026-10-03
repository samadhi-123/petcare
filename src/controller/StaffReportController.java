/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.StaffReportModel;

public class StaffReportController {
    public void showOwnersAndPetsReport() {
        StaffReportModel model = new StaffReportModel();
        model.generateOwnersAndPetsReport();
    }

    public void showCustomerPaymentReport() {
        StaffReportModel model = new StaffReportModel();
        model.generateCustomerPaymentReport();
    }

    public void openStaff() {
        view.staff s = new view.staff();
        s.setVisible(true);
    }
    
}
