package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cookfinished extends AbstractEvent {

    private Long id;

    public Cookfinished(Foodcooking aggregate) {
        super(aggregate);
    }

    public Cookfinished() {
        super();
    }
}
