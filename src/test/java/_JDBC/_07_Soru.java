package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _07_Soru extends JDBCParent{

    // city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız

    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs = statement.executeQuery("select * from city");

        rs.last();
        int totalRows = rs.getRow();

        for (int i = 1; i <=totalRows-1 ; i++) {
            rs.first();
            rs.relative(i);
            System.out.println(rs.getString("city"));
        }
        DBConnectionClose();
    }
    //HOCANIN YOLU
    // public static void main(String[] args) throws SQLException {
    //        DBConnectionOpen();
    //
    //        ResultSet rs=statement.executeQuery("select city from city");
    //        rs.last();
    //        int sonSatirNo= rs.getRow();
    //        rs.first();
    //
    //        System.out.println(rs.getString(1));
    //        for (int i = 1; i < sonSatirNo; i++) {
    //            rs.relative(1);
    //            System.out.println(rs.getString(1));
    //        }
    //
    //        DBConnectionClose();
    //    }
}