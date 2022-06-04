package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewMenuAdmin extends JFrame {
    JLabel ljudul = new JLabel("Menu Admin");
    JLabel l = new JLabel("");

    public JButton buttonDelete = new JButton("Delete");

    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object[] columnName = {"ID Transaksi","Nama", "Game", "Harga", "Status"};

    public ViewMenuAdmin(){
        dtm = new DefaultTableModel(columnName, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        setSize(700,400);
        setTitle("Menu Admin");

        add(scrollPane);
        scrollPane.setBounds(20,50,480,300);

        add(ljudul);
        ljudul.setBounds(330,10,100,20);

        add(buttonDelete);
        buttonDelete.setBounds(520,190,120,20);

        add(l);
        l.setBounds(10,10,10,10);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }

}
