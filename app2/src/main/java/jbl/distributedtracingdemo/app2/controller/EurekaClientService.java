package jbl.distributedtracingdemo.app2.controller;

import com.netflix.discovery.EurekaClient;
import jbl.distributedtracingdemo.common.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientService implements GreetingService {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;
    
    @Override
    public String greeting() {
        return String.format("Hello from %s !", eurekaClient.getApplication(appName).getName());
    }

}
