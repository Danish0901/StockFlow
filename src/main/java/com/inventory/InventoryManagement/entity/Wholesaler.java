package com.inventory.InventoryManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wholesaler {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    
    private String name;
    private String email;
    private String password;
    private String address;
    private Long phonenumber;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public RoleEnum getRole() {
        return role;
    }
    public void setRole(RoleEnum role) {
        this.role = role;
    } 
    

}
