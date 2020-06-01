package galih.jfood;
import java.util.*;
import java.util.regex.*;
import java.text.*;
/**
 * Class yang menyimpan dan mengatur data yang dibutuhkan untuk cashless invoice
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public class CashlessInvoice extends Invoice
{

    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor untuk object pada class CashlessInvoice
     * @param id
     * @param foods
     * @param customer
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {

        super(id, foods, customer);
    }


    /**
     * Constructor untuk object pada class CashlessInvoice
     * @param id
     * @param foods
     * @param customer
     * @param promo
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, foods, customer);
        this.promo = promo;
    }

    /**
     * Method getter untuk mengambil tipe pembayaran
     *
     * @return isi variable PAYMENT_TYPE
     */
    public PaymentType getPaymentType()
    {
        // put your code here
        return PAYMENT_TYPE;
    }

    /**
     * Method getter untuk mendapatkan kode promo
     *
     * @return isi variable promo
     */
    public Promo getPromo()
    {
        return promo;
    }

    /**
     * Method setter untuk mengatur kode promo
     *
     */
    public void setPromo(Promo promo)
    {
        this.promo = promo;
    }

    /**
     * Method setter untuk mengatur harga total
     *
     */
    public void setTotalPrice()
    {
        super.totalPrice = 0;
        for (Food foodList : getFoods())
        {
            super.totalPrice = super.totalPrice + foodList.getPrice();
        }
        if (promo != null && promo.getActive() == true && super.totalPrice >= promo.getMinPrice())
        {
            totalPrice = totalPrice - promo.getDiscount();
        }
        else
        {
            super.totalPrice = super.totalPrice + 0;
        }
    }

    //public void printData()
    //{
    //  System.out.println("=====INVOICE=====");
    //  System.out.println("ID: "+getId());
    //   System.out.println("Food : "+getFood().getName());
    //   System.out.println("Date: "+getDate());
    //  System.out.println("Customer: "+getCustomer().getName());
    //  System.out.println("Total Price: "+getTotalPrice());
    //  System.out.println("Status: "+getInvoiceStatus());
    //   System.out.println("Payment Type: "+PAYMENT_TYPE);

    //   if((promo != null) && (promo.getActive() == true) && getFood().getPrice()>=promo.getMinPrice())
    //   {
    //    System.out.println("Promo: "+promo.getCode());
    //   }

    //}
    /**
     * Method untuk print data cashless invoice
     *
     * @return invoice transaksi cashless
     */
    public String toString()
    {
        String timeNow = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        timeNow = sdf.format(super.getDate().getTime());

        String a = "";
        for(Food foodList : getFoods())
        {
            a += foodList.getName();
        }
        setTotalPrice();

        if(promo == null || !promo.getActive() || super.totalPrice  < getPromo().getMinPrice())
        {
            return "==========INVOICE==========\n" +
                    "ID: " + super.getId() +
                    "\nFood:" + a +
                    "\nDate: " + timeNow +
                    "\nCustomer: " + super.getCustomer().getName() +
                    "\nTotal Price: " + getTotalPrice() +
                    "\nStatus: " + getInvoiceStatus() +
                    "\nPayment Type: " + PAYMENT_TYPE ;

        }
        else
        {
            return "==========INVOICE==========\n" +
                    "ID : " + super.getId() +
                    "\nFood: " + a +
                    "\nDate: " + timeNow +
                    "\nPromo: " + promo.getCode() +
                    "\nCustomer: " + super.getCustomer().getName() +
                    "\nTotal Price: " + getTotalPrice() +
                    "\nStatus: " + getInvoiceStatus() +
                    "\nPayment Type: " + PAYMENT_TYPE ;
        }
    }
}