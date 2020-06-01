package galih.jfood.controller;

import galih.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/promo")
@RestController


/**
 * Class controller untuk mengatur manipulasi data promo
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class PromoController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan semua promo
     *
     */
    public ArrayList<Promo> getAllPromo()
    {
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan promo berdasarkan kode
     *
     */
    public Promo getPromoByCode(@PathVariable String code)
    {
        Promo promo = null;
        promo = DatabasePromo.getPromoByCode(code);
        return promo;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    /**
     * Method untuk menambahkan promo
     *
     */
    public Promo addPromo(@RequestParam(value="code") String code,
                          @RequestParam(value="discount") int discount,
                          @RequestParam(value="minPrice") int minPrice,
                          @RequestParam(value="active") boolean active)

    {
        Promo promo = new Promo(DatabasePromo.getLastId()+1, code, discount, minPrice, active);
        try
        {
            DatabasePromo.addPromo(promo);
        }

        catch (PromoCodeAlreadyExistException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return promo;
    }
}
