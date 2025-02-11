package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PrimeNoBtw50To100Controller {

    @GetMapping("/primeNumbers")
    public List<Integer> prime(@RequestParam Integer start,
                               @RequestParam Integer end)
    {
        List<Integer> obj = new ArrayList<Integer>();
        if (start>end)
        {
            return obj;
        }
        for (int i =start;i<=end;i++)
        {
            if (isPrime(i))
            {
                obj.add(i);
            }
        }
        return obj;

    }
    public boolean isPrime(int n)
    {
        if (n<2)
        {
            return true;
        }
        for (int i=n-1;i>1;i--)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
