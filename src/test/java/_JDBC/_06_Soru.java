package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Soru extends JDBCParent{
    // city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız

    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs = statement.executeQuery("select * from city");

        rs.last(); //son satıra git
        int totalRows = rs.getRow(); //tüm satırları getirdim, totalRows içerisine attım.

        for (int i = 1; i <= totalRows; i++) {
            rs.absolute(i);
            System.out.println("City: " + rs.getString("city")); // 1 de verebilirdik, sütun no veya adı
        }
        DBConnectionClose();
    }
}