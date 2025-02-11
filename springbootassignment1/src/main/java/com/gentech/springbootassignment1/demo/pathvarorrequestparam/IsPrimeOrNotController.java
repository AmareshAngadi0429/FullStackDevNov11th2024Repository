package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IsPrimeOrNotController {
    @GetMapping("/isPrime")
    public boolean isPrime(@RequestParam int n)
    {
        for (int i = n-1;i>1;i--)
        {
            if (n % i==0)
            {
                return false;
            }
        }
        return true;
    }

}
