package model;

import connector.Koneksi;
import controller.ControllerAdminLogin;
import view.ViewAdminLogin;
import view.ViewMenuUser;

import javax.swing.*;
import java.sql.ResultSet;

public class ModelAdminLogin {
    Koneksi koneksi = new Koneksi();

    public void readDataAdmin(String username, String password){
        try {
            String query = "select * from admin where username = '"+username+"'";
            koneksi.statement = koneksi.connection.createStatement();
            ResultSet resultSet = koneksi.statement.executeQuery(query);
            if(resultSet.next()){
                if(username.equals(resultSet.getString("username")) && password.equals(resultSet.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    new ViewMenuUser();

                }
                else{
                    JOptionPane.showMessageDialog(null, "Password Salah");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Anda Bukan Admin");
                ViewAdminLogin viewAdminLogin = new ViewAdminLogin();
                ModelAdminLogin modelAdminLogin = new ModelAdminLogin();
                ControllerAdminLogin controllerAdminLogin = new ControllerAdminLogin(modelAdminLogin, viewAdminLogin);
            }
        } catch (Exception ex) {
            if(ex.getMessage() == "empty String") {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
            }
            else{
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

}
