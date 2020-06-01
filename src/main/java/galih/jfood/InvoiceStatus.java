package galih.jfood;
/**
 * Class enum berisi status-status invoice yang memungkinkan
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public enum InvoiceStatus
{
    Ongoing("Ongoing"), Finished("Finished"), Canceled("Canceled");
    private String status;

    /**
     * Mengatur value dari variable status dengan salah satu status yang dibuat di atas
     * @param status
     *
     */
    InvoiceStatus (String status)
    {
     this.status = status;
    }

    /**
     * Method untuk print data status invoice
     *
     * @return isi variable status
     */
    public String toString()
    {
        return status;
    }
}
