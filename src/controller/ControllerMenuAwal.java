package controller;

import model.ModelAdminLogin;
import model.ModelRegister;
import model.ModelUserLogin;
import view.ViewAdminLogin;
import view.ViewMenuAwal;
import view.ViewRegister;
import view.ViewUserLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMenuAwal {
    ViewMenuAwal viewMenuAwal;

    public ControllerMenuAwal(ViewMenuAwal view){
        this.viewMenuAwal = view;


        view.buttonLoginUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewUserLogin viewUserLogin = new ViewUserLogin();
                ModelUserLogin modelUserLogin = new ModelUserLogin();
                ControllerUserLogin controllerUserLogin = new ControllerUserLogin(modelUserLogin, viewUserLogin);
                view.dispose();
            }
        });

        view.buttonLoginAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewAdminLogin viewAdminLogin = new ViewAdminLogin();
                ModelAdminLogin modelAdminLogin = new ModelAdminLogin();
                ControllerAdminLogin controllerAdminLogin = new ControllerAdminLogin(modelAdminLogin, viewAdminLogin);
                view.dispose();
            }
        });

        view.buttonDaftarUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewRegister viewRegister = new ViewRegister();
                ModelRegister modelRegister = new ModelRegister();
                ControllerRegister controllerRegister = new ControllerRegister(viewRegister, modelRegister);
                view.dispose();
            }
        });
    }
}
