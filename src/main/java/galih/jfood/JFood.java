package galih.jfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JFood
{
   public static void main(String[] args)
   {

       //Location
       Location location1 = new Location("Tanjung Priok", "Jakarta Utara", "Asik");
       Location location2 = new Location("Depok", "Jawa Barat", "Panas");
       Location location3 = new Location("Bekasi", "Jawa Barat", "Jauh");

       //Seller
       DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Budi", "budi@gmail.com", "081234323", location1));
       DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Bono", "bono@gmail.com", "081234678", location2));
       DatabaseSeller.addSeller(new Seller(DatabaseSeller.getLastId() + 1, "Banu", "banu@gmail.com", "081234912", location3));

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
           DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Moccachino", DatabaseSeller.getSellerById(1), 20000, FoodCategory.Coffee));
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

       try
       {
           DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Sashimi", DatabaseSeller.getSellerById(1), 20000, FoodCategory.Japanese));
       }
       catch (SellerNotFoundException e)
       {
           System.out.println(e.getMessage());
       }



       SpringApplication.run(JFood.class, args);
   }
}