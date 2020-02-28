
/**
 * Menyimpan bukti transaksi
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idFood;
    private String date;
    private int totalPrice;
    private Customer customer;
    /**
     * Constructor for objects of class Invoice
     *@param id
     *@param idFood
     *@param date
     *@param customer
     *@param totalPrice
     */
    public Invoice(int id, int idFood, String date, Customer customer, 
    int totalPrice)
    {
        // initialise instance variables
        this.id = id;
        this.idFood = idFood;
        this.date = date;
        this.customer = customer;
        this.totalPrice = totalPrice;
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
    public int getIdFood()
    {
        // put your code here
        return idFood;
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
    public void setIdFoods(int idFood)
    {
        // put your code here
        this.idFood = idFood;
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
    public void setTotalPrice(int totalPrice)
    {
        // put your code here
        this.totalPrice = totalPrice;
    }
    
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
     * Untuk print data variable pada class ini
     *
     * @param  Variable dengan input dari salah satu method setter di atas
     * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
     */
    public void printData()
    {
      System.out.println(totalPrice);  
    }
}
