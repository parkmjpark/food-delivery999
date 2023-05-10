package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Orderaccepted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodid;
    private String orderid;
    private String options;
    private String stordid;
    private String customerid;

    public Orderaccepted(Foodcooking aggregate) {
        super(aggregate);
    }

    public Orderaccepted() {
        super();
    }
}
