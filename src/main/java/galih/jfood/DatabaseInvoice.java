package galih.jfood;
import java.util.ArrayList;

public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        // put your code here
        return INVOICE_DATABASE;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
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
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
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
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
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
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
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
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
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
