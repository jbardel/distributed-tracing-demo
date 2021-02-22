package jbl.distributedtracingdemo.app2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App2Application {

    public static final Logger LOGGER = LoggerFactory.getLogger(App2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(App2Application.class, args);
    }


}
