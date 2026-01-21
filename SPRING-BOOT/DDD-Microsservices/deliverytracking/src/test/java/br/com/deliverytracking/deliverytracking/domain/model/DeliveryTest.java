package br.com.deliverytracking.deliverytracking.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.Duration;

import org.junit.jupiter.api.Test;

import br.com.deliverytracking.deliverytracking.domain.exception.DomainException;

public class DeliveryTest {

    @Test
    public void shouldChangeToPlaced () {
        Delivery delivery = Delivery.draft();

        delivery.editPreparationDetails(createValidPreparationDetails());

        delivery.place();

        assertEquals(DeliveryStatus.WAITING_FOR_COURIER, delivery.getStatus());
        assertNotNull(delivery.getPlacedAt());
    }

    @Test
    public void shouldNotChangeToPlaced () {
        Delivery delivery = Delivery.draft();

        assertThrows(DomainException.class, () -> {
            delivery.place();
        });

        assertEquals(DeliveryStatus.DRAFT, delivery.getStatus());
        assertNull(delivery.getPlacedAt());
    }

    private Delivery.PreparationDetails createValidPreparationDetails () {

        ContactPoint sender = ContactPoint.builder()
                .zipCode("00000-00")
                .street("Rua São Paulo")
                .number("100")
                .complement("sala 401")
                .name("João")
                .phone("(11) 99999-9999")
                .build();

        ContactPoint recepient = ContactPoint.builder()
                .zipCode("12345-67")
                .street("Rua Brasil")
                .number("500")
                .complement("")
                .name("Marina")
                .phone("(11) 91123-4567")
                .build();

        return Delivery.PreparationDetails.builder()
                .sender(sender)
                .recipient(recepient)
                .distanceFee(new BigDecimal("15.50"))
                .courierPayout(new BigDecimal("5.00"))
                .estimatedDeliveryTime(Duration.ofHours(5))
                .build();
    }

}