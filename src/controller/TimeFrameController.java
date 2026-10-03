/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.TimeFrameModel;
import java.sql.ResultSet;

public class TimeFrameController {
    
    public ResultSet loadAllData() {
        TimeFrameModel model = new TimeFrameModel();
        return model.getAllTimeFrames();
    }

    public ResultSet searchByDoctor(String doctorName) {
        TimeFrameModel model = new TimeFrameModel();
        return model.getTimeFrameByDoctor(doctorName);
    }

    public boolean deleteData(String doctorId) {
        TimeFrameModel model = new TimeFrameModel();
        return model.deleteTimeFrame(doctorId);
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
