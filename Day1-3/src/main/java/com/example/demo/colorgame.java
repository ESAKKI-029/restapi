package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorgame {

    private String yourFavColor = "Green"; 
    @GetMapping("get")
    public String getMyFav() {
        return "My favorite color is " + yourFavColor;
    }
}
