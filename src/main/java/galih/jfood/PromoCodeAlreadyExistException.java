package galih.jfood;
public class PromoCodeAlreadyExistException extends Exception
{
    private Promo promo_error;

    /**
     * Mengatur value dari variable joinDate
     * @param promo_input
     *
     */
    public PromoCodeAlreadyExistException (Promo promo_input)
    {
        super("Promo Code: ");
        this.promo_error = promo_input;
    }

    /**
     * Mengatur value dari variable joinDate
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + promo_error.getCode() + " already exist.\n";
    }
}
