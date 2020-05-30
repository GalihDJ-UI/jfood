package galih.jfood;
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
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<Food>(0);
    private static int lastId = 0;
    /**
     * Mengambil input boolean untuk menambahkan food
     *
     * @return false
     */

    public static ArrayList<Food> getFoodDatabase()
    {
        // put your code here
        return FOOD_DATABASE;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public static Food getFoodById(int id) throws FoodNotFoundException
    {
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getId() == id)
            {
                return foods;
            }
        }
        throw new FoodNotFoundException(id);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public static ArrayList<Food> getFoodBySeller(int sellerId)
    {
        ArrayList<Food> dummyFoodList = new ArrayList<>();
        for (Food foods : FOOD_DATABASE)
        {

            if (foods.getSeller().getId() == sellerId)
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


    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
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

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public static boolean addFood(Food foods)
    {
      // put your code here
        FOOD_DATABASE.add(foods);
        lastId = foods.getId();
        return true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return the sum of x and y
     */
    public static boolean removeFood(int id) throws FoodNotFoundException
    {
        for (Food foods : FOOD_DATABASE)
        {
            if (foods.getId() == id)
            {
                FOOD_DATABASE.remove (foods);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }

}
