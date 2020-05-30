package galih.jfood;
public class OngoingInvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input)
    {
        super("Ongoing Invoice");
        this.invoice_error = invoice_input;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public String getMessage()
    {
        return super.getMessage() +  " already exist.\n";
    }
}
