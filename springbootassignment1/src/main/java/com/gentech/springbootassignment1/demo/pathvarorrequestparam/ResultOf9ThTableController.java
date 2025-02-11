package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResultOf9ThTableController {
    @GetMapping("/table")
    public List<Integer> table(@RequestParam int num)
    {
        List<Integer> obj= new ArrayList<Integer>();
        for (int i=1;i<=10;i++)
        {
            obj.add(i*num);
        }
        return obj;
    }
}
