package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

public class ViewUserLogin extends JFrame{

    JLabel labelJudul = new JLabel("Login User");
    JLabel labelUsername = new JLabel("Username : ");
    JLabel labelPassword = new JLabel("Password : ");
    public JTextField textUsername = new JTextField(30);
    public JPasswordField textPassword = new JPasswordField(30);
    public JButton buttonLogin = new JButton("Login");
    public JButton buttonReset = new JButton("Reset");
    public JButton buttonKembali = new JButton("Kembali ke Menu Awal");

    public ViewUserLogin() {
        setTitle("Login User");
        setSize(430, 280);

        setLayout(null);
        add(labelJudul);
        add(textUsername);
        add(labelUsername);
        add(textPassword);
        add(labelPassword);
        add(buttonLogin);
        add(buttonReset);
        add(buttonKembali);

        labelJudul.setBounds(170, 40, 200, 20);
        labelUsername.setBounds(60, 90, 200, 20);
        textUsername.setBounds(140, 90, 200, 20);
        labelPassword.setBounds(60, 120, 200, 20);
        textPassword.setBounds(140, 120, 200, 20);
        buttonLogin.setBounds(115, 160, 90, 20);
        buttonReset.setBounds(215, 160, 90, 20);
        buttonKembali.setBounds(115, 190, 190, 20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


    }

    public String getTextUsername() {
        return textUsername.getText();
    }

    public String getTextPassword() {
        return textPassword.getText();
    }


}
