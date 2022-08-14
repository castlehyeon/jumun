package com.example.servingwebcontent;

import com.example.servingwebcontent.datajpa.Admin;
import com.example.servingwebcontent.datajpa.AdminRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ServingWebContentApplication {
    private static final Logger log = LoggerFactory.getLogger(ServingWebContentApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(AdminRepository repository) {
        return (args) -> {
            // save a few Admins
            repository.save(new Admin("Jack", "Bauer"));
            repository.save(new Admin("Chloe", "O'Brian"));
            repository.save(new Admin("Kim", "Bauer"));
            repository.save(new Admin("David", "Palmer"));
            repository.save(new Admin("Michelle", "Dessler"));

            // fetch all Admins
            log.info("Admins found with findAll():");
            log.info("-------------------------------");
            for (Admin Admin : repository.findAll()) {
                log.info(Admin.toString());
            }
            log.info("");

            // fetch an individual Admin by ID
            Admin Admin = repository.findByStoreNum(1L);
            log.info("Admin found with findById(1L):");
            log.info("--------------------------------");
            log.info(Admin.toString());
            log.info("");

            // fetch Admins by last name
            log.info("Admin found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByOwnerName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Admin bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }
}
