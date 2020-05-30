package galih.jfood;
public class FoodNotFoundException extends Exception
{
    private int food_error;

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public FoodNotFoundException (int food_input)
    {
        super("Food ID: ");
        this.food_error = food_input;
    }

    /**
     * Mengatur value dari variable seller
     *
     * @return Value pada parameter dimasukkan ke variable seller
     */
    public String getMessage()
    {
        return super.getMessage() + food_error + " not found";
    }
}


