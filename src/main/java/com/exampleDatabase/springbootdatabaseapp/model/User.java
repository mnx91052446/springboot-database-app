package com.exampleDatabase.springbootdatabaseapp.model;

import javax.persistence.*;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private  String username;

    @Column(nullable = false)
    private  String password;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
