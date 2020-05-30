package galih.jfood;

import java.sql.*;

public class DatabaseConnection
{
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
