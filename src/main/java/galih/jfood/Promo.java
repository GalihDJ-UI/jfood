package galih.jfood;
/**
 * Class yang menyimpan dan mengatur data promo
 *
 * @author Galih Damar Jati
 * @version 12-03-2020
 */
public class Promo
{
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;

    /**
     * Constructor untuk object class promo
     *@param id
     *@param code
     *@param discount
     *@param minPrice
     *@param active
     */
    public Promo(int id, String code, int discount, int minPrice, boolean active)
    {
       this.id = id;
       this.code = code;
       this.discount = discount;
       this.minPrice = minPrice;
       this.active = active;
    }

    /**
     * Method getter untuk mendapatkan id pelanggan
     *
     * @return Isi variable id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Method getter untuk mendapatkan kode promo
     *
     * @return Isi variable code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Method getter untuk mendapatkan besar potongan harga promo
     *
     * @return isi variable discount
     */
    public int getDiscount()
    {
        return discount;
    }

    /**
     * Method getter untuk mendapatkan harga minimum promo
     *
     * @return isi variable minPrice
     */
    public int getMinPrice()
    {
        return minPrice;
    }

    /**
     * Method getter untuk mendapatkan status promo
     *
     * @return isi variable active
     */
    public boolean getActive()
    {
        return active;
    }

    /**
     * Method setter untuk mengatur id promo
     * @param id
     *
     */
    public void setId(int id)
    {
      this.id = id;  
    }

    /**
     * Method setter untuk mengatur kode promo
     * @param code
     *
     */
    public void setCode(String code)
    {
      this.code = code;  
    }

    /**
     * Method setter untuk mengatur besar potongan harga promo
     * @param discount
     *
     */
    public void setDiscount(int discount)
    {
      this.discount = discount;  
    }

    /**
     * Method setter untuk mengatur harga minimum promo
     * @param minPrice
     *
     */
    public void setMinPrice(int minPrice)
    {
      this.minPrice = minPrice;  
    }

    /**
     * Method setter untuk mengatur status promo
     * @param active
     *
     */
    public void setActive(boolean active)
    {
      this.active = active;  
    }


    /**
     * Method untuk print data promo
     *
     * @return data promo berisi id, kode, potongan harga, harga minimum, dan status promo
     */
    public String toString()
    {
     return "Id = "+getId()+"\nCode = "+getCode()+"\nDiscount = "+getDiscount()+"\nMin Price = "+getMinPrice()+"\nActive Status= "+getActive();
    }
}
