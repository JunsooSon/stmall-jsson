package stmalljsson.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmalljsson.domain.*;
import stmalljsson.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;

    public DeliveryReturned(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
//>>> DDD / Domain Event
