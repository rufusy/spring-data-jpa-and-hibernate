package com.rufusy.spring_data.jpa.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue
            /*(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"

            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    @TableGenerator(
            name = "author_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )*/
    private Integer id;

    @Column(length = 35)
    private String firstName;

    @Column(length = 35)
    private String lastName;

    @Column(unique = true,
            nullable = false)
    private String email;

    private int age;

    @Column(updatable = false,
            nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime lastModified;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}

