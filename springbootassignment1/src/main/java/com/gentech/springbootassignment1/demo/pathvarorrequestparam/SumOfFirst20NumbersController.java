package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SumOfFirst20NumbersController {
    @GetMapping("/sumOfFirst20Numbers")
    public  int sum(@RequestParam int start,
                    @RequestParam int end)
    {
        if (start == end)
        {
            return end;
        }
        return start + sum(start+1,end);
    }
}
