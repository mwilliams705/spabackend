package com.snafusoft.spabackend.coordinator;

import com.snafusoft.spabackend.model.NewsletterEmailItem;
import com.snafusoft.spabackend.model.NewsletterSignupRequest;
import com.snafusoft.spabackend.model.RegistrationRequest;

import java.util.List;

public interface SpaBackendCoordinator {

//    Newsletter
    void addEmailToNewsletter(NewsletterSignupRequest request);

    List<NewsletterEmailItem> getListOfNewsletterEmails();

//    Registration
    void register(RegistrationRequest request);
}
