package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cookstarted extends AbstractEvent {

    private Long id;

    public Cookstarted(Foodcooking aggregate) {
        super(aggregate);
    }

    public Cookstarted() {
        super();
    }
}
