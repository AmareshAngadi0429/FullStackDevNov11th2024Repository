package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CountOfEvenNoBtw20To100Controller {
    @GetMapping("/countofeven")
    public int count(@RequestParam int start,
                     @RequestParam int end)
    {
        if (start == end)
        {
            if( start%2==0)
            {
                return 1;
            }
            return 0;
        }
        if( start % 2==0)
        {
            return 1+count(start+1,end);
        }
        return count(start+1,end);

    }
}
