package com.snafusoft.spabackend;

import com.snafusoft.spabackend.api.SpaApiDelegate;
import com.snafusoft.spabackend.coordinator.SpaBackendCoordinator;
import com.snafusoft.spabackend.model.JsonApi;
import com.snafusoft.spabackend.model.NewsletterEmailItem;
import com.snafusoft.spabackend.model.NewsletterSignupRequest;
import com.snafusoft.spabackend.model.RegistrationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpaBackendApiImpl implements SpaApiDelegate {

    private final SpaBackendCoordinator coordinator;

    public SpaBackendApiImpl(SpaBackendCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    @Override
    public ResponseEntity<JsonApi> addEmailToNewsletter(NewsletterSignupRequest newsletterSignupRequest) {
        coordinator.addEmailToNewsletter(newsletterSignupRequest);
        return ResponseEntity.ok(new JsonApi());
    }

    @Override
    public ResponseEntity<JsonApi> register(RegistrationRequest registrationRequest) {
        coordinator.register(registrationRequest);
        return ResponseEntity.ok(new JsonApi());
    }

    @Override
    public ResponseEntity<List<NewsletterEmailItem>> showAll() {
        return ResponseEntity.ok(coordinator.getListOfNewsletterEmails());
    }

    @Override
    public ResponseEntity<String> greet(String name) {
        return ResponseEntity.ok("Hello, "+ name);
    }
}
