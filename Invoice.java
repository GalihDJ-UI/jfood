
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
    private Food food;
    private String date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    
    /**
     * Constructor for objects of class Invoice
     *@param id
     *@param food
     *@param date
     *@param customer
     *@param invoiceStatus
     */
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        // initialise instance variables
        this.id = id;
        this.food = food;
        this.date = date;
        this.customer = customer;
        this.invoiceStatus = invoiceStatus;
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
    public Food getFood()
    {
        // put your code here
        return food;
    }
    
    /**
     * Digunakan untuk mendapatkan tanggal
     *
     * @return Isi variable date
     */
    public String getDate()
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
     * @param  idFood dengan tipe data integer
     * @return Value pada parameter dimasukkan ke variable idFood
     */
    public void setFood(Food food)
    {
        // put your code here
        this.food = food;
    }
    
    /**
     * Mengatur value dari variable date
     *
     * @param  date dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable date
     */
    public void setDate(String date)
    {
        // put your code here
        this.date = date;
    }
    
    /**
     * Mengatur value dari variable totalPrice
     *
     * @param  totalPrice dengan tipe data integer
     * @return Value pada parameter dimasukkan ke variable totalPrice
     */
    public abstract void setTotalPrice();
    //{
        // put your code here
    //}
    
    /**
     * Mengatur value dari variable customer
     *
     * @param  customer dengan tipe data Customer
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
    public void setInvoiceStatus(InvoiceStatus invoiceStatus)
    {
        // put your code here
        this.invoiceStatus = invoiceStatus;
    }
    
    /**
     * Untuk print data variable pada class ini
     *
     * @param  Variable dengan input dari salah satu method setter di atas
     * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
     */
    public abstract void printData();
    {
      //System.out.println("=====INVOICE=====");  
      //System.out.println("ID: "+id);
      //System.out.println("Food ID: "+idFood);
      //System.out.println("Date: "+date);
      //System.out.println("Customer: "+customer.getName()); 
      //System.out.println("Total Price: "+totalPrice);
      //System.out.println("Status: "+status); 
    }
}
