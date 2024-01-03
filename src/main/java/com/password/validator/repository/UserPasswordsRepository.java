package com.password.validator.repository;

import com.password.validator.entity.UserPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface UserPasswordsRepository extends JpaRepository<UserPassword, Integer> {
    @Override
    Optional<UserPassword> findById(Integer uuid);

}
