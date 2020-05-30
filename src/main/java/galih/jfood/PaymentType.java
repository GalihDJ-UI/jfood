package galih.jfood;
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Galih Damar Jati
 * @version 5-Maret-2019
 */
public enum PaymentType
{
    Cashless("Cashless"), Cash("Cash");
    private String type;

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    PaymentType (String type)
    {
     this.type = type;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return isi variable type
     */
    public String toString()
    {
    return type;
    }
}


