package galih.jfood;
public class EmailAlreadyExistException extends Exception
{
    private Customer customer_error;

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public EmailAlreadyExistException (Customer customer_input)
    {
        super("Customer Email: ");
        this.customer_error = customer_input;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public String getMessage()
    {
        return super.getMessage() + customer_error.getEmail() + " already exist.\n";
    }
}
