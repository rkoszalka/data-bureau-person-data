package org.koszalka.pii.bureau.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Base entity
 * @author ctl_rkoszalka
 */

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -7744084013080282229L;

    @Column(name = "DAT_CREATION")
    @NotNull
    private LocalDateTime datCreation;

    @Column(name = "DAT_UPDATE")
    private LocalDateTime datUpdate;

    @Column(name = "NAM_CHANGE_AGENT")
    private String namChangeAgent = "salesforce-route-activities";

}