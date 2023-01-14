package com.example.demo.Security.SecurityEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Collection<Role> roles;

    public User() {
    }

    public User(Long id, String username, String password, String name, Collection<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUername() {
        return username;
    }

    public void setUername(String uername) {
        this.username = uername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
