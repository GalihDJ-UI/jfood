package galih.jfood;
public class SellerNotFoundException extends Exception
{
    private int seller_error;

    /**
     * Mengatur value dari variable joinDate
     *
     * @param  joinDate dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable joinDate
     */
    public SellerNotFoundException (int seller_input)
    {
        super("Seller ID: ");
        this.seller_error = seller_input;
    }

    /**
     * Mengatur value dari variable joinDate
     *
     * @param  joinDate dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable joinDate
     */
    public String getMessage()
    {
        return super.getMessage() + seller_error + " not found\n";
    }
}
