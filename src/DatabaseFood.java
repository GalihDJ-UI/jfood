import java.util.ArrayList;

/**
 * Menyimpan database makanan.
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public class DatabaseFood
{
    // instance variables - replace the example below with your own
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<Food>();
    private static int lastId = 0;
    /**
     * Mengambil input boolean untuk menambahkan food
     *
     * @return false
     */

    public static ArrayList<Food> getSellerDatabase()
    {
        // put your code here
        return FOOD_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    public static Food getFoodById(int id)
    {
        Food dummyFood = null;
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getId() == id)
            {
                dummyFood = foods;
            }

            else
            {
                dummyFood = foods;
            }
        }

        return dummyFood;
    }

    public static ArrayList<Food> getFoodBySeller(int sellerId)
    {
        ArrayList<Food> dummyFoodList = new ArrayList<>();
        for (Food foods : FOOD_DATABASE)
        {

            if (foods.getId() == sellerId)
            {
                dummyFoodList.add(foods);
            }

            else
            {
                dummyFoodList = null;
            }
        }

        return dummyFoodList;
    }


    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> dummyFoodList = new ArrayList<>();
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getCategory().equals(category))
            {
                dummyFoodList.add(foods);
            }
        }

        return dummyFoodList;
    }

    public static boolean addFood(Food foods)
    {
      // put your code here
        FOOD_DATABASE.add(foods);
        lastId = foods.getId()+1;
        return true;
    }


    public static boolean removeFood(int id)
    {
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getId() == id)
            {
                FOOD_DATABASE.remove (foods);
                return true;
            }
        }
        return false;
    }

}
