package com.inventory.InventoryManagement.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.inventory.InventoryManagement.entity.AdminRegistration;

public class AdminConfig implements UserDetails {

    private final AdminRegistration admin;

    public AdminConfig(AdminRegistration admin) {
        this.admin = admin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(admin.getRole().name()));  
    }

    @Override
    public String getPassword() {
        return admin.getPassword(); 
    }

    @Override
    public String getUsername() {
        return admin.getEmail();  
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
