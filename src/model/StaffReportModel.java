/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class StaffReportModel {
    public void generateOwnersAndPetsReport() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            InputStream reportStream = getClass().getResourceAsStream("/reports/petdetails.jasper");
            JasperPrint jp = JasperFillManager.fillReport(reportStream, null, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void generateCustomerPaymentReport() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petcare_db", "root", "");
            InputStream reportStream = getClass().getResourceAsStream("/reports/mpayment2.jasper");
            JasperPrint jp = JasperFillManager.fillReport(reportStream, null, con);
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void openHome() {
        view.home1 h1 = new view.home1();
        h1.setVisible(true);
    }
    
    
}
