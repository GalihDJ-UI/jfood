public class PromoCodeAlreadyExistException extends Exception
{
    private Promo promo_error;

    public PromoCodeAlreadyExistException (Promo promo_input)
    {
        super("Promo Code: ");
        this.promo_error = promo_input;
    }

    public String getMessage()
    {
        return super.getMessage() + promo_error.getCode() + " already exist.\n";
    }
}
