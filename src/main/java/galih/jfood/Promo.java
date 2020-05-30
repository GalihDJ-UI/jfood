package galih.jfood;
/**
 * Write a description of class Promo here.
 *
 * @author Galih Damar Jati
 * @version 12-03-2020
 */
public class Promo
{
    // instance variables - replace the example below with your own
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;
    
    /**
     * Constructor for objects of class Promo
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
        // initialise instance variables
       this.id = id;
       this.code = code;
       this.discount = discount;
       this.minPrice = minPrice;
       this.active = active;
    }

    /**
     * Method getter untuk mengambil nilai variable id
     *
     * @return isi variable id
     */
    public int getId()
    {
        // put your code here
        return id;
    }

    /**
     * Method getter untuk mengambil nilai variable code
     *
     * @return isi variable code
     */
    public String getCode()
    {
        // put your code here
        return code;
    }

    /**
     * Method getter untuk mengambil nilai variable discount
     *
     * @return isi variable discount
     */
    public int getDiscount()
    {
        // put your code here
        return discount;
    }

    /**
     * Method getter untuk mengambil nilai variable minPrice
     *
     * @return isi variable minPrice
     */
    public int getMinPrice()
    {
        // put your code here
        return minPrice;
    }

    /**
     * Method getter untuk mengambil nilai variable active
     *
     * @return isi variable active
     */
    public boolean getActive()
    {
        // put your code here
        return active;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public void setId(int id)
    {
      this.id = id;  
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public void setCode(String code)
    {
      this.code = code;  
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public void setDiscount(int discount)
    {
      this.discount = discount;  
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public void setMinPrice(int minPrice)
    {
      this.minPrice = minPrice;  
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public void setActive(boolean active)
    {
      this.active = active;  
    }
    
    //public void printData()
    //{
    //}
    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public String toString()
    {
     return "Id = "+getId()+"\nCode = "+getCode()+"\nDiscount = "+getDiscount()+"\nMin Price = "+getMinPrice()+"\nActive Status= "+getActive();
    }
}
