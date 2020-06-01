package galih.jfood;
import java.util.ArrayList;

/**
 * Class database yang menyimpan dan mengatur data penjual-penjual yang ada
 *
 * @author Galih Damar Jati
 * @version (28 Feb 2020)
 */
public class DatabaseSeller
{
    // instance variables - replace the example below with your own
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<Seller>();
    private static int lastId = 0;

    /**
     * Method untuk mendapatkan daftar penjual
     *
     * @return isi variable SELLER_DATABASE
     */
    public static ArrayList<Seller> getSellerDatabase()
    {
        // put your code here
        return SELLER_DATABASE;
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
     * Method untuk mendapatkan penjual berdasarkan id
     *
     */
    public static Seller getSellerById(int id) throws SellerNotFoundException
    {
        for (Seller seller : SELLER_DATABASE)
        {
            if (seller.getId() == id)
            {
                return seller;
            }
        }

        throw new SellerNotFoundException(id);
    }

    /**
     * Method untuk menambahkan penjual
     *
     */
    public static boolean addSeller(Seller seller)
    {
      // put your code here
        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
      return true;
    }

    /**
     * Method untuk menghapus penjual
     *
     */
    public static boolean removeSeller(int id) throws SellerNotFoundException
    {
      // put your code here
        for (Seller seller : SELLER_DATABASE)
        {
            if (seller.getId() == id)
            {
                SELLER_DATABASE.remove (seller);
                return true;
            }
        }
        throw new SellerNotFoundException(id);
    }
}
