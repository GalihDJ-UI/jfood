import java.util.*;
import java.util.regex.*; 
import java.text.*;
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        super(id, food, customer, invoiceStatus);
    }
    
    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        // initialise instance variables
        super(id, food, customer, invoiceStatus);
        this.deliveryFee = deliveryFee;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public PaymentType getPaymentType()
    {
        // put your code here
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee()
    {
        // put your code here
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        // put your code here
        this.deliveryFee = deliveryFee;
    }
    
    public void setTotalPrice()
    {
        // put your code here
        if ((getDeliveryFee() > 0))
        {
          super.totalPrice = (getFood().getPrice()) + getDeliveryFee();
        }
        
        else
        {
          super.totalPrice = getFood().getPrice();
        }
        
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
      String date = "";
      SimpleDateFormat simpleDate = new SimpleDateFormat("dd MMMM yyyy");
      if(getDate() != null)
      {
          date = simpleDate.format(getDate().getTime());
      }
      return  "==========INVOICE==========" + "\nId = "+getId()+"\nFood = "+getFood().getName()+ "\n Date = "+date
      +"\nCustomer: "+getCustomer().getName()+"\nDelivery Fee: "+getDeliveryFee()
      +"\nTotal Price: "+getTotalPrice()+ "\nStatus: "+getInvoiceStatus()
      +"\nPayment Type: "+getPaymentType();
    }
}
