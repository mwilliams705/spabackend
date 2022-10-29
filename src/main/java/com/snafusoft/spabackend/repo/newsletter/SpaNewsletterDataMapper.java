package com.snafusoft.spabackend.repo.newsletter;

import com.snafusoft.spabackend.model.NewsletterEmailItem;
import com.snafusoft.spabackend.model.NewsletterSignupRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public interface SpaNewsletterDataMapper {

    SpaNewsletterDataDTO mapTo(NewsletterSignupRequest request);
    List<NewsletterEmailItem> mapTo(List<SpaNewsletterDataDTO> list);

    @Component
    class SpaNewsletterDataMapperImpl implements SpaNewsletterDataMapper{
        public SpaNewsletterDataDTO mapTo(NewsletterSignupRequest request){
            SpaNewsletterDataDTO dto = new SpaNewsletterDataDTO();
            dto.setEmail(request.getEmail());
            return dto;
        }

        public List<NewsletterEmailItem> mapTo(List<SpaNewsletterDataDTO> list){
            List<NewsletterEmailItem> newsletterEmailItems = new ArrayList<>();
            for (SpaNewsletterDataDTO item: list
            ) {
                NewsletterEmailItem newsletterEmailItem = new NewsletterEmailItem();
                newsletterEmailItem.setSnafuId(item.getSnafuId());
                newsletterEmailItem.setEmail(item.getEmail());
                newsletterEmailItems.add(newsletterEmailItem);
            }
            return newsletterEmailItems;
        }
    }


}
