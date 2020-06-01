package galih.jfood;

/**
 * Class exception untuk error handling ketika penjual tidak ditemukan
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public class SellerNotFoundException extends Exception
{
    private int seller_error;

    /**
     * Method untuk mendapatkan input yang dibutuhkan untuk parameter error handling
     * @param seller_input
     *
     */
    public SellerNotFoundException (int seller_input)
    {
        super("Seller ID: ");
        this.seller_error = seller_input;
    }

    /**
     * Method untuk mendapatkan error message
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + seller_error + " not found\n";
    }
}
