package galih.jfood;
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"), Finished("Finished"), Canceled("Canceled");
    private String status;

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    InvoiceStatus (String status)
    {
     this.status = status;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return isi variable status
     */
    public String toString()
    {
        return status;
    }
}
