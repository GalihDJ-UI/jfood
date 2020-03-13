
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
     Seller seller1 = new Seller(21, "Galih", "galih@gmail.com", "02179187676", location1);
     
     Customer customer1 = new Customer(23, "Bambang", "bambang@gmail.com", "admin", "29 Feb 2020");
     Promo promo1 = new Promo (15, "22W51", 10000, 20000, true);
     Food food1 = new Food(22, "Espresso", seller1, 2000, FoodCategory.Coffee);
     Food food2 = new Food(23, "Arabica", seller1, 20000, FoodCategory.Coffee);
     
     CashlessInvoice cashless1 = new CashlessInvoice(1, food1, "12 Maret 2020", customer1, InvoiceStatus.Ongoing);
     CashlessInvoice cashless2 = new CashlessInvoice(2, food1, "12 Maret 2020", customer1, InvoiceStatus.Ongoing, promo1);
     CashlessInvoice cashless3 = new CashlessInvoice(3, food2, "12 Maret 2020", customer1, InvoiceStatus.Ongoing, promo1);
     //Invoice invoice = new Invoice(24, 25, "1 Maret 2020", customer1, 2000, InvoiceStatus.Finished);  
     // PaymentType payment = (PaymentType.Cash);
      
      //System.out.println(food1.getCategory());
      //System.out.println(payment.toString());
      //seller1.printData();
      //seller1.setName("Pascal");
      //seller1.printData();
      
      cashless1.setTotalPrice();
      cashless2.setTotalPrice();
      cashless3.setTotalPrice();
      
      
      cashless1.printData();
      cashless2.printData();
      cashless3.printData();
      
    }
}
