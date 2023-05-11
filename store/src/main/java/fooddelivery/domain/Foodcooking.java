package fooddelivery.domain;

import fooddelivery.StoreApplication;
import fooddelivery.domain.Cookfinished;
import fooddelivery.domain.Cookstarted;
import fooddelivery.domain.Orderrejected;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Foodcooking_table")
@Data
public class Foodcooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String status;

    private String foodid;

    private String orderid;

    private String options;

    private String stordid;

    private String customerid;

    @PostPersist
    public void onPostPersist() {
        Orderrejected orderrejected = new Orderrejected(this);
        orderrejected.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {
        Cookstarted cookstarted = new Cookstarted(this);
        cookstarted.publishAfterCommit();

        Cookfinished cookfinished = new Cookfinished(this);
        cookfinished.publishAfterCommit();
    }

    public static FoodcookingRepository repository() {
        FoodcookingRepository foodcookingRepository = StoreApplication.applicationContext.getBean(
            FoodcookingRepository.class
        );
        return foodcookingRepository;
    }

    public void accept(AcceptCommand acceptCommand) {
        Orderaccepted orderaccepted = new Orderaccepted(this);
        orderaccepted.publishAfterCommit();
    }

    public static void orderstatus(Orderplaced orderplaced) {
        /** Example 1:  new item 
        Foodcooking foodcooking = new Foodcooking();
        repository().save(foodcooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderplaced.get???()).ifPresent(foodcooking->{
            
            foodcooking // do something
            repository().save(foodcooking);


         });
        */

    }

    public static void updateStatus(Paid paid) {
        /** Example 1:  new item 
        Foodcooking foodcooking = new Foodcooking();
        repository().save(foodcooking);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(foodcooking->{
            
            foodcooking // do something
            repository().save(foodcooking);


         });
        */

    }
}
