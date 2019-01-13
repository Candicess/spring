package com.example.eurekaprovider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam(defaultValue = "nobody") String name){
        return "hello " + name + "! this is the first eureka provider";
    }
}
