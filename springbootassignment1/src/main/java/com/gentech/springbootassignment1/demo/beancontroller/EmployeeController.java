package com.gentech.springbootassignment1.demo.beancontroller;

import com.gentech.springbootassignment1.demo.bean.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/Employee")
    public Employee getEmployee(@RequestParam int eid,
                                @RequestParam String eName,
                                @RequestParam int age,
                                @RequestParam String address)
    {
        return new Employee(eid,eName,age,address);
    }
}
