package com.password.validator.dto.generateHast;

import lombok.Data;

@Data
public class GenerateHashRequest {
    String uuid;
    String password;
}
