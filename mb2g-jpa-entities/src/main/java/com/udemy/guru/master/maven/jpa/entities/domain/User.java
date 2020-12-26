package com.udemy.guru.master.maven.jpa.entities.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author dbatista
 */
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TBL_USER")
public class User implements Serializable {


    @Id
    private long id;

    private String email;
    private String lastName;
    private String firstName;

}
