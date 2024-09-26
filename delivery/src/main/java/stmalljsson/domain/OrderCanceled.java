package stmalljsson.domain;

import java.util.*;
import lombok.*;
import stmalljsson.domain.*;
import stmalljsson.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Integer qty;
}
