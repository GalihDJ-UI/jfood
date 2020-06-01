package galih.jfood;

/**
 * Class exception untuk error handling ketika email sudah ada
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class EmailAlreadyExistException extends Exception
{
    private Customer customer_error;

    /**
     * Method untuk mendapatkan input yang dibutuhkan untuk parameter error handling
     * @param customer_input
     *
     */
    public EmailAlreadyExistException (Customer customer_input)
    {
        super("Customer Email: ");
        this.customer_error = customer_input;
    }

    /**
     * Method untuk mendapatkan error message
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + customer_error.getEmail() + " already exist.\n";
    }
}
