package org.koszalka.pii.bureau.persistence.repository;

import org.koszalka.pii.bureau.persistence.entity.PersonDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Debt List Repository
 * @author rkoszalka
 */

@Repository
public interface PersonDataRepository extends JpaRepository<PersonDataEntity, Long> {
}
