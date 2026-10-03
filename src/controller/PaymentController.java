/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.PaymentModel;

public class PaymentController {
    public boolean savePaymentData(String date, String ownerId, String petName, String medicine, String quantity, String unit, double totalBill) {
        PaymentModel model = new PaymentModel();
        return model.savePayment(date, ownerId, petName, medicine, quantity, unit, totalBill);
    }
    
    public void openStaff() {
        view.staff s = new view.staff();
        s.setVisible(true);
    }
    public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
    
}
