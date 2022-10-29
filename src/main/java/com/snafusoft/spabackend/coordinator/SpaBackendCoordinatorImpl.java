package com.snafusoft.spabackend.coordinator;

import com.snafusoft.spabackend.model.NewsletterEmailItem;
import com.snafusoft.spabackend.model.NewsletterSignupRequest;
import com.snafusoft.spabackend.model.RegistrationRequest;
import com.snafusoft.spabackend.repo.newsletter.SpaNewsletterDataMapper;
import com.snafusoft.spabackend.repo.newsletter.SpaNewsletterDataRepo;
import com.snafusoft.spabackend.repo.registration.SpaRegistrationDataMapper;
import com.snafusoft.spabackend.repo.registration.SpaRegistrationDataRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class SpaBackendCoordinatorImpl implements SpaBackendCoordinator {
    private final SpaNewsletterDataMapper newsletterDataMapper;
    private final SpaNewsletterDataRepo newsletterDataRepo;
    private final SpaRegistrationDataMapper registrationDataMapper;
    private final SpaRegistrationDataRepo registrationDataRepo;



    public SpaBackendCoordinatorImpl(SpaNewsletterDataMapper newsletterDataMapper, SpaRegistrationDataMapper registrationDataMapper, SpaNewsletterDataRepo newsletterDataRepo, SpaRegistrationDataRepo registrationDataRepo) {
        this.newsletterDataMapper = newsletterDataMapper;
        this.registrationDataMapper = registrationDataMapper;
        this.newsletterDataRepo = newsletterDataRepo;
        this.registrationDataRepo = registrationDataRepo;
    }

    @Override
    public void addEmailToNewsletter(NewsletterSignupRequest request) {

        var  dataDTO = newsletterDataMapper.mapTo(request);
        newsletterDataRepo.save(dataDTO);

    }

    @Override
    public List<NewsletterEmailItem> getListOfNewsletterEmails() {
        return newsletterDataMapper.mapTo(newsletterDataRepo.findAll());
    }

    @Override
    public void register(RegistrationRequest request) {
        var dataDto = registrationDataMapper.mapTo(request);
        registrationDataRepo.save(dataDto);
    }
}
