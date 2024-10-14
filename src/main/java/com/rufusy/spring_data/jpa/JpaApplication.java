package com.rufusy.spring_data.jpa;

import com.rufusy.spring_data.jpa.persistence.Author;
import com.rufusy.spring_data.jpa.persistence.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthorRepository repository) {
        return args -> {
            Author author = Author.builder()
                    .firstName("Damian")
                    .lastName("Scott")
                    .email("contact@app.com")
                    .age(50)
                    .build();
            repository.save(author);
        };
    }
}
