package it.danieltrosko.gastro.model.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class BaseUser extends BaseEntity {
    @Column(unique = true)
    private String username;
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;

}
