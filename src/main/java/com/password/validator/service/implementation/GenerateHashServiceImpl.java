package com.password.validator.service.implementation;

import com.google.common.hash.Hashing;
import com.password.validator.dto.generateHast.GenerateHashRequest;
import com.password.validator.service.GenerateHashService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;


@Slf4j
@Service
public class GenerateHashServiceImpl implements GenerateHashService {
    @Override
    public String generateHash(GenerateHashRequest generateHashRequest) {
        log.info("Comienza la ejecución del metodo generateHash. UUID: {} ", generateHashRequest.getUuid());
        String hash = Hashing.sha256()
                .hashString(generateHashRequest.getPassword(), StandardCharsets.UTF_8)
                .toString();
        log.info("Hash generado: {} ", hash);

        return hash;
    }
}
