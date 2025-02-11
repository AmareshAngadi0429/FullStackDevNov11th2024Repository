package com.gentech.beanandjsondemo.demopackage.arrayofobject;

import com.gentech.beanandjsondemo.demopackage.singlejsonobject.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ObjectArray {
    @GetMapping("/customers")
    public List<Customer> customers() {
        List<Customer> obj = new ArrayList<Customer>();
        obj.add(new Customer(11,"amar","italy"));
        obj.add(new Customer(12,"jacob","german"));
        obj.add(new Customer(13,"prajju","mysore"));
        obj.add(new Customer(14,"sara","german"));
        return obj;

    }
}
