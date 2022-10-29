package com.snafusoft.spabackend.repo.registration;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpaRegistrationDataRepo extends JpaRepository<SpaRegistrationDataDTO, UUID> {

}
