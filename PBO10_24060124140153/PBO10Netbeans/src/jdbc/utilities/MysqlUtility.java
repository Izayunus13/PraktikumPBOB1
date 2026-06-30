package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3307/jdbc_mhs";
                String user = "root";
                String password = "Uhuy13";

                koneksi = DriverManager.getConnection(url, user, password);

                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }

            } catch (ClassNotFoundException e) {
                System.out.println("Gagal load driver: " + e.getMessage());

            } catch (SQLException e) {
                System.out.println("Gagal koneksi: " + e.getMessage());
            }
        }

        return koneksi;
    }
}