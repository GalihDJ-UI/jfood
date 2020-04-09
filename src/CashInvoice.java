import java.util.*;
import java.util.regex.*; 
import java.text.*;
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice {
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer) {
        // initialise instance variables
        super(id, foods, customer);
    }

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee) {
        // initialise instance variables
        super(id, foods, customer);
        this.deliveryFee = deliveryFee;
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

    public int getDeliveryFee() {
        // put your code here
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        // put your code here
        this.deliveryFee = deliveryFee;
    }

    public void setTotalPrice()
    {
        super.totalPrice = 0;
        for (Food foodList : getFoods())
        {
            super.totalPrice = super.totalPrice + foodList.getPrice();
        }
        super.totalPrice = super.totalPrice + deliveryFee;
    }

    //public void printData()
    //{
    //   System.out.println("=====INVOICE====="); 
    //   System.out.println("ID: "+getId());
    //   System.out.println("Food : "+getFood().getName());
    //   System.out.println("Date: "+getDate());
    //   System.out.println("Customer: "+getCustomer().getName());
    //   System.out.println("Delivery Fee: "+getDeliveryFee());
    //   System.out.println("Total Price: "+getTotalPrice());
    //   System.out.println("Status: "+getInvoiceStatus()); 
    //   System.out.println("Payment Type: "+getPaymentType());
    //}
    public String toString()
    {
        String string = "";
        Date date = getDate().getTime();
        String timeNow = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        timeNow = sdf.format(super.getDate().getTime());

        StringBuilder foods = new StringBuilder();
        for (Food foodList : getFoods())
        {
            foods.append(foodList.getName()).append(", ");
        }
        foods = new StringBuilder(foods.substring(0, foods.length() - 2));

        string = "\n===========INVOICE==============" +
                "\nID: " + super.getId() +
                "\nDate: " + timeNow +
                "\nFood: " + foods;

        if (deliveryFee > 0) {
            string = string + "\nDelivery Fee = " + deliveryFee;
        }
        string = string +
                "\nTotal Price: " + super.getTotalPrice() +
                "\nCustomer: " + super.getCustomer().getName() +
                "\nInvoice Status: " + getInvoiceStatus()+
                "\nPayment Type: " + PAYMENT_TYPE ;
        return string;
    }
}
