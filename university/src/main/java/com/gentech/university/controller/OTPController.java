package com.gentech.university.controller;

import com.gentech.university.serviceimpl.EmailService;
import com.gentech.university.serviceimpl.OTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class OTPController {

    @Autowired
    private OTPService otpService;

    @Autowired
    private EmailService emailService;

    // Send OTP to the provided email
    @PostMapping("/send-otp")
    public String sendOtp(@RequestParam String email) {
        String otp = otpService.generateOTP();

        // Save OTP to DB
        otpService.saveOtp(email, otp);

        // Send OTP via email
        emailService.sendOTP(email, otp);

        return "OTP sent successfully to " + email;
    }

    // Verify OTP provided by user
    @GetMapping("/verify-otp")
    public ResponseEntity<String> verifyOtp(@RequestParam String email, @RequestParam String otp) throws Exception {
        boolean isValid = otpService.validateOtp(email, otp);
        return  new ResponseEntity<>(" logged in successfully", HttpStatus.OK);
    }


}
