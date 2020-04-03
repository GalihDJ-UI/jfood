import java.util.ArrayList;

public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        // put your code here
        return INVOICE_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id)
    {
        Invoice dummyInv = null;
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                dummyInv = invoice;
            }

            else
            {
                dummyInv = invoice;
            }
        }

        return dummyInv;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId)
    {
        ArrayList<Invoice> dummyInv = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == customerId)
            {
                dummyInv.add(invoice);
            }
        }

        return dummyInv;
    }

    public static boolean addInvoice(Invoice invoice)
    {
        for (Invoice invoice1 : INVOICE_DATABASE)
        {
            if (invoice1.getInvoiceStatus().equals(InvoiceStatus.Ongoing))
            {
                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus (int id, InvoiceStatus invoiceStatus)
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.Ongoing))
            {
                invoice.setInvoiceStatus(InvoiceStatus.Finished);
                return true;
            }
        }
        return false;
    }



    public static boolean removeInvoice(int id)
    {
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if (invoice.getId() == id)
            {
                INVOICE_DATABASE.remove (invoice);
                return true;
            }
        }
        return false;
    }
}
