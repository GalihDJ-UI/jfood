package galih.jfood;
public class InvoiceNotFoundException extends Exception
{
    private int invoice_error;

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public InvoiceNotFoundException (int invoice_input)
    {
        super("Invoice ID: ");
        this.invoice_error = invoice_input;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found\n";
    }
}
