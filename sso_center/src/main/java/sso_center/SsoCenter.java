package sso_center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("sso_center/dao/")
@EnableTransactionManagement
public class SsoCenter {

    public static void main(String[] args) {
        SpringApplication.run(SsoCenter.class, args);
    }
}
