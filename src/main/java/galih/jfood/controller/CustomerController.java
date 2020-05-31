package galih.jfood.controller;

import galih.jfood.*;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/customer")
@RestController

public class CustomerController
{

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name)
    {
        return "Hello " + name;
    }

    @RequestMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id)
    {
        Customer customer = null;
        try
        {
            customer = DatabaseCustomerPostgre.getCustomerById(id);
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            return null;
        }
        return customer;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                     @RequestParam(value="email") String email,
                                     @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(DatabaseCustomerPostgre.getLastCustomerId()+1, name, email, password);
        try
        {
            DatabaseCustomerPostgre.insertCustomer(customer);
        }
        catch (Exception e)
        {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            return null;
        }
        return customer;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Customer loginCustomer(@RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        Customer customer;
        try
        {
            customer = DatabaseCustomerPostgre.getCustomerLogin(email, password);
        }

        catch (Exception e)
        {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            return null;
        }
        return customer;
    }
}