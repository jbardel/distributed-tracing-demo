package jbl.distributedtracingdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {


    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

}
