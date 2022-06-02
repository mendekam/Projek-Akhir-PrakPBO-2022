package controller;

import model.ModelAdminLogin;
import view.ViewMenuAwal;
import view.ViewAdminLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAdminLogin {
    ModelAdminLogin modelAdminLogin;
    ViewAdminLogin viewAdminLogin;

    public ControllerAdminLogin(ModelAdminLogin model, ViewAdminLogin view){
        this.modelAdminLogin = model;
        this.viewAdminLogin = view;

        view.buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = view.getTextUsername();
                String password = view.getTextPassword();

                modelAdminLogin.readDataAdmin(username, password);
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
