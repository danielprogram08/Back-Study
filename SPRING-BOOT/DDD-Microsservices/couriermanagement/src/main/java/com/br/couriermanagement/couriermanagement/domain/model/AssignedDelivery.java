package com.br.couriermanagement.couriermanagement.domain.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode
public class AssignedDelivery {

    @EqualsAndHashCode.Include
    private UUID id;

    private OffsetDateTime assignedAt;

    static AssignedDelivery pedding (UUID id) {
        AssignedDelivery delivery = new AssignedDelivery();
        delivery.setId(id);
        delivery.setAssignedAt(OffsetDateTime.now());
        return delivery;
    }
}