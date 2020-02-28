
/**
 * Menyimpan data makanan beserta kategori, harga, dan penjualnya.
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int price;
    private String category;
    private Seller seller;
    /**
     * Constructor for objects of class Food
     *@param id
     *@param name
     *@param seller
     *@param price
     *@param category
     */
    public Food(int id, String name, Seller seller, int price, String category)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;
    }

    /**
     * Digunakan untuk mendapatkan id makanan
     *
     * @return Isi variable id
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    /**
     * Digunakan untuk mendapatkan nama makanan
     *
     * @return Isi variable name
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * Digunakan untuk mendapatkan nama penjual
     *
     * @return Isi variable seller
     */
    public Seller getSeller()
    {
        // put your code here
        return seller;
    }
    
    /**
     * Digunakan untuk mendapatkan harga makanan
     *
     * @return Isi variable price
     */
    public int getPrice()
    {
        // put your code here
        return price;
    }
    
    /**
     * Digunakan untuk mendapatkan kategori makanan
     *
     * @return Isi variable category
     */
    public String getCategory()
    {
        // put your code here
        return category;
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
     * Mengatur value dari variable name
     *
     * @param  name dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable name
     */
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }
    
    /**
     * Mengatur value dari variable seller
     *
     * @param  seller dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public void setSeller(Seller seller)
    {
        // put your code here
        this.seller = seller;
    }
    
    /**
     * Mengatur value dari variable price
     *
     * @param  price dengan tipe data integer
     * @return Value pada parameter dimasukkan ke variable price
     */
    public void setPrice(int price)
    {
        // put your code here
        this.price = price;
    }
    
    /**
     * Mengatur value dari variable string
     *
     * @param  category dengan tipe data string
     * @return Value pada parameter dimasukkan ke variable string
     */
    public void setCategory(String category)
    {
        // put your code here
        this.category = category;
    }
    
    /**
     * Untuk print data variable pada class ini
     *
     * @param  Variable dengan input dari salah satu method setter di atas
     * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
     */
    public void printData()
    {
        return;   
    }
}
