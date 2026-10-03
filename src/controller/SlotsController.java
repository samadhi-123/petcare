/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.SlotsModel;

public class SlotsController {
    public boolean saveTime(String doctorId, String docName, String year, String month, String day, String startTime, String leaveTime, String specialist) {
        SlotsModel model = new SlotsModel();
        return model.saveDoctorTime(doctorId, docName, year, month, day, startTime, leaveTime, specialist);
    }
    public boolean updateTime(String doctorId, String docName, String year, String month, String day, String startTime, String leaveTime, String specialist) {
        SlotsModel model = new SlotsModel();
        return model.updateDoctorTime(doctorId, docName, year, month, day, startTime, leaveTime, specialist);
    }
    public boolean deleteTime(String doctorId) {
        SlotsModel model = new SlotsModel();
        return model.deleteDoctorTime(doctorId);
    }
    
    
    public void openDoctorForm() {
        view.Doctor d = new view.Doctor();
        d.setVisible(true);
    }
     public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
    
}
