package galih.jfood;
import java.util.ArrayList;

/**
 * Class database yang menyimpan dan mengatur data makanan-makanan yang ada
 *
 * @author Galih Damar Jati
 * @version (27 Feb 2020)
 */
public class DatabaseFood
{
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<Food>(0);
    private static int lastId = 0;

    /**
     * Method untuk mendapatkan daftar food
     *
     * @return isi variable FOOD_DATABASE
     */
    public static ArrayList<Food> getFoodDatabase()
    {
        // put your code here
        return FOOD_DATABASE;
    }

    /**
     * Method getter untuk mendapatkan id terakhir
     *
     * @return isi variabel lastId
     */
    public static int getLastId()
    {
        return lastId;
    }

    /**
     * Method getter untuk mendapatkan nama makanan berdasarkan id makanan
     *
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
     * Method getter untuk mendapatkan nama makanan berdasarkan id penjual
     *
     * @return variable dummyFoodList berisi daftar makanan
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
     * Method getter untuk mendapatkan nama makanan berdasarkan kategori
     *
     * @return variable dummyFoodList berisi daftar makanan
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
     * Method untuk menambahkan makanan pada database
     *
     */
    public static boolean addFood(Food foods)
    {
        FOOD_DATABASE.add(foods);
        lastId = foods.getId();
        return true;
    }

    /**
     * Method untuk menghapus makanan berdasarkan idnya
     *
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
