package com.example.homework3.jwt.security;

import com.example.homework3.Usr.Entity.UsrUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JwtUserDetails implements UserDetails {

    private Long id;
    private String userName;
    private String userLastName;
    private String userNickName;
    private String userPassword;
    private String userEmail;
    private String userTelephoneNumber;
    private Collection<? extends GrantedAuthority> authorities;

    private JwtUserDetails(Long id, String userName, String userLastName,String userNickName,String userPassword,String userEmail, String userTelephoneNumber, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userNickName= userNickName;
        this.userPassword=userPassword;
        this.userEmail = userEmail;
        this.userTelephoneNumber=userTelephoneNumber;
        this.authorities = authorities;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return userPassword;
    }

    @Override
    public String getUsername() {
        return userName;
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

    public Long getId() {
        return id;
    }
}
