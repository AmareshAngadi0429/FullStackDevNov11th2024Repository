package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksWiseGradeController {
    @GetMapping("/Grade")
    public String grade(@RequestParam int marks)
    {
        if (marks>=70 && marks<=100)
        {
            return "A Grade";
        }
        if(marks>=60 && marks<70)
        {
            return "B Grade";
        }
        if(marks>=35 && marks<60)
        {
            return "C Grade";
        }
        if( marks<35)
        {
            return "Fail";
        }

        return "Invalid Marks";
    }
}
