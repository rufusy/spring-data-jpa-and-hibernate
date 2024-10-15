package com.rufusy.spring_data.jpa.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    List<Author> findAllByFirstName(String firstName);

    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
