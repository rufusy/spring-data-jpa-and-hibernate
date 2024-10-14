package com.rufusy.spring_data.jpa.persistence;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@DiscriminatorValue("F") // use with SINGLE_TABLE
public class File extends Resource {

    private String type;
}
