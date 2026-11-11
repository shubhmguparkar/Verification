package com.shubhamVerification.main.service;



import com.shubhamVerification.main.dto.RegisterDto;
import com.shubhamVerification.main.dto.ResponseDto;
import com.shubhamVerification.main.entity.User;
import com.shubhamVerification.main.util.RegisterUserMapper;
import com.shubhamVerification.main.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;

    public AuthenticationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseDto registerUser(RegisterDto registerDto) {
        if (userRepository.existsByEmail(registerDto.getEmail())) {
            return new ResponseDto("FAILED", "Email is already registered");
        }

        if (userRepository.existsByUserName(registerDto.getUserName())) {
            return new ResponseDto("FAILED", "Username is already taken");
        }

        User user = RegisterUserMapper.toEntity(registerDto);
        User savedUser = userRepository.save(user);

        return RegisterUserMapper.toResponse(savedUser);
    }
}

