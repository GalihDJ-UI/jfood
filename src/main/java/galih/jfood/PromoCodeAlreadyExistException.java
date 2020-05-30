package galih.jfood;
public class PromoCodeAlreadyExistException extends Exception
{
    private Promo promo_error;

    /**
     * Mengatur value dari variable joinDate
     *
     * @param  joinDate dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable joinDate
     */
    public PromoCodeAlreadyExistException (Promo promo_input)
    {
        super("Promo Code: ");
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
        return super.getMessage() + promo_error.getCode() + " already exist.\n";
    }
}
