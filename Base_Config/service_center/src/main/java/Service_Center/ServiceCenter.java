package Service_Center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceCenter {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCenter.class,args);
    }
}
