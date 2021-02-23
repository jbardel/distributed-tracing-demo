package jbl.distributedtracingdemo.common;

import org.springframework.web.bind.annotation.GetMapping;

public interface GreetingService {

    @GetMapping("/greeting")
    String greeting();

}
