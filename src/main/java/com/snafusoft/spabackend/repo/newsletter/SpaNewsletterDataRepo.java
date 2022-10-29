package com.snafusoft.spabackend.repo.newsletter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpaNewsletterDataRepo extends JpaRepository<SpaNewsletterDataDTO, UUID> {

}
