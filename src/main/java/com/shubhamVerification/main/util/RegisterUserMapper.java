package com.shubhamVerification.main.util;

import com.shubhamVerification.main.dto.RegisterDto;
import com.shubhamVerification.main.dto.ResponseDto;
import com.shubhamVerification.main.entity.User;

public class RegisterUserMapper {
    public static User toEntity(RegisterDto registerDto) {
        User user = new User();
        user.setPassword(registerDto.getPassword());
        user.setFirstName(registerDto.getFirstName());
        user.setMiddleName(registerDto.getMiddleName());
        user.setLastName(registerDto.getLastName());
        user.setEmail(registerDto.getEmail());
        user.setAge(Integer.valueOf(registerDto.getAge()));
        user.setGender(registerDto.getGender());
        user.setDateOfBirth(registerDto.getDateOfBirth());
        user.setPassword(registerDto.getPassword());
        user.setPhoneNumberOne(registerDto.getPhoneNumberOne());
        user.setPhoneNumberTwo(registerDto.getPhoneNumberTwo());
        user.setUserName(registerDto.getUserName());
        return user;
    }

    public static ResponseDto toResponse(User savedUser) {
        return new ResponseDto(
                "SUCCESS",
                "User has been created successfully"
        );
    }
}
