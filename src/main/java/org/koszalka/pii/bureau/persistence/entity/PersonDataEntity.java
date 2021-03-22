package org.koszalka.pii.bureau.persistence.entity;

import lombok.Getter;
import lombok.Setter;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Person Data Entity
 * @author ctl_rkoszalka
 */
@Getter
@Setter
@Entity
@Table(name = "RA_PERSON_DATA", schema = "PERSON_DATA")
public class PersonDataEntity extends BaseEntity {

    private static final long serialVersionUID = 1302038376155119059L;

    @Id
    @Column(name = "ID_PERSON_DATA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_RAPERSON_DATA_ID")
    @SequenceGenerator(name = "SQ_RAPERSON_DATA_ID", sequenceName = "SQ_RAPERSON_DATA_ID",
            allocationSize = 1, schema = "SALESFORCELEADS_ADM")
    private Long idtPerson;

    @Column(name = "CPF")
    @NotNull
    private String cpf;

    @Column(name = "NAM_PERSON")
    @NotNull
    private String personType;

    @ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.REFRESH })
    @JoinColumn(name = "ID_DEBT_LIST", foreignKey = @ForeignKey(name="RADEBT_RAPERSON_FK"))
    @NotNull
    private DebtListEntity debtListEntities;

}