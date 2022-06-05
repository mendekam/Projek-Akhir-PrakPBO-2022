package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewMenuUser extends JFrame{
    private final String[] game = {
            "Valorant",
            "Mobile Legends",
            "PUBG",
            "Free Fire"
    };

    private final String[] harga = {
            "5000",
            "10000",
            "20000",
            "50000",
            "100000"
    };

    JLabel labelNama = new JLabel("Nama");
    JLabel labelNamaGame = new JLabel("Game");
    JLabel labelHarga = new JLabel("Harga");

    public JTextField fieldNama = new JTextField();
    public JComboBox<String> comboBoxGame = new JComboBox<>(game);
    public JComboBox<String> comboBoxHarga = new JComboBox<>(harga);

    public JButton buttonBeli = new JButton("Beli");
    public JButton buttonBayar = new JButton("Bayar");
    public JButton buttonLogout = new JButton("Logout");

    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object[] columnName = {"ID Transaksi","Nama", "Nama Game", "Harga", "Status"};

    public ViewMenuUser() {
        dtm = new DefaultTableModel(columnName, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);

        setTitle("Menu User");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,400);

        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);

        add(labelNama);
        labelNama.setBounds(510, 20, 90, 20);
        add(fieldNama);
        fieldNama.setBounds(510, 40, 120, 20);

        add(labelNamaGame);
        labelNamaGame.setBounds(510, 60, 120, 20);
        add(comboBoxGame);
        comboBoxGame.setBounds(510, 80, 120, 20);

        add(labelHarga);
        labelHarga.setBounds(510, 100, 120, 20);
        add(comboBoxHarga);
        comboBoxHarga.setBounds(510, 120, 120, 20);

        add(buttonBeli);
        buttonBeli.setBounds(510, 190, 90, 20);

        add(buttonBayar);
        buttonBayar.setBounds(510, 220, 90, 20);

        add(buttonLogout);
        buttonLogout.setBounds(510, 250, 90, 20);

        setLocationRelativeTo(null);

    }

    public String getNama(){
        return fieldNama.getText();
    }

    public String getNamaGame(){
        return comboBoxGame.getSelectedItem().toString();
    }

    public String getHarga(){
        return comboBoxHarga.getSelectedItem().toString();
    }
}
