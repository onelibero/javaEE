package cdu.gu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyTestController {
    @GetMapping("/hello")
    public String hello(){
        return "helloView";
    }
}
