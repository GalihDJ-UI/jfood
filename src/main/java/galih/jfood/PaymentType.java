package galih.jfood;
/**
 * Class enum berisi metode pembayaran yang memungkinkan
 *
 * @author Galih Damar Jati
 * @version 5-Maret-2019
 */
public enum PaymentType
{
    Cashless("Cashless"), Cash("Cash");
    private String type;

    /**
     *  Mengatur value dari variable type dengan salah satu metode pembayaran yang dibuat pada enum di atas
     * @param type
     *
     */
    PaymentType (String type)
    {
        this.type = type;
    }

    /**
     * Method untuk print data metode pembayaran
     *
     * @return isi variable type
     */
    public String toString()
    {
        return type;
    }
}


