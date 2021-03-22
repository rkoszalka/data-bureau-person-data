package org.koszalka.pii.bureau.persistence.service;

import org.koszalka.pii.bureau.persistence.entity.PersonDataEntity;
import org.koszalka.pii.bureau.persistence.repository.PersonDataRepository;
import org.koszalka.pii.bureau.presentation.dto.PersonDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonDataService {

    private final PersonDataRepository personDataRepository;

    @Autowired
    public PersonDataService(PersonDataRepository personDataRepository) {
        this.personDataRepository = personDataRepository;
    }

    public PersonDataDTO getPersonData(Long cpfNumber) {
        PersonDataEntity personDataEntity = personDataRepository.getOne(cpfNumber);
        PersonDataDTO personDataDTO = new PersonDataDTO();

        // @todo: DTO ObjectMapper

        return personDataDTO;
    }
}
