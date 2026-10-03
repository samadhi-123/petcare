/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


public class DoctorController {
    public void openSlots() {
        view.slots s = new view.slots();
        s.setVisible(true);
    }

    public void openPetSearch() {
        view.pets_search ps = new view.pets_search();
        ps.setVisible(true);
    }

    public void openDoctorReports() {
        view.doctorReports dr = new view.doctorReports();
        dr.setVisible(true);
    }

    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
    
}
