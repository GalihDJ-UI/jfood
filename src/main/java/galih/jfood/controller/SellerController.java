package galih.jfood.controller;

import galih.jfood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/seller")
@RestController

/**
 * Class controller untuk mengatur manipulasi data penjual
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class SellerController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan semua data penjual
     *
     */
    public ArrayList<Seller> getAllSeller()
    {
        return DatabaseSeller.getSellerDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan data penjual berdasarkan id
     *
     */
    public Seller getSellerById(@PathVariable int id)
    {
        Seller seller = null;
        try
        {
            seller = DatabaseSeller.getSellerById(id);
        }
        catch (SellerNotFoundException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return seller;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    /**
     * Method untuk menambahkan data penjual
     *
     */
    public Seller addSeller(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="phoneNumber") String phoneNumber,
                            @RequestParam(value="province") String province,
                            @RequestParam(value="description") String description,
                            @RequestParam(value="city") String city)

    {
        Seller seller = new Seller(DatabaseSeller.getLastId()+1, name, email, phoneNumber, new Location(province, description, city));

        try
        {
            DatabaseSeller.addSeller(seller);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return seller;
    }

}
