package galih.jfood;
import java.util.ArrayList;


/**
 * Class database yang menyimpan dan mengatur data invoice-invoice yang ada
 *
 * @author Galih Damar Jati
 * @version 29-Mei-2019
 */

public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    /**
     * Method untuk mendapatkan daftar invoice
     *
     * @return isi variable INVOICE_DATABASE
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        // put your code here
        return INVOICE_DATABASE;
    }

    /**
     * Method getter untuk mendapatkan id terakhir
     *
     * @return isi variabel lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Method untuk mendapatkan invoice berdasarkan id
     *
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    /**
     * Method untuk mendapatkan invoice berdasarkan pelanggan
     *
     * @return dummyInv yang berisi invoice
     */
    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId)
    {
        ArrayList<Invoice> dummyInv = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getCustomer().getId() == customerId)
            {
                dummyInv.add(invoice);
            }
        }

        return dummyInv;
    }

    /**
     * Method untuk menambahkan invoice
     *
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException
    {
        int customerId = invoice.getCustomer().getId();
        for (Invoice invoice1 : INVOICE_DATABASE)
        {
            if (invoice1.getCustomer().getId() == customerId && invoice1.getInvoiceStatus().equals(InvoiceStatus.Ongoing))
            {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    /**
     * Method untuk mengganti status invoice yang ongoing
     *
     */
    public static boolean changeInvoiceStatus (int id, InvoiceStatus invoiceStatus)
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.Ongoing))
            {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }


    /**
     * Method untuk menghapus invoice
     *
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                INVOICE_DATABASE.remove (invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
