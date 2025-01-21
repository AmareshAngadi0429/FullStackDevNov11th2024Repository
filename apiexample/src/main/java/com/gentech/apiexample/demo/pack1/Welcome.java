package com.gentech.apiexample.demo.pack1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/www")
    public String wel()
    {
        return "welcome to banglore";
    }
}
