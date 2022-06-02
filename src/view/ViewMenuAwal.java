package view;

import javax.swing.*;

public class ViewMenuAwal extends JFrame {
    JLabel labelJudul = new JLabel("Top Up Voucher Game");
    public JButton buttonLoginUser = new JButton("Login User");
    public JButton buttonLoginAdmin = new JButton("Login Admin");
    public JButton buttonDaftarUser = new JButton("Daftar User");

    public ViewMenuAwal(){
        setTitle("Menu Awal");
        setSize(320, 260);

        setLayout(null);
        add(labelJudul);
        add(buttonLoginUser);
        add(buttonLoginAdmin);
        add(buttonDaftarUser);

        labelJudul.setBounds(130, 40, 200, 20);
        buttonLoginUser.setBounds(100, 100, 120, 20);
        buttonLoginAdmin.setBounds(100, 130, 120, 20);
        buttonDaftarUser.setBounds(100, 160, 120, 20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

}
