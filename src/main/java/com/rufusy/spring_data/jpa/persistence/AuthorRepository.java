package com.rufusy.spring_data.jpa.persistence;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    List<Author> findAllByFirstName(String firstName);

    List<Author> findAllByFirstNameIgnoreCase(String firstName);

    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    List<Author> findAllByFirstNameStartsWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameEndsWithIgnoreCase(String firstName);

    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthorAge(int id, int age);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthorsAge(int age);
}
