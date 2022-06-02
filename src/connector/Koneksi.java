package connector;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbtopupgame";
    static final String USER = "root";
    static final String PASS = "";
    public Connection connection;
    public Statement statement;

    public Koneksi(){
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("connector.Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("connector.Koneksi Gagal");
        }
    }
}
