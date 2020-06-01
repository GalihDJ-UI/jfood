package galih.jfood.controller;

import galih.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/invoice")
@RestController

/**
 * Class controller untuk mengatur manipulasi data invoice
 *
 * @author Galih Damar Jati
 * @version 29 Mei 2020
 */

public class InvoiceController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan semua invoice
     *
     */
    public ArrayList<Invoice> getAllInvoice()
    {
        ArrayList<Invoice> invoiceList;
        try
        {
            invoiceList = DatabaseInvoice.getInvoiceDatabase();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return invoiceList;
    }

    @RequestMapping("/{id}")
    /**
     * Method untuk mendapatkan invoice berdasarkan id
     *
     */
    public Invoice getInvoiceById(@PathVariable int id)
    {
        Invoice invoice = null;
        try
        {
            invoice = DatabaseInvoice.getInvoiceById(id);
        }
        catch (InvoiceNotFoundException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/customer/{cusId}", method = RequestMethod.GET)
    /**
     * Method untuk mendapatkan invoice berdasarkan pelanggan
     *
     */
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int cusId)
    {
        ArrayList<Invoice> invoice = null;
        try
        {
            invoice = DatabaseInvoice.getInvoiceByCustomer(cusId);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    /**
     * Method untuk mengganti status invoice
     *
     */
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status")InvoiceStatus status) throws InvoiceNotFoundException
    {
        Invoice invoice = null;
        DatabaseInvoice.changeInvoiceStatus(id, status);
        try
        {
           invoice = DatabaseInvoice.getInvoiceById(id);
        }

        catch (InvoiceNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        return invoice;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    /**
     * Method untuk menghapus invoice
     *
     */
    public Boolean removeInvoice(@RequestParam(value = "id") int id) throws InvoiceNotFoundException
    {
        try
        {
            DatabaseInvoice.removeInvoice(id);
        }
        catch (InvoiceNotFoundException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @RequestMapping(value = "/createCashInvoice", method = RequestMethod.POST)
    /**
     * Method untuk menambah cash invoice
     *
     */
    public Invoice addCashInvoice(@RequestParam(value = "foods") ArrayList<Integer> foods,
                                  @RequestParam(value = "customer") int customerId,
                                  @RequestParam(value = "deliveryFee", defaultValue = "0") int deliveryFee) throws CustomerNotFoundException
    {
        ArrayList<Food> dummyFoods = new ArrayList<>();
        for (int i : foods)
        {
            try
            {
                dummyFoods.add(DatabaseFood.getFoodById(i));
            }
            catch (FoodNotFoundException e)
            {
                System.out.println(e.getMessage());
            }
        }

        Invoice invoice = new CashInvoice(DatabaseInvoice.getLastId() + 1,
                dummyFoods,
                DatabaseCustomerPostgre.getCustomerById(customerId),
                deliveryFee);
        try
        {
            DatabaseInvoice.addInvoice(invoice);
        }
        catch (OngoingInvoiceAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        invoice.setTotalPrice();
        return invoice;
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    /**
     * Method untuk menambah cashless invoice
     *
     */
    public Invoice addCashlessInvoice(@RequestParam(value = "foods") ArrayList<Integer> foods,
                                      @RequestParam(value = "customer") int customerId,
                                      @RequestParam(value = "promoCode", defaultValue = "") String promoCode) throws CustomerNotFoundException
    {
        ArrayList<Food> dummyFoods = new ArrayList<>();
        for (int i : foods)
        {
            try
            {
                dummyFoods.add(DatabaseFood.getFoodById(i));
            }
            catch (FoodNotFoundException e)
            {
                System.out.println(e.getMessage());
            }
        }

        Invoice invoice = new CashlessInvoice(DatabaseInvoice.getLastId() + 1, dummyFoods, DatabaseCustomerPostgre.getCustomerById(customerId), DatabasePromo.getPromoByCode(promoCode));
        try
        {
            DatabaseInvoice.addInvoice(invoice);
        }
        catch (OngoingInvoiceAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }
        invoice.setTotalPrice();
        return invoice;
    }
}
