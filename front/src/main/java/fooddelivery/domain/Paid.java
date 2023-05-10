package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderid;
    private String status;

    public Paid(Pay aggregate) {
        super(aggregate);
    }

    public Paid() {
        super();
    }
}
