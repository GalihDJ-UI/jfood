
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
    
    PaymentType (String type)
    {
     this.type = type;
    }
    
    public String toString()
    {
    return type;
    }
}


