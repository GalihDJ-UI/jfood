package galih.jfood;
public class PromoNotFoundException extends Exception
{
    private int promo_error;

    /**
     * Mengatur value dari variable joinDate
     *
     * @param  joinDate dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable joinDate
     */
    public PromoNotFoundException (int promo_input)
    {
        super("Promo ID: ");
        this.promo_error = promo_input;
    }

    /**
     * Mengatur value dari variable joinDate
     *
     * @param  joinDate dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable joinDate
     */
    public String getMessage()
    {
        return super.getMessage() + promo_error + " not found\n";
    }
}
