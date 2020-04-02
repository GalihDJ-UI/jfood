import java.util.*;
import java.util.regex.*; 
import java.text.*;

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
     DatabaseSeller.addSeller (new Seller(DatabaseSeller.getLastId(),"Budi", "budi@gmail.com", "081234323", location1));
     DatabaseCustomer.addCustomer (new Customer(DatabaseCustomer.getLastId(),"Galih", "galih@gmail.com", "Password1", 2020, 4, 2));
     DatabaseCustomer.addCustomer (new Customer(DatabaseCustomer.getLastId(),"Galih", "galih@gmail.com", "Password1", 2020, 4, 2));
     DatabaseCustomer.addCustomer (new Customer(DatabaseCustomer.getLastId(),"Pascal", "pascal@gmail.com", "Password1", 2020, 4, 2));

     System.out.println("\nCustomer\n");
     System.out.println(DatabaseCustomer.getCustomerDatabase()+"\n");
     DatabaseFood.addFood(new Food(DatabaseFood.getLastId(), "Espresso", DatabaseSeller.getSellerById(0), 3000, FoodCategory.Coffee));
     DatabaseFood.addFood(new Food(DatabaseFood.getLastId(), "Mocachino", DatabaseSeller.getSellerById(0), 3000, FoodCategory.Coffee));
     DatabaseFood.addFood(new Food(DatabaseFood.getLastId(), "Sushi", DatabaseSeller.getSellerById(0), 3000, FoodCategory.Japanese));
     System.out.println("\nCoffee\n");
     System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.Coffee)+"\n");
     System.out.println("\nJapanese\n");
     System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.Japanese)+"\n");
     //Seller seller1 = new Seller(21, "Galih", "galih@gmail.com", "02179187676", location1);
     
     //Customer customer1 = new Customer(1, "Bagus", "..bagus@mail.com", "123456", new GregorianCalendar(2020,3,23));
     //Customer customer2 = new Customer(2, "Bagas", "bagas@mail.com", "Password1", 2020,3,23);
     //Customer customer3 = new Customer(3, "Bagis", "bagis@mail.com", "Password2");
     //Promo promo1 = new Promo (15, "22W51", 10000, 20000, true);
     //Food food1 = new Food(22, "Espresso", seller1, 2000, FoodCategory.Coffee);
     //Food food2 = new Food(23, "Arabica", seller1, 20000, FoodCategory.Coffee);
     
     //customer1.setEmail("bagus@mail.com");
     //customer1.setPassword("Password1");
     //System.out.println(customer1.toString());
     //System.out.println(customer2.toString());
     //System.out.println(customer3.toString());
     
     //CashlessInvoice cashless1 = new CashlessInvoice(1, food1, customer1, InvoiceStatus.Ongoing);
     //CashlessInvoice cashless2 = new CashlessInvoice(2, food1, "12 Maret 2020", customer1, InvoiceStatus.Ongoing, promo1);
     //CashlessInvoice cashless3 = new CashlessInvoice(3, food2, "12 Maret 2020", customer1, InvoiceStatus.Ongoing, promo1);
     //Invoice invoice = new Invoice(24, 25, "1 Maret 2020", customer1, 2000, InvoiceStatus.Finished);  

     //CashInvoice cash1 = new CashInvoice (1, food1, customer1, InvoiceStatus.Finished);
     //CashInvoice cash2 = new CashInvoice (2, food2, "13 Maret 2020", customer1, InvoiceStatus.Finished, 5000);
     
      //System.out.println(food1.getCategory());
      //System.out.println(payment.toString());
      //seller1.printData();
      //seller1.setName("Pascal");
      //seller1.printData();
      
      
     //cash1.setTotalPrice();
     //cash2.setTotalPrice();
      
     //cash1.printData();
     //cash2.printData();
     
     //cashless1.setTotalPrice();
     //cashless2.setTotalPrice();
     //cashless3.setTotalPrice();
     //System.out.println(cash1.toString());
     //System.out.println(cashless1.toString());
      
     //cashless1.printData();
     //cashless2.printData();
     //cashless3.printData();
      
    }
}
