package galih.jfood;
/**
 * Class yang menyimpan dan mengatur data makanan
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public class Food
{
    private int id;
    private String name;
    private int price;
    private FoodCategory category;
    private Seller seller;

    /**
     * Constructor untuk object pada class food
     * @param id
     * @param name
     * @param seller
     * @param price
     * @param category
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category)
    {
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;
    }

    /**
     * Method getter untuk mendapatkan id makanan
     *
     * @return Isi variable id
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method getter untuk mendapatkan nama makanan
     *
     * @return Isi variable name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method getter untuk mendapatkan nama penjual
     *
     * @return Isi variable seller
     */
    public Seller getSeller()
    {
        return seller;
    }
    
    /**
     * Method getter untuk mendapatkan harga makanan
     *
     * @return Isi variable price
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Method getter untuk mendapatkan kategori makanan
     *
     * @return Isi variable category
     */
    public FoodCategory getCategory()
    {
        return category;
    }
    
    /**
     * Method setter untuk mengatur id makanan
     * @param id
     *
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method setter untuk mengatur nama makanan
     * @param name
     *
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Method setter untuk mengatur penjual
     * @param seller
     *
     */
    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }
    
    /**
     * Method setter untuk mengatur harga makanan
     * @param price
     *
     */
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    /**
     * Method setter untuk mengatur kategori makanan
     * @param category
     *
     */
    public void setCategory(FoodCategory category)
    {
        this.category = category;
    }

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

    /**
     * Method untuk print data makanan
     * @return data pelanggan berisi id, nama makanan, nama penjual, kota penjual, harga makanan, kategori makanan
     *
     */
    public String toString()
    {
     return "Id = "+getId()+"\nNama = "+getName()+"\nSeller = "+getSeller().getName()+"\nCity = "+getSeller().getLocation().getCity()+"\nPrice = "+getPrice()+"\nCategory = "+getCategory();
    }
}
