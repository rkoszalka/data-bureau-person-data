package org.koszalka.pii.bureau.persistence.repository;

import org.koszalka.pii.bureau.persistence.entity.DebtListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Debt List Repository
 * @author rkoszalka
 */

@Repository
public interface DebtListRepository extends JpaRepository<DebtListEntity, Long> {
}
