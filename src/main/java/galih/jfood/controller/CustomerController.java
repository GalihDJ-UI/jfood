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
            customer = DatabaseCustomer.getCustomerById(id);
        }
        catch (CustomerNotFoundException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return customer;
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                     @RequestParam(value="email") String email,
                                     @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(DatabaseCustomer.getLastId()+1, name, email, password);
        try
        {
            DatabaseCustomer.addCustomer(customer);
        }
        catch (EmailAlreadyExistException e)
        {
            System.out.println(e.getMessage());
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
            customer = DatabaseCustomer.getCustomerLogin(email, password);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        return customer;
    }
}