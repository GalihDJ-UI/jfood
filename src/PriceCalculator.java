public class PriceCalculator implements Runnable
{
    Invoice invoice;

    public PriceCalculator (Invoice invoice)
    {
        this.invoice = invoice;
    }

    public void run ()
    {
        System.out.println("Calculating invoice ID: " + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("Finish calculating invoice ID: " + invoice.getId());
    }

}
