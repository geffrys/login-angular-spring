package com.geff.login.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_username", nullable = false, length = 50)
    private String userUsername;
    @Column(name = "user_password", nullable = false, length = 300)
    private String userPassword;
    @Column(name = "user_email", nullable = false, length = 50)
    private String userEmail;
    @Column(name = "user_fullname", nullable = false, length = 50)
    private String userFullName;
    @Column(name = "user_created_at")
    private LocalDateTime userCreatedAt;
    @Column(name = "user_updated_at")
    private LocalDateTime userUpdatedAt;
    @Column(name = "user_active")
    private Boolean userActive;
    @Column(name = "user_role")
    private String userRole;
    @Column(name = "user_locked")
    private Boolean userLocked;
    @Column(name = "user_locked_at")
    private LocalDateTime userLockedAt;
}
