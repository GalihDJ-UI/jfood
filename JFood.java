
/**
 * Write a description of class JFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFood
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
      Location location1 = new Location("Depok", "Jawa Barat", "Asik");
      Seller seller1 = new Seller(21, "Budi", "budi@mail", "021", 
      location1);
      Food foods = new Food(22, "Tempe", seller1, 2000, "Gorengan");
      Customer customers = new Customer(23, "Bambang", "bambang@mail", "admin", 
      "29 Feb 2020");
      Invoice invoice = new Invoice(24, 25, "1 Maret 2020", customers, 
      2000);  
    }
}
