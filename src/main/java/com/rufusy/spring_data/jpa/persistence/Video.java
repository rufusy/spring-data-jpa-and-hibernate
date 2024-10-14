package com.rufusy.spring_data.jpa.persistence;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@DiscriminatorValue("V") // use with SINGLE_TABLE
//@PrimaryKeyJoinColumn(name = "video_id") // use with JOINED
public class Video extends Resource {

    private int length;
}
