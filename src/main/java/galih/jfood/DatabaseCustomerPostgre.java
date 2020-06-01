package galih.jfood;

//import galih.jfood.EmailAlreadyExistException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;


/**
 * Class database yang menyimpan dan mengatur data pelanggan-pelanggan yang ada
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class DatabaseCustomerPostgre
{
    private static Connection c = null;
    private static Statement stmt = null;

    /**
     * Method untuk menambahkan data customer
     * @param customer
     *
     */
    public static Customer insertCustomer (Customer customer)
    {
        c = DatabaseConnection.connection();
        try
        {
            stmt = c.createStatement();
            int id = customer.getId();
            String name = customer.getName();
            String email = customer.getEmail();
            String password = customer.getPassword();
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);

            Date date = cal.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date);

            String query =  "INSERT INTO database_customer (id, name, email, password, join_date)"
                    + "VALUES (" + id + ",'" + name + "','"+ email + "','"+ password + "','" + date1 + "');";
            stmt.executeUpdate(query);
            stmt.close();
            c.close();
        }

        catch (SQLException e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return null;
        }
        return customer;
    }


    /**
     * Method getter untuk mendapatkan id pelanggan terakhir
     *
     */
    public static int getLastCustomerId()
    {
        int value = 0;
        c = DatabaseConnection.connection();
        try
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX (id) FROM database_customer;");
            while (rs.next())
            {
                value = rs.getInt("max");
            }
            rs.close();
            stmt.close();
            c.close();
        }

        catch (SQLException e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }

    /**
     * Method untuk mendapatkan customer berdasarkan idnya
     * @param id
     *
     */
    public static Customer getCustomerById(int id)
    {
        Customer value = null;
        c = DatabaseConnection.connection();
        try
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM database_customer WHERE id = "+ id +"");
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

        catch (SQLException e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return value;
    }

    /**
     * Method untuk menghapus data customer berdasarkan id
     * @param id
     *
     */
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

    /**
     * Method untuk mendapatkan data customer berdasarkan credentials login
     * @param emailInput
     * @param passwordInput
     *
     */
    public static Customer getCustomerLogin(String emailInput, String passwordInput)
    {
        Customer value = null;
        Connection c = DatabaseConnection.connection();

        try
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM database_customer WHERE email = '"+ emailInput +"' AND password = '"+ passwordInput + "';");
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

        catch (SQLException e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
            return null;
        }
        return value;
    }

    /**
     * Method untuk mendapatkan semua data customer pada database
     *
     */
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

        catch (SQLException e)
        {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return customers;
    }
}
