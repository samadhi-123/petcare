/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.PaymentPageModel;
import java.sql.ResultSet;

public class PaymentPageController {
    public ResultSet loadPaymentData() {
        PaymentPageModel model = new PaymentPageModel();
        return model.getAllPayments();
    }

    public double calculateGrandTotal() {
        PaymentPageModel model = new PaymentPageModel();
        return model.getGrandTotal();
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
