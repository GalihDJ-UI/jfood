package galih.jfood;

/**
 * Class yang menghitung harga
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class PriceCalculator implements Runnable
{
    Invoice invoice;

    /**
     * Mengatur invoice yang akan dihitung harganya
     *
     * @param invoice
     */
    public PriceCalculator (Invoice invoice)
    {
        this.invoice = invoice;
    }

    /**
     * Method untuk menjalankan fungsi penghitungan harga
     *
     */
    public void run ()
    {
        System.out.println("Calculating invoice ID: " + invoice.getId());
        invoice.setTotalPrice();
        System.out.println("Finish calculating invoice ID: " + invoice.getId());
    }

}
