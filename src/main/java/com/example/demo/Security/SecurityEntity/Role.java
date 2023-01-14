package com.example.demo.Security.SecurityEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users= new ArrayList<>();
}
