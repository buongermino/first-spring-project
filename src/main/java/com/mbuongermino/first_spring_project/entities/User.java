package com.mbuongermino.first_spring_project.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private long Id;
    private String Name;
    private String Email;
    private String Phone;
    private String Password;

    public User() {}

    public User(long Id, String Name, String Email, String Phone, String Password) {
        super();
        this.Id = Id;
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Password = Password;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Id == user.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
