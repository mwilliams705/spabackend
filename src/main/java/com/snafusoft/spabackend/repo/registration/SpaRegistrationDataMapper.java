package com.snafusoft.spabackend.repo.registration;

import com.snafusoft.spabackend.model.RegistrationRequest;
import org.springframework.stereotype.Component;


public interface SpaRegistrationDataMapper {

    SpaRegistrationDataDTO mapTo(RegistrationRequest request);

    @Component
    class SpaRegistrationDataMapperImpl implements SpaRegistrationDataMapper{

        public SpaRegistrationDataDTO mapTo(RegistrationRequest request){
            SpaRegistrationDataDTO dataDTO = new SpaRegistrationDataDTO();
            dataDTO.setFirstName(request.getFirstName());
            dataDTO.setLastName(request.getLastName());
            dataDTO.setEmail(request.getEmail());
            dataDTO.setPhone(request.getPhone());
            return dataDTO;
        }

    }

}
