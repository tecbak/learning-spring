package ua.rud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.rud.config.JpaConfig;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(new Class<?>[]{JpaConfig.class, Application.class}, args);
        SpringApplication.run(Application.class, args);
    }
}
