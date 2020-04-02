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
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
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
        for (int i = 0; i < FOOD_DATABASE.size(); i++)
        {
            Food foods = FOOD_DATABASE.get(i);
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
        for (int i = 0; i < FOOD_DATABASE.size(); i++)
        {
            Food foods = FOOD_DATABASE.get(i);
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
        for (int i = 0; i < FOOD_DATABASE.size(); i++)
        {
            Food foods = FOOD_DATABASE.get(i);
            if (foods.getCategory() == category)
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

    public static boolean addFood(Food foods)
    {
      // put your code here
        FOOD_DATABASE.add(foods);
        lastId = foods.getId();
        return true;
    }


    public static boolean removeFood(int id)
    {
        boolean foodStatus = false;
        for (int i = 0; i < FOOD_DATABASE.size(); i++)
        {
            Food foods = FOOD_DATABASE.get(i);
            if (foods.getId() == id)
            {
                FOOD_DATABASE.remove (foods);
                foodStatus = true;
            }

            else
            {
                foodStatus = false;
            }
        }

        return foodStatus;
    }

}
