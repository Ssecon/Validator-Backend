package com.password.validator.controller;

import com.password.validator.dto.generateHast.GenerateHashRequest;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

public interface ValidationController {

    ResponseEntity<String> generateHash(GenerateHashRequest generateHashRequest);


}
