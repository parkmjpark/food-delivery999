package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Orderplaced extends AbstractEvent {

    private Long id;
    private String foodid;
    private String options;
    private String address;
    private String cutomerid;
    private String storeid;
}
