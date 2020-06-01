package galih.jfood;

/**
 * Class exception untuk error handling ketika invoice ongoing masih ada
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public class OngoingInvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    /**
     * Method untuk mendapatkan input yang dibutuhkan untuk parameter error handling
     * @param invoice_input
     *
     */
    public OngoingInvoiceAlreadyExistsException (Invoice invoice_input)
    {
        super("Ongoing Invoice");
        this.invoice_error = invoice_input;
    }

    /**
     * Method untuk mendapatkan error message
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() +  " already exist.\n";
    }
}
