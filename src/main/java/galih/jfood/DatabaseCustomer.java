package galih.jfood;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Class database yang menyimpan dan mengatur data pelanggan-pelanggan yang ada
 *
 * @author Galih Damar Jati
 * @version 5-Maret-2019
 */
public class DatabaseCustomer
{

    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int lastId = 0;

    /**
     * Method untuk mendapatkan daftar customer
     *
     * @return isi variable CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        // put your code here
        return CUSTOMER_DATABASE;
    }

    /**
     * Method getter untuk mendapatkan id terakhir
     *
     * @return isi variabel lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Method untuk mendapatkan customer berdasarkan idnya
     *
     */
    public static Customer getCustomerById(int id) throws CustomerNotFoundException
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

    /**
     * Method untuk menambahkan data customer
     *
     */
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


    /**
     * Method untuk menghapus data customer berdasarkan id
     *
     */
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


    /**
     * Method untuk mendapatkan data customer berdasarkan credentials login
     * @param email
     * @param password
     *
     */
    public static Customer getCustomerLogin(String email, String password)
    {
        for (Customer customer : CUSTOMER_DATABASE)
        {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password))
            {
                return customer;
            }
        }
        return null;
    }
}
