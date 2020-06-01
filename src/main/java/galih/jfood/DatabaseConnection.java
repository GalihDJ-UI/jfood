package galih.jfood;

import java.sql.*;

/**
 * Class untuk koneksi ke database postgresql
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class DatabaseConnection
{
    /**
     * Method untuk inisiasi koneksi ke database
     *
     */
    public static Connection connection ()
    {
        Connection c = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jbdc:postgresql://localhost:5432/jfood", "postgres", "admin");
            System.out.println("Database successfully opened!");
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return c;
    }
}
