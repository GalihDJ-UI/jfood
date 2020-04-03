import java.util.ArrayList;

/**
 * Write a description of class DatabasePromo here.
 *
 * @author Galih Damar Jati
 * @version 12-03-2020
 */
public class DatabasePromo {
    // instance variables - replace the example below with your own
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<Promo>();
    private static int lastId = 0;

    /**
     * Constructor for objects of class DatabasePromo
     */

    public static ArrayList<Promo> getPromoDatabase() {
        // put your code here
        return PROMO_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Promo getPromoById(int id) {
        Promo dummyPromo = null;
        for (Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id)
            {
                dummyPromo = promo;
            }
            else
            {
                dummyPromo = promo;
            }
        }
        return dummyPromo;
    }

    public static Promo getPromoByCode(String code) {
        Promo dummyPromo = null;
        for (Promo promo : PROMO_DATABASE)
        {
            if (promo.getCode() == code)
            {
                dummyPromo = promo;
            }

            else
            {
                dummyPromo = promo;
            }
        }
        return dummyPromo;
    }

    public static boolean addPromo(Promo promo)
    {

        for (Promo promo1 : PROMO_DATABASE)
        {
            if (promo1.getCode().equals(promo.getCode()))
            {
                return false;
            }

        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;

    }

    public static boolean activatePromo(int id) {
        for (Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id) {
                promo.setActive(true);
                return true;
            }

        }
        return false;
    }

        public static boolean deactivatePromo(int id) {
            for (Promo promo : PROMO_DATABASE)
            {
                if (promo.getId() == id)
                {
                    promo.setActive(false);
                    return true;
                }

            }
            return false;
        }

        public static boolean removePromo(int id)
        {
            boolean promoStatus = false;
            for (Promo promo : PROMO_DATABASE)
            {
                if (promo.getId() == id)
                {
                    PROMO_DATABASE.remove(promo);
                    promoStatus = true;
                }
                else
                {
                    promoStatus = false;
                }
            }

            return promoStatus;
        }
    }
