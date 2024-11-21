package _JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrev extends JDBCParent {
    public static void main(String[] args) throws SQLException {
        DBConnectionOpen();

        ResultSet rs = statement.executeQuery("select * from language");
        rs.next(); //1 adım ileri git, sıradakine git
        System.out.println("1. satır:" + rs.getString(2)); //2 index değil kolon(sütun/name de yazılabilirdi yani)
        // sırası(sayma sayısı şeklinde gidiyor)

        rs.next(); //1 adım ileri git, sıradakine git
        System.out.println("2. satır:" + rs.getString(2)); //Italian (2: name ile aynı)

        rs.previous(); //2 adım geri git
        System.out.println("1. Satır:" + rs.getString(2)); //English

        DBConnectionClose();
    }
}