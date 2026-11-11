package com.shubhamVerification.main.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "VERIFICATION_USERS")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="FIRST_NAME",nullable = false)
    private String firstName;

    @Column(name = "MIDDLE_NAME", nullable = false)
    private String middleName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "AGE",nullable = false)
    private Integer age;

    @Column(name = "PHONE_NUMBER_ONE", length = 20)
    private String phoneNumberOne;

    @Column(name = "PHONE_NUMBER_TWO",length = 20)
    private String phoneNumberTwo;

    @Column(name="EMAIL",nullable = false, unique = true)
    private String email;

    @Column(name = "USER_NAME", nullable = false, unique = true)
    private String userName;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name="DATE_OF_BIRTH",nullable = false)
    private LocalDate dateOfBirth;

    @Column(name="LAST_LOGIN_TIME")
    private LocalDateTime lastLoginTime;

    @Column(name = "GENDER")
    private String gender;


}

