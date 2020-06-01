package galih.jfood;

/**
 * Class exception untuk error handling ketika invoice tidak ditemukan
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public class InvoiceNotFoundException extends Exception
{
    private int invoice_error;

    /**
     * Method untuk mendapatkan input yang dibutuhkan untuk parameter error handling
     * @param invoice_input
     *
     */
    public InvoiceNotFoundException (int invoice_input)
    {
        super("Invoice ID: ");
        this.invoice_error = invoice_input;
    }

    /**
     * Method untuk mendapatkan error message
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not found\n";
    }
}
