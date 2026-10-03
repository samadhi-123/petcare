/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


public class HomeController {
    public void openLogin() {
        view.Login1 l = new view.Login1();
        l.setVisible(true);
        
    }
    public void openRegister() {
        view.Register1 r = new view.Register1();
        r.setVisible(true);
    }
    
}
