package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "foodcookings",
    path = "foodcookings"
)
public interface FoodcookingRepository
    extends PagingAndSortingRepository<Foodcooking, Long> {}
