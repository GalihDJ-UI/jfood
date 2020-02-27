
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    
    public int getIdFood()
    {
        // put your code here
        return idFood;
    }
    
    public String getDate()
    {
        // put your code here
        return date;
    }
    
    public int getTtotalPrice()
    {
        // put your code here
        return totalPrice;
    }
    
    public void setId(int id)
    {
        // put your code here
        this.id = id;
    }
    
    public void setIdFoods(int idFood)
    {
        // put your code here
        this.idFood = idFood;
    }
    
    public void setDate(String date)
    {
        // put your code here
        this.date = date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        // put your code here
        this.totalPrice = totalPrice;
    }
    
    public void printData()
    {
        return;   
    }
}
