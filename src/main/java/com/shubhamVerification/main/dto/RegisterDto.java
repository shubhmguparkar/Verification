package com.shubhamVerification.main.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class RegisterDto {
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumberOne;
    private String phoneNumberTwo;
    private String email;
    private String userName;
    private String password;
    private String confirmPassword;
    private LocalDate dateOfBirth;
    private String gender;
    private String age;
}
