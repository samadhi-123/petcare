/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

public class StaffController {
    public void openSearch() {
        view.search s = new view.search();
        s.setVisible(true);
    }

    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }

   public void openRegistration() {
        view.registration re = new view.registration();
        re.setVisible(true);
    }
   public void openPayment() {
        view.Payment p = new view.Payment();
        p.setVisible(true);
    }
   public void openStaffReport() {
        view.staffreport sr = new view.staffreport();
        sr.setVisible(true);
    }
   public void openLogin() {
        view.Login1 l1 = new view.Login1();
        l1.setVisible(true);
    }
    
}
