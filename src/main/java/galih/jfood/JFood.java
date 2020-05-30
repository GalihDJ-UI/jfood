package galih.jfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JFood
{
   public static void main(String[] args)
   {
       DatabaseConnection.connection();
       
       //Customer
       try
       {
           DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Galih", "galih@gmail.com", "Password123", 2020, 4, 2));
       }
       catch (EmailAlreadyExistException e)
       {
           System.out.println(e.getMessage());
       }

   //    try
   //    {
   //        DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId() + 1, "Siraj", "siraj@gmail.com", "Password1", 2020, 4, 9));
    //   }
   //    catch (EmailAlreadyExistException e)
    //   {
    //       System.out.println(e.getMessage());
   //    }

       //Location
       Location location1 = new Location("Tanjung Priok", "Jakarta Utara", "Asik");

       //Seller
       DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Budi", "budi@gmail.com", "081234323", location1));

       //Food
       try
       {
           DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Espresso", DatabaseSeller.getSellerById(1), 20000, FoodCategory.Coffee));
       }
       catch (SellerNotFoundException e)
       {
           System.out.println(e.getMessage());
       }

       try
       {
           DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sushi", DatabaseSeller.getSellerById(1), 20000, FoodCategory.Japanese));
       }
       catch (SellerNotFoundException e)
       {
           System.out.println(e.getMessage());
       }


       //Promo
       try
       {
           DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "22W51", 10000, 20000, true));
       }
       catch (PromoCodeAlreadyExistException e)
       {
           System.out.println(e.getMessage());
       }

   //    try
   //    {
    //       DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "22W51", 10000, 20000, true));
    //   }
    //   catch (PromoCodeAlreadyExistException e)
    //   {
    //       System.out.println(e.getMessage());
    //   }

       SpringApplication.run(JFood.class, args);
   }
}