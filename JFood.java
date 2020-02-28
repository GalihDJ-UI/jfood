
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
      Location location1 = new Location("Tanjung Priok", "Jakarta Utara", "Asik");
      Seller seller1 = new Seller(21, "Galih", "galih@gmail.com", "02179187676", 
      location1);
      Food food1 = new Food(22, "Tempe", seller1, 2000, "Gorengan");
      Customer customer1 = new Customer(23, "Bambang", "bambang@gmail.com", "admin", 
      "29 Feb 2020");
      Invoice invoice = new Invoice(24, 25, "1 Maret 2020", customer1, 2000);  
      
      
      seller1.printData();
      seller1.setName("Pascal");
      seller1.printData();
      food1.printData();
    }
}
