package com.github.marrontan619.evetike.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    protected Users() {};

    public Users(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}
