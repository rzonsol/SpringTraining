package com.example.monique.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/getShopping")
    public String getAllShopping()
    {
        return "no shopping since 1 month";
    }

    @RequestMapping("/getChildren")
    public List<User> getChildren()
        {
            return userRepository.findByAgeLessThan(18);
    }
}
