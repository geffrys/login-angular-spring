package com.geff.login.config.security;

import lombok.Getter;

@Getter
public enum UserRoles {
    ADMIN("ADMIN"),
    USER("ADMIN");
    private String value;
    UserRoles(String value){
        this.value = value;
    }
}
