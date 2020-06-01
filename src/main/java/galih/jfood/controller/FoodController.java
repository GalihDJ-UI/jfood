package galih.jfood.controller;

import galih.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/food")
@RestController

/**
 * Class controller untuk mengatur manipulasi data makanan
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class FoodController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan semua data makanan
     *
     */
    public ArrayList<Food> getAllFood()
    {
        return DatabaseFood.getFoodDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan data makanan berdasarkan id
     *
     */
    public Food getFoodById(@PathVariable int id){
        Food food = null;
        try
        {
            food = DatabaseFood.getFoodById(id);
        }
        catch (FoodNotFoundException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return food;
    }

    @RequestMapping(value = "/seller/{sellerId}", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan data makanan berdasarkan penjual
     *
     */
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerId)
    {
        ArrayList<Food> food = null;
        try
        {
            food = DatabaseFood.getFoodBySeller(sellerId);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return food;
    }

    @RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan data makanan berdasarkan kategori
     *
     */
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category)
    {
        ArrayList<Food> food = null;
        try
        {
            food = DatabaseFood.getFoodByCategory(category);
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return food;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    /**
     * Method untuk menambahkan makanan
     *
     */
    public Food addFood(@RequestParam(value="name") String name,
                        @RequestParam(value="price") int price,
                        @RequestParam(value="category") FoodCategory category,
                        @RequestParam(value="sellerId") int sellerId) throws SellerNotFoundException
    {
        Food food = new Food(DatabaseFood.getLastId()+1, name, DatabaseSeller.getSellerById(sellerId), price, category);
        try
        {
            DatabaseFood.addFood(food);
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return food;
    }
}
