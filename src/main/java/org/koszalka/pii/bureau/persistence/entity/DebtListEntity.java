package org.koszalka.pii.bureau.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * DebtList entity
 *
 * @author ctl_rkoszalka
 */
@Getter
@Setter
@Entity
@Table(name = "RA_DEBT_LIST", schema = "PERSON_DATA")
public class DebtListEntity extends BaseEntity {

    private static final long serialVersionUID = -7356337535944426022L;

    @Id
    @Column(name = "ID_DEBT_LIST")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_RADEBT_LIST_ID")
    @SequenceGenerator(name = "SQ_RADEBT_LIST_ID", sequenceName = "SQ_RADEBT_LIST_ID",
            allocationSize = 1, schema = "SQ_RADEBT_LIST_ID")
    private Long idtPerson;

    @Column(name = "DEBT_NAME")
    @NotNull
    private String debtName;

    @Column(name = "DEBT_VALUE")
    @NotNull
    private String debtValue;

}