package galih.jfood;
public class PriceCalculator implements Runnable
{
    Invoice invoice;

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public PriceCalculator (Invoice invoice)
    {
        this.invoice = invoice;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public void run ()
    {
        System.out.println("Calculating invoice ID: " + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("Finish calculating invoice ID: " + invoice.getId());
    }

}
