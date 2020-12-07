package com.mrqi.controller.superAdmin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class testController {


    @GetMapping("/superadmin/test")
    public String test(){
        Arrays.asList(1,2,3);
        return "is test springboot ";
    }
}
