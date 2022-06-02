package model;

import connector.Koneksi;
import controller.ControllerUserLogin;
import view.ViewMenuUser;
import view.ViewUserLogin;

import javax.swing.*;
import java.sql.ResultSet;

public class ModelUserLogin {
    Koneksi koneksi = new Koneksi();

    public void readDataUser(String username, String password){
        try {
            String query = "select * from user where username = '"+username+"'";
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
                JOptionPane.showMessageDialog(null, "Username Tidak Ada");
                ViewUserLogin viewUserLogin = new ViewUserLogin();
                ModelUserLogin modelUserLogin = new ModelUserLogin();
                ControllerUserLogin controllerUserLogin = new ControllerUserLogin(modelUserLogin, viewUserLogin);
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
