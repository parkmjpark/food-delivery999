package fooddelivery.domain;

import fooddelivery.FrontApplication;
import fooddelivery.domain.Paid;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Pay_table")
@Data
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderid;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Paid paid = new Paid(this);
        paid.publishAfterCommit();
    }

    public static PayRepository repository() {
        PayRepository payRepository = FrontApplication.applicationContext.getBean(
            PayRepository.class
        );
        return payRepository;
    }

    public static void pay(Orderplaced orderplaced) {
        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderplaced.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

    }
}
