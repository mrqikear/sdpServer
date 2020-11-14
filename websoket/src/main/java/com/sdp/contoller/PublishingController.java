package com.sdp.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishingController {

    @GetMapping("/hello")
    public String test() {
        return "hello springboot";
    }
}
