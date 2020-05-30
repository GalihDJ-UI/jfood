package galih.jfood;

//import galih.jfood.EmailAlreadyExistException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatabaseCustomerPostgre
{
    private static Connection c = null;
    private static Statement stmt = null;

    public static boolean insertCustomer (Customer customer)
    {
        c = DatabaseConnection.connection();
        try
        {
            stmt = c.createStatement();
            String query = "INSERT INTO database_customer VALUES (\"+customer.getId()+\",'\"+customer.getName()+\"','\"+customer.getEmail()+\"','\"+customer.getPassword()+\"');\";";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        }

        catch (SQLException e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return true;
    }

    public static int getLastCustomerId()
    {
        int value = 0;
        c = DatabaseConnection.connection();
        try
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX id AS custId FROM database_customer");
            while (rs.next())
            {
                value = rs.getInt("custId");
            }
            rs.close();
            stmt.close();
            c.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }

    public static Customer getCustomerById(int id)
    {
        Customer value = null;
        c = DatabaseConnection.connection();
        try
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM database_customer WHERE id = \"+id+\";\"");
            while (rs.next())
            {
                id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("join_date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Customer(id, name, email, password, calendar);
            }
            stmt.close();
            c.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }

    public static boolean removeCustomer(int id)
    {
        c = DatabaseConnection.connection();
        try
        {
            stmt = c.createStatement();
            String query = "DELETE * FROM database_customer WHERE id = \"+id+\";\"";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return true;
    }

    public static Customer getCustomerLogin(String emailInput, String passwordInput)
    {
        Customer value = null;
        Connection c = DatabaseConnection.connection();

        try
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM database_customer WHERE email = "+ emailInput +" AND password = "+ passwordInput + ";");
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("join_date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Customer(id, name, email, password, calendar);
            }
            rs.close();
            stmt.close();
            c.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }

    public static ArrayList<Customer> getCustomerDatabase()
    {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer value = null;
        Connection c = DatabaseConnection.connection();

        try {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer;");
            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                Date joinDate = rs.getDate("join_date");
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(joinDate);
                String password = rs.getString("password");
                value = new Customer(id, name, email, password, calendar);
                customers.add(value);
            }
            rs.close();
            stmt.close();
            c.close();
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return customers;
    }
}
