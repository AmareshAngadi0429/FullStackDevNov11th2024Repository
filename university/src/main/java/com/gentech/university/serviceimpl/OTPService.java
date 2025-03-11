package com.gentech.university.serviceimpl;

import com.gentech.university.entity.Otp;
import com.gentech.university.repositary.OtpRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class OTPService {

    @Autowired
    private OtpRepository otpRepository;


    private static final int OTP_LENGTH = 6;

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public String generateOTP() {
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(SECURE_RANDOM.nextInt(10));
        }

        return otp.toString();
    }

    // Save OTP to DB
    public Otp saveOtp(String email, String otp) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expiryTime = now.plusMinutes(5);
        Otp otpEntity = new Otp(email, otp, expiryTime);
        return otpRepository.save(otpEntity);
    }

    // Validate OTP
    public boolean validateOtp(String email, String otp) throws Exception{
      Otp otpEntityOpt = otpRepository.findByEmail(email);


      boolean isOtpValid = otpEntityOpt.getOtp().equals(otp);
      boolean isOtpExpired = otpEntityOpt.getExpiresAt().isBefore(LocalDateTime.now());

      if (isOtpValid && !isOtpExpired) {
          otpRepository.deleteById(otpEntityOpt.getId());
          return true;
      } else if (!isOtpValid) {
          throw new Exception(" invalid Otp please provide valid otp");
      }
      else if(isOtpExpired)
      {
          otpRepository.deleteById(otpEntityOpt.getId());
          throw new Exception(" time expired please try again");
      }
      return false;

    }
}
