package galih.jfood;
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
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
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

    public static  Customer getCustomerById(int id) throws CustomerNotFoundException
    {
        for (Customer customer : CUSTOMER_DATABASE)
        {
            if (customer.getId() == id)
            {
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);
    }


    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistException
    {
        for(Customer customer1 : CUSTOMER_DATABASE)
        {
            if (customer1.getEmail().equals(customer.getEmail()))
            {
                throw new EmailAlreadyExistException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        lastId = customer.getId();
        return true;

    }

    

    public static boolean removeCustomer(int id) throws CustomerNotFoundException
    {
        for (Customer customer : CUSTOMER_DATABASE)
        {

            if (customer.getId() == id)
            {
                CUSTOMER_DATABASE.remove (customer);
                return true;
            }

        }

        throw new CustomerNotFoundException(id);
    }
}
