package galih.jfood;
import java.util.ArrayList;

/**
 * Class database yang menyimpan dan mengatur data promo-promo yang ada
 *
 * @author Galih Damar Jati
 * @version 12-03-2020
 */
public class DatabasePromo {

    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<Promo>(0);
    private static int lastId = 0;

    /**
     * Method untuk mendapatkan daftar promo
     *
     * @return isi variable PROMO_DATABASE
     */

    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
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
     * Method untuk mendapatkan promo berdasarkan id
     *
     */
    public static Promo getPromoById(int id) throws PromoNotFoundException
    {
        for(Promo promo : PROMO_DATABASE)
        {
            if(promo.getId() == id)
            {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }

    /**
     * Method untuk mendapatkan promo berdasarkan kode promo
     *
     */
    public static Promo getPromoByCode(String code)
    {
        for (Promo promo : PROMO_DATABASE)
        {
            if (promo.getCode().equals(code))
            {
                return promo;
            }
        }
        return null;
    }

    /**
     * Method untuk menambahkan promo
     *
     */
    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistException
    {

        for (Promo promo1 : PROMO_DATABASE)
        {
            if (promo1.getCode().equals(promo.getCode()))
            {
                throw new PromoCodeAlreadyExistException(promo);
            }

        }
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;

    }

    /**
     * Method untuk mengubah status promo menjadi aktif
     *
     */
    public static boolean activatePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE)
        {
            if (promo.getId() == id) {
                promo.setActive(true);
                return true;
            }

        }
        return false;
    }

    /**
     * Method untuk mengubah status promo menjadi tidak aktif
     *
     */
    public static boolean deactivatePromo(int id)
    {
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

    /**
     * Method untuk menghapus promo
     *
     */
    public static boolean removePromo(int id) throws PromoNotFoundException
        {

            for (Promo promo : PROMO_DATABASE)
            {
                if (promo.getId() == id)
                {
                    PROMO_DATABASE.remove(promo);
                    return true;
                }

            }
            throw new PromoNotFoundException(id);
        }
    }
