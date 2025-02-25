package com.mazid.spring_security_client.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    private Integer id;
    private String username;
    private String password;
}
