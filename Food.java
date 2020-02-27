
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getId()
    {
        // put your code here
        return id;
    }
    
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public Seller getSeller()
    {
        // put your code here
        return seller;
    }
    
    public int getPrice()
    {
        // put your code here
        return price;
    }
    
    public String getCategory()
    {
        // put your code here
        return category;
    }
    
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }
    
    public void setName(String name)
    {
        // put your code here
        this.name = name;
    }
    
    public void setSeller(Seller seller)
    {
        // put your code here
        this.seller = seller;
    }
    
    public void setPrice(int price)
    {
        // put your code here
        this.price = price;
    }
    
    public void setCategory(String category)
    {
        // put your code here
        this.category = category;
    }
    
    public void printData()
    {
        return;   
    }
}
