package stmalljsson.domain;

import java.util.*;
import lombok.*;
import stmalljsson.domain.*;
import stmalljsson.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String productName;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private String status;
}
