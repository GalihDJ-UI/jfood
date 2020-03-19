
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
     */
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables;
        super(id, food, date, customer, invoiceStatus);
    }
    
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        // initialise instance variables;
        super(id, food, date, customer, invoiceStatus);
        this.promo = promo;
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
    
    public Promo getPromo()
    {
        // put your code here
        return promo;
    }
    
    public void setPromo()
    {
        // put your code here
        this.promo = promo;
    }
    
    public void setTotalPrice()
    {
        // put your code here
        if ((promo != null) && (promo.getActive() == true) && (getFood().getPrice() >= getPromo().getMinPrice()))
        {
          super.totalPrice = (getFood().getPrice()) - (promo.getDiscount());
        }
        
        else
        {
          super.totalPrice = getFood().getPrice();
        }
        
    }
    
    public void printData()
    {
       System.out.println("=====INVOICE====="); 
       System.out.println("ID: "+getId());
       System.out.println("Food : "+getFood().getName());
       System.out.println("Date: "+getDate());
       System.out.println("Customer: "+getCustomer().getName()); 
       System.out.println("Total Price: "+getTotalPrice());
       System.out.println("Status: "+getInvoiceStatus()); 
       System.out.println("Payment Type: "+PAYMENT_TYPE);
        
       if((promo != null) && (promo.getActive() == true) && getFood().getPrice()>=promo.getMinPrice()) 
       {
         System.out.println("Promo: "+promo.getCode());
       }
      
    }
}