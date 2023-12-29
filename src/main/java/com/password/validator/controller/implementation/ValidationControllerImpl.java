package com.password.validator.controller.implementation;

import com.password.validator.controller.ValidationController;
import com.password.validator.dto.generateHast.GenerateHashRequest;
import com.password.validator.service.GenerateHashService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ValidationControllerImpl implements ValidationController {
    public ValidationControllerImpl(GenerateHashService generateHashService) {
        this.generateHashService = generateHashService;
    }
    GenerateHashService generateHashService;
    @Override
    @PostMapping(path = "/generate")
    public ResponseEntity<String> generateHash(@RequestBody GenerateHashRequest generateHashRequest) {
        return new ResponseEntity<>(generateHashService.generateHash(generateHashRequest), HttpStatus.OK);
    }
}
