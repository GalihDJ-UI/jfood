package galih.jfood;
import java.util.*;
import java.util.regex.*; 
import java.text.*;
/**
 * Class yang menyimpan dan mengatur data invoice
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public abstract class Invoice
{
    private int id;
    private ArrayList<Food> foods = new ArrayList<Food>();
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor untuk object pada class invoice
     * @param id
     * @param foods
     * @param customer
     */
    public Invoice(int id, ArrayList<Food> foods, Customer customer)
    {
        this.id = id;
        this.foods = foods;
        this.customer = customer;
        this.invoiceStatus = invoiceStatus.Ongoing;
        this.date = Calendar.getInstance();
    }

    /**
     * Method getter untuk mendapatkan id transaksi
     *
     * @return Isi variable id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method getter untuk mendapatkan makanan
     *
     * @return isi variable foods
     */
    public ArrayList<Food> getFoods()
    {
        return foods;
    }
    
    /**
     * Method getter untuk mendapatkan tanggal
     *
     * @return Isi variable date
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /**
     * Method getter untuk mendapatkan total harga transaksi
     *
     * @return Isi variable totalPrice
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /**
     * Method getter untuk mendapatkan nama pelanggan
     *
     * @return Isi variable customer
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    
    /**
     * Method abstract untuk mendapatkan tipe pembayaran
     *
     */
    public abstract PaymentType getPaymentType();
    
    
    /**
     * Method getter untuk mendapatkan status invoice
     *
     * @return isi variable invoiceStatus
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return invoiceStatus;
    }
    
    /**
     * Method setter untuk mengatur id invoice
     * @param id
     *
     */
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }
    
    /**
     * Method setter untuk mengatur makanan pada invoice
     * @param foods
     *
     */
    public void setFoods(ArrayList<Food> foods)
    {
        this.foods = foods;
    }

    /**
     * Method setter untuk mengatur tanggal invoice dengan tipe data calendar
     * @param date
     *
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }

    /**
     * Method setter untuk mengatur tanggal invoice dengan tipe data gregorian calendar
     * @param year
     * @param month
     * @param dayOfMonth
     *
     */
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar (year, month-1, dayOfMonth);
    }
    
    /**
     * Method abstract untuk mengatur harga total
     *
     */
    public abstract void setTotalPrice();

    /**
     * Method setter untuk mengatur data pelanggan pada invoice
     * @param customer
     *
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    /**
     * Method untuk mengatur status invoice menjadi ongoing
     * @param status
     *
     */
    public void status(InvoiceStatus status)
    {
        this.invoiceStatus = InvoiceStatus.Ongoing;

    }

    /**
     * Method setter untuk mengatur status invoice
     * @param invoiceStatus
     *
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus = invoiceStatus;
    }

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

    /**
     * Method abstract untuk print data invoice
     *
     */
    public abstract String toString();
    {
    }
}
