package galih.jfood;
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
    private FoodCategory category;
    private Seller seller;
    /**
     * Constructor for objects of class Food

     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
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
    public FoodCategory getCategory()
    {
        // put your code here
        return category;
    }
    
    /**
     * Mengatur value dari variable id
     *

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

     * @return Value pada parameter dimasukkan ke variable string
     */
    public void setCategory(FoodCategory category)
    {
        // put your code here
        this.category = category;
    }
    
    /**
     * Untuk print data variable pada class ini
     *

    * @return Isi dari variable yang ada. Tergantung pada variable apa yang dipanggil
    */
    //public void printData()
    //{
    //  System.out.println("=====FOOD=====");  
    //  System.out.println("ID: "+id);
     // System.out.println("Name: "+name);
    //  System.out.println("Seller: "+seller.getName()); 
     // System.out.println("City: "+seller.getLocation().getCity());
    //  System.out.println("Price: "+price);
    //  System.out.println("Category: "+category); 
    //}
    
    public String toString()
    {
     return "Id = "+getId()+"\nNama = "+getName()+"\nSeller = "+getSeller().getName()+"\nCity = "+getSeller().getLocation().getCity()+"\nPrice = "+getPrice()+"\nCategory = "+getCategory();
    }
}
