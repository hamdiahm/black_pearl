package main.entities;

import java.sql.Date;

public class User {
    String name;
    String email;
    String phone;
    String reset_code;
    String photo_profile;
    int id;
    String cin;
    String role;
    String postal_code;
    Date created_at;

    public User(String name, String email, String role)
    {
        this.name = name;
        this.email = email;
        this.role = role;
    }
    
    public User(int id, String name, String role)
    {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public User(int id, String name, String email, String phone, String reset_code, String photo, String cin,
                Date created_at, String role, String postal_code) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.reset_code = reset_code;
        this.photo_profile = photo;
        this.cin = cin;
        this.created_at = created_at;
        this.role = role;
        this.postal_code = postal_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReset_code() {
        return reset_code;
    }

    public void setReset_code(String reset_code) {
        this.reset_code = reset_code;
    }

    public String getPhoto_profile() {
        return photo_profile;
    }

    public void setPhoto_profile(String photo_profile) {
        this.photo_profile = photo_profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "User{name=" + name;
    }
}
