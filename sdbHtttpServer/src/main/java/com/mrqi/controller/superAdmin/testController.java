package com.mrqi.controller.superAdmin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {


    @GetMapping("/superadmin/test")
    public String test(){

        return "is test springboot ";
    }
}
