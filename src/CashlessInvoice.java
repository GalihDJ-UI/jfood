import java.util.*;
import java.util.regex.*;
import java.text.*;
/**
 * Write a description of class ClasslessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice {
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;

    /**
     * Constructor for objects of class ClasslessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, InvoiceStatus invoiceStatus) {
        // initialise instance variables;
        super(id, foods, customer, invoiceStatus);
    }

    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, InvoiceStatus invoiceStatus, Promo promo) {
        // initialise instance variables;
        super(id, foods, customer, invoiceStatus);
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

    public Promo getPromo() {
        // put your code here
        return promo;
    }

    public void setPromo() {
        // put your code here
        this.promo = promo;
    }

    public void setTotalPrice() {
//        // put your code here
//        if ((promo != null) && (promo.getActive() == true) && (getFoods().getPrice() >= getPromo().getMinPrice()))
//        {
//          super.totalPrice = (getFoods().getPrice()) - (promo.getDiscount());
//        }

//        else
//        {
//          super.totalPrice = getFoods().getPrice();
//        }

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
    public String toString()
    {
        StringBuilder foods = new StringBuilder();
        for (Food foodList : getFoods()) {
            foods.append(foodList.getName()).append(", ");
        }
        foods = new StringBuilder(foods.substring(0, foods.length() - 2));
        setTotalPrice();
        String timeNow = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        timeNow = sdf.format(super.getDate().getTime());
        if(promo == null  || !promo.getActive() || super.totalPrice  < getPromo().getMinPrice())
        {
            return "==========INVOICE==========\n" +
                    "ID : " + super.getId() +
                    "\nFood" + foods +
                    "\nDate: " + timeNow +
                    "\nCustomer: " + super.getCustomer().getName() +
                    "\nTotal Price: " + getTotalPrice() +
                    "\nStatus: " + super.getInvoiceStatus() +
                    "\nPayment Type: " + PAYMENT_TYPE ;

        }

        else
        {
            return "==========INVOICE==========\n" +
                    "ID : " + super.getId() +
                    "\nFood: " + foods +
                    "\nDate: " + timeNow +
                    "\nPromo: " + promo.getCode() +
                    "\nCustomer: " + super.getCustomer().getName() +
                    "\nTotal Price: " + getTotalPrice() +
                    "\nStatus: " + super.getInvoiceStatus() +
                    "\nPayment Type: " + PAYMENT_TYPE ;
        }
}}