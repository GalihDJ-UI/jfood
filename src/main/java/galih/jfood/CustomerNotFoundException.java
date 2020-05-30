package galih.jfood;
public class CustomerNotFoundException extends Exception
{
    private int customer_error;

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public CustomerNotFoundException (int customer_input)
    {
        super("Customer ID: ");
        this.customer_error = customer_input;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public String getMessage()
    {
        return super.getMessage() + customer_error + " not found\n";
    }
}
