package com.rufusy.spring_data.jpa.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "authors")
public class Author extends BaseEntity {

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

    @Column(length = 35, nullable = false)
    private String firstName;

    @Column(length = 35, nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}

