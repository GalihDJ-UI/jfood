package galih.jfood;
import java.util.*;
import java.util.regex.*;
import java.text.*;
/**
 * Write a description of class ClasslessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor for objects of class ClasslessInvoice
     * @return the sum of x and y
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer) {
        // initialise instance variables;
        super(id, foods, customer);
    }

    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo) {
        // initialise instance variables;
        super(id, foods, customer);
        this.promo = promo;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public PaymentType getPaymentType() {
        // put your code here
        return PAYMENT_TYPE;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public Promo getPromo() {
        // put your code here
        return promo;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public void setPromo(Promo promo) {
        // put your code here
        this.promo = promo;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
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
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
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