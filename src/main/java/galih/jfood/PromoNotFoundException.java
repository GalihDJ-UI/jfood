package galih.jfood;

/**
 * Class exception untuk error handling ketika promo tidak ditemukan
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public class PromoNotFoundException extends Exception
{
    private int promo_error;

    /**
     * Method untuk mendapatkan input yang dibutuhkan untuk parameter error handling
     * @param promo_input
     *
     */
    public PromoNotFoundException (int promo_input)
    {
        super("Promo ID: ");
        this.promo_error = promo_input;
    }

    /**
     * Method untuk mendapatkan error message
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + promo_error + " not found\n";
    }
}
