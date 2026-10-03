/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


public class ManagerController {
    
    public void openLogin() {
        view.Login1 l = new view.Login1();
        l.setVisible(true);
    }

    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }

    public void openMReport() {
        view.mreport mr = new view.mreport();
        mr.setVisible(true);
    }

    public void openTimeFrame() {
        view.TimeFrame tf = new view.TimeFrame();
        tf.setVisible(true);
    }

    public void openPaymentPage() {
        view.payment_page pp = new view.payment_page();
        pp.setVisible(true);
    }

    public void openEmployee() {
        view.employee e = new view.employee();
        e.setVisible(true);
    }
    
}
