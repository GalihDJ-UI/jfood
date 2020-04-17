package galih.jfood.controller;

import galih.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController

public class InvoiceController
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice()
    {
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping("/{id}")
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
    public Invoice changeInvoiceStatus(@PathVariable int id, @PathVariable InvoiceStatus status) throws InvoiceNotFoundException
    {

        Invoice invoice = DatabaseInvoice.getInvoiceById(id);
        try
        {
            DatabaseInvoice.changeInvoiceStatus(id, status);
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
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
    public Invoice addCashInvoice(@RequestParam(value = "foods") ArrayList<Food> foods,
                                  @RequestParam(value = "customer") int customerId,
                                  @RequestParam(value = "deliveryFee") int deliveryFee) throws CustomerNotFoundException
    {
        Invoice invoice = new CashInvoice(DatabaseInvoice.getLastId() + 1, foods, DatabaseCustomer.getCustomerById(customerId), deliveryFee);
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
    public Invoice addCashlessInvoice(@RequestParam(value = "foods") ArrayList<Food> foods,
                                      @RequestParam(value = "customer") int customerId,
                                      @RequestParam(value = "promoCode") String promoCode) throws CustomerNotFoundException
    {
        Invoice invoice = new CashlessInvoice(DatabaseInvoice.getLastId() + 1, foods, DatabaseCustomer.getCustomerById(customerId), DatabasePromo.getPromoByCode(promoCode));
        try
        {
            DatabaseInvoice.addInvoice(invoice);
        }
        catch (OngoingInvoiceAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }



}
