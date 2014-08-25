package au.edu.qut.smallworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Main application for spring-boot
 * Created by andrew on 25/06/2014.
 */

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages= {"au.edu.qut.smallworld"})
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }

}
