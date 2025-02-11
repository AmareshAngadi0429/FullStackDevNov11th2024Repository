package com.gentech.beanandjsondemo.demopackage.singlejsonobject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @GetMapping("/customer")
    public Customer getCustomer()
    {
        return new Customer(10,"Amaresh","Sindhanur");
    }
    @GetMapping("/customers")
    public List<Customer> getCustomers()
    {
        List<Customer> obj = new ArrayList<Customer>();
        obj.add(new Customer(1,"amar","nelore"));
        obj.add(new Customer(2,"amar","nelore"));
        obj.add(new Customer(3,"amar","nelore"));
        obj.add(new Customer(4,"amar","nelore"));
        return obj;
    }

}
