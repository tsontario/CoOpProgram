package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by timothysmith on 2017-03-15.
 */
public class DBConnection {

    public static void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection db = DriverManager.getConnection("jdbc:postgresql://web0.site.uottawa.ca:15432/tsmit094",
                    "tsmit094", "Ec0n2133");
            System.out.println("Successfully Connected!");
        }
        catch (Exception e) {
            System.err.print("Something bad happened");
        }
    }

}
