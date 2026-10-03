/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.DoctorReportsModel;

public class DoctorReportsController {
    public void showPetDetailsReport() {
        DoctorReportsModel model = new DoctorReportsModel();
        model.generatePetDetailsReport();
    }

    public void showMedicalReport() {
        DoctorReportsModel model = new DoctorReportsModel();
        model.generateMedicalReport();
    }

    public void openDoctor() {
        view.Doctor d = new view.Doctor();
        d.setVisible(true);
    }
    
}
