import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Galih Damar Jati
 * @version 5-Maret-2019
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId = 0;
    /**
     * Constructor for objects of class DatabaseCustomer
     */
    //public DatabaseCustomer()
    //{
        // initialise instance variables
    //}


    public static ArrayList<Customer> getCustomerDatabase()
    {
        // put your code here
        return CUSTOMER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static  Customer getCustomerById(int id)
    {
        Customer dummyCus = null;
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
        {
            Customer customer = CUSTOMER_DATABASE.get(i);
            if (customer.getId() == id)
            {
                dummyCus = customer;
            }

            else
            {
                dummyCus = customer;
            }
        }

        return dummyCus;
    }

    public static boolean addCustomer(Customer customer)
    {
        // put your code here

        boolean cusStatus = false;
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
        {
            Customer customer1 = CUSTOMER_DATABASE.get(i);
            if (customer1.getEmail() != customer.getEmail())
            {
                CUSTOMER_DATABASE.add(customer);
                lastId = customer.getId();
                cusStatus = true;
            }

            else
            {
                cusStatus = false;
            }
        }

        return cusStatus;
    }
    

    public static boolean removeCustomer(int id)
    {
        boolean cusStatus = false;
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++)
        {
            Customer customer = CUSTOMER_DATABASE.get(i);
            if (customer.getId() == id)
            {
                CUSTOMER_DATABASE.remove (customer);
                cusStatus = true;
            }

            else
            {
                cusStatus = false;
            }
        }

        return cusStatus;
    }
    

}
