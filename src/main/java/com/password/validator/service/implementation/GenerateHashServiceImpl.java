package com.password.validator.service.implementation;

import com.google.common.hash.Hashing;
import com.password.validator.dto.generateHast.GenerateHashRequest;
import com.password.validator.entity.UserPassword;
import com.password.validator.repository.UserPasswordsRepository;
import com.password.validator.service.GenerateHashService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.UUID;


@Slf4j
@Service
public class GenerateHashServiceImpl implements GenerateHashService {

    public GenerateHashServiceImpl(UserPasswordsRepository userPasswordsRepository) {
        this.userPasswordsRepository = userPasswordsRepository;
    }

    UserPasswordsRepository userPasswordsRepository;

    @Override
    public String generateHash(GenerateHashRequest generateHashRequest) {
        log.info("Comienza la ejecución del metodo generateHash. UUID: {} ", generateHashRequest.getUuid());
        String hash = Hashing.sha256()
                .hashString(generateHashRequest.getPassword(), StandardCharsets.UTF_8)
                .toString();
        log.info("Hash generado: {} ", hash);
        log.info("UUID: {}",UUID.fromString(generateHashRequest.getUuid()));


        //TODO: Falta que el repository recupere registros por UUID.
        Optional<UserPassword> userPassword = userPasswordsRepository.findById(UUID.fromString(generateHashRequest.getUuid()));
        log.info("userPassword: {}",userPassword);
        return hash;
    }
}
