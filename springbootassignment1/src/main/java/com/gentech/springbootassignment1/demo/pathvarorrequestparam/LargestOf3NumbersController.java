package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LargestOf3NumbersController {
    @GetMapping("/largest")
    public int largest(@RequestParam int num1,
                       @RequestParam int num2,
                       @RequestParam int num3)

    {
        if (num1>num2&& num1>num3)
        {
            return num1;
        }
        if (num2>num1&&num2>num3)
        {
            return num2;
        }
        return num3;
    }
}
