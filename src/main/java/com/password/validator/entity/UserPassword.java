package com.password.validator.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "USER_PASSWORDS")
public class UserPassword {
    @Id
    @JsonProperty(value = "uuid")
    UUID uuid;

    @JsonProperty(value = "password_hash")
    String PasswordHash;

}
