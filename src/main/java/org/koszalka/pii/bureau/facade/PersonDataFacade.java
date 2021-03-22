package org.koszalka.pii.bureau.facade;

import org.koszalka.pii.bureau.persistence.service.PersonDataService;
import org.koszalka.pii.bureau.presentation.dto.PersonDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDataFacade {

    private final PersonDataService personDataService;

    @Autowired
    public PersonDataFacade(PersonDataService personDataService) {
        this.personDataService = personDataService;
    }

    public PersonDataDTO getPersonData(Long cpfNumber) {
        return personDataService.getPersonData(cpfNumber);
    }
}
