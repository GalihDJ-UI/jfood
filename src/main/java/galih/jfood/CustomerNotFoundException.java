package galih.jfood;
public class CustomerNotFoundException extends Exception
{
    private int customer_error;

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public CustomerNotFoundException (int customer_input)
    {
        super("Customer ID: ");
        this.customer_error = customer_input;
    }

    /**
     * Method getter untuk mendapatkan error message
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + customer_error + " not found\n";
    }
}
