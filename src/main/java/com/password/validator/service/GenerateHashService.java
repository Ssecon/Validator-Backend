package com.password.validator.service;

import com.password.validator.dto.generateHast.GenerateHashRequest;
import org.springframework.stereotype.Service;


public interface GenerateHashService {
    String generateHash(GenerateHashRequest generateHashRequest);
}
