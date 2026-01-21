package com.br.couriermanagement.couriermanagement.domain.model;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Setter(AccessLevel.PRIVATE)
public class Courier { 

    @EqualsAndHashCode.Include
    private UUID id;

    @Setter(AccessLevel.PUBLIC)
    private String name;

    @Setter(AccessLevel.PUBLIC)
    private String phone;

    private Integer fulfilledDeliveriesQuantity;

    private Integer pendingDeliveriesQuantity;

    private List<AssignedDelivery> peddingDeliveries;

    private OffsetDateTime lastfullfilledDeliveryAt;

    public List<AssignedDelivery> getAssignedDeliveries () {
        return Collections.unmodifiableList(this.peddingDeliveries);
    }

    public static Courier brandNew (String name, String phone) {
        Courier courier = new Courier();
        courier.setId(UUID.randomUUID());
        courier.setName(name);
        courier.setPhone(phone);
        courier.fulfilledDeliveriesQuantity = 0;
        courier.setFulfilledDeliveriesQuantity(0);
        courier.setPendingDeliveriesQuantity(0);
        return courier;
    }

    public void assign (UUID deliveryId) {
        this.peddingDeliveries.add(AssignedDelivery.pedding(deliveryId));
        this.setPendingDeliveriesQuantity(this.getPendingDeliveriesQuantity() + 1);
    }

    public void fullfill (UUID deliveryId) {
        AssignedDelivery delivery =  this.peddingDeliveries.stream().filter(
            d -> d.getId().equals(deliveryId)
        ).findFirst().orElseThrow();
        this.peddingDeliveries.remove(delivery);

        this.setPendingDeliveriesQuantity(this.getPendingDeliveriesQuantity() - 1);
        this.setFulfilledDeliveriesQuantity(this.getFulfilledDeliveriesQuantity() + 1);
        this.lastfullfilledDeliveryAt = OffsetDateTime.now();
    }
}