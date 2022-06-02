package controller;

import model.ModelUserLogin;
import view.ViewMenuAwal;
import view.ViewUserLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerUserLogin {
    ModelUserLogin modelUserLogin;
    ViewUserLogin viewUserLogin;

    public ControllerUserLogin(ModelUserLogin model, ViewUserLogin view){
        this.modelUserLogin = model;
        this.viewUserLogin = view;

        view.buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = view.getTextUsername();
                String password = view.getTextPassword();

                modelUserLogin.readDataUser(username, password);
                view.dispose();
            }
        });

        view.buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.textUsername.setText("");
                view.textPassword.setText("");
            }
        });

        view.buttonKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewMenuAwal viewMenuAwal = new ViewMenuAwal();
                ControllerMenuAwal controllerMenuAwal = new ControllerMenuAwal(viewMenuAwal);
                view.dispose();
            }
        });
    }
}
