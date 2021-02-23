package jbl.distributedtracingdemo.app1.client;

import jbl.distributedtracingdemo.common.GreetingService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("eureka-app2")
public interface GreetingClient extends GreetingService {
}
