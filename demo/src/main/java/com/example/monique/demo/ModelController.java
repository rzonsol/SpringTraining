package com.example.monique.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/model")
public class ModelController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method= RequestMethod.GET)
    public String getAllShopping(@RequestParam(value = "gender", required = false, defaultValue = "") String gender,
                                 @RequestParam(value = "age") int age,
                                 Model model)
    {
        model.addAttribute("friends", userRepository.findByAge(age));
        model.addAttribute("gender", gender);

        return "start";
    }
}
