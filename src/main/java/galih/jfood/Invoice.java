package galih.jfood;
import java.util.*;
import java.util.regex.*; 
import java.text.*;
/**
 * Menyimpan bukti transaksi
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Food> foods = new ArrayList<Food>();
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    
    /**
     * Constructor for objects of class Invoice

     */
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        // initialise instance variables
        this.id = id;
        this.foods = foods;
        this.customer = customer;
        this.invoiceStatus = invoiceStatus.Ongoing;
        this.date = Calendar.getInstance();
    }

    /**
     * Digunakan untuk mendapatkan id transaksi
     *
     * @return Isi variable id
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    /**
     * Digunakan untuk mendapatkan id makanan
     *
     * @return Isi variable idFood
     */
    public ArrayList<Food> getFoods()
    {
        // put your code here
        return foods;
    }
    
    /**
     * Digunakan untuk mendapatkan tanggal
     *
     * @return Isi variable date
     */
    public Calendar getDate()
    {
        // put your code here
        return date;
    }
    
    /**
     * Digunakan untuk mendapatkan total harga transaksi
     *
     * @return Isi variable totalPrice
     */
    public int getTotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    
    /**
     * Digunakan untuk mendapatkan nama pelanggan
     *
     * @return Isi variable customer
     */
    public Customer getCustomer()
    {
        // put your code here
        return customer;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public abstract PaymentType getPaymentType();
    
    
    /**
     * 
     *
     * @return 
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return invoiceStatus;
    }
    
    /**
     * Mengatur value dari variable id
     *
     * @param  id dengan tipe data integer
     * @return Value pada parameter dimasukkan ke variable id
     */
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }
    
    /**
     * Mengatur value dari variable idFood
     *

     * @return Value pada parameter dimasukkan ke variable idFood
     */
    public void setFoods(ArrayList<Food> foods)
    {
        // put your code here
        this.foods = foods;
    }
    
    /**
     * Mengatur value dari variable date
     *

     * @return Value pada parameter dimasukkan ke variable date
     */
    public void setDate(Calendar date)
    {
        // put your code here
        this.date = date;
    }
    
    public void setDate(int year, int month, int dayOfMonth)
    {
        // put your code here
        this.date = new GregorianCalendar (year, month-1, dayOfMonth);
    }
    
    /**
     * Mengatur value dari variable totalPrice
     *

     * @return Value pada parameter dimasukkan ke variable totalPrice
     */
    public abstract void setTotalPrice();
    //{
        // put your code here
    //}
    
    /**
     * Mengatur value dari variable customer
     *

     * @return Value pada parameter dimasukkan ke variable customer
     */
    public void setCustomer(Customer customer)
    {
        // put your code here
        this.customer = customer;
    }

    /**
     * 
     *
     * @param  
     * @return 
     */

    public void status(InvoiceStatus status)
    {
        this.invoiceStatus = InvoiceStatus.Ongoing;

    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        // put your code here
        this.invoiceStatus = invoiceStatus;
    }
    
    /**
     * Untuk print data variable pada class ini
     *

     * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
     */
    //public abstract void printData();
    //{
      //System.out.println("=====INVOICE=====");  
      //System.out.println("ID: "+id);
      //System.out.println("Food ID: "+idFood);
      //System.out.println("Date: "+date);
      //System.out.println("Customer: "+customer.getName()); 
      //System.out.println("Total Price: "+totalPrice);
      //System.out.println("Status: "+status); 
    //}
    
    public abstract String toString();
    {

    }
}
