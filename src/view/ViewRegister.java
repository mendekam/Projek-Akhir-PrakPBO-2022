package view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ViewRegister extends JFrame {

    JLabel labelJudul = new JLabel("Daftar User");
    JLabel labelUsername = new JLabel("Username : ");
    JLabel labelPassword = new JLabel("Password : ");
    JLabel labelEmail = new JLabel("Email : ");

    public JTextField textUsername = new JTextField(30);
    public JTextField textEmail = new JTextField(30);
    public JTextField textPassword = new JTextField(30);

    public JButton buttonDaftar = new JButton("Daftar User");
    public JButton buttonReset = new JButton("Reset Form");
    public JButton buttonKembali = new JButton("Kembali ke Menu Utama");

    public ViewRegister() {
        setTitle("Daftar Member");
        setSize(470, 300);

        setLayout(null);
        add(labelJudul);
        add(textUsername);
        add(labelUsername);
        add(textEmail);
        add(labelEmail);
        add(textPassword);
        add(labelPassword);
        add(buttonDaftar);
        add(buttonReset);
        add(buttonKembali);

        labelJudul.setBounds(205, 40, 200, 20);
        labelUsername.setBounds(60, 90, 200, 20);
        textUsername.setBounds(190, 90, 200, 20);
        labelPassword.setBounds(60, 120, 200, 20);
        textPassword.setBounds(190, 120, 200, 20);
        labelEmail.setBounds(60, 150, 200, 20);
        textEmail.setBounds(190, 150, 200, 20);

        buttonDaftar.setBounds(110, 200, 120, 20);
        buttonReset.setBounds(240, 200, 120, 20);
        buttonKembali.setBounds(110, 220, 250, 20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public String getTextUsername() {
        return textUsername.getText();
    }

    public String getTextEmail() {
        return textEmail.getText();
    }

    public String getTextPassword() {
        return textPassword.getText();
    }

}
