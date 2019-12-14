package ie.eshop.api.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(
        exclude = SecurityAutoConfiguration.class,
        scanBasePackages = "ie.eshop.api"
)
@EnableMongoRepositories(basePackages = "ie.eshop.api.business.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
