package galih.jfood;

/**
 * Class exception untuk error handling ketika makanan tidak ditemukan
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */
public class FoodNotFoundException extends Exception
{
    private int food_error;

    /**
     * Method untuk mendapatkan input yang dibutuhkan untuk parameter error handling
     * @param food_input
     *
     */
    public FoodNotFoundException (int food_input)
    {
        super("Food ID: ");
        this.food_error = food_input;
    }

    /**
     * Method untuk mendapatkan error message
     *
     * @return error message
     */
    public String getMessage()
    {
        return super.getMessage() + food_error + " not found";
    }
}


