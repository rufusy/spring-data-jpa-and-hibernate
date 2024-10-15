package com.rufusy.spring_data.jpa;

import com.rufusy.spring_data.jpa.persistence.Author;
import com.rufusy.spring_data.jpa.persistence.AuthorRepository;
import com.rufusy.spring_data.jpa.persistence.Video;
import com.rufusy.spring_data.jpa.persistence.VideoRepository;
import net.datafaker.Faker;
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
    public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepository videoRepository) {
        return args -> {
    /*        Faker faker = new Faker();
            for (int i = 0; i < 50; i++) {
                Author author = Author.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .email(faker.internet().emailAddress())
                        .age(faker.number().numberBetween(18, 50))
                        .createdBy(1)
                        .build();
                authorRepository.save(author);
            }*/
         /*   Video video = Video.builder()
                    .name("abc.mp4")
                    .length(30)
                    .createdBy(1)
                    .build();
            videoRepository.save(video);*/

//            authorRepository.updateAuthorAge(50, 50);

//            authorRepository.updateAllAuthorsAge(50);
        };
    }
}
