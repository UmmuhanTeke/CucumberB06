package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Soru_2 extends JDBCParent{
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet result=statement.executeQuery("select * from city");

        while (result.next())
            System.out.println(result.getString("city"));

        DBConnectionClose();
    }
}