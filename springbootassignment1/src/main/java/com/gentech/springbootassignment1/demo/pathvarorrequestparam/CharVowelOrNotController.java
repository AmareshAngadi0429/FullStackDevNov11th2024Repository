package com.gentech.springbootassignment1.demo.pathvarorrequestparam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharVowelOrNotController {
    @GetMapping("/isVowelOrNot")
    public boolean isVowel(@RequestParam char ch)
    {
        if (ch =='A'||ch=='E'||ch=='I'||ch=='O'|ch=='a'|ch=='U'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
}
