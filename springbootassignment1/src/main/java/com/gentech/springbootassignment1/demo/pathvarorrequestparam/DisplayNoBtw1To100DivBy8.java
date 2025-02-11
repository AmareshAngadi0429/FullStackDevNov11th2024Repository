package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DisplayNoBtw1To100DivBy8 {
    @GetMapping("/divBy8")
    public List<Integer> div(@RequestParam int start,
                             @RequestParam int end)
    {
        List<Integer> obj = new ArrayList<Integer>();
        for (int i = start ;i<=end;i++)
        {
            if (i%8 == 0)
            {
                obj.add(i);
            }
        }
        return obj;
    }
}
