package com.gentech.beanandjsondemo.demopackage.singlejsonobject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/customer")
    public Customer getCustomer()
    {
        return new Customer(10,"Amaresh","Sindhanur");
    }
}
