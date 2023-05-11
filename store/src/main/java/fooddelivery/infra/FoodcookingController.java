package fooddelivery.infra;

import fooddelivery.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/foodcookings")
@Transactional
public class FoodcookingController {

    @Autowired
    FoodcookingRepository foodcookingRepository;

    @RequestMapping(
        value = "foodcookings/{id}/accept",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Foodcooking accept(
        @PathVariable(value = "id") Long id,
        @RequestBody AcceptCommand acceptCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /foodcooking/accept  called #####");
        Optional<Foodcooking> optionalFoodcooking = foodcookingRepository.findById(
            id
        );

        optionalFoodcooking.orElseThrow(() -> new Exception("No Entity Found"));
        Foodcooking foodcooking = optionalFoodcooking.get();
        foodcooking.accept(acceptCommand);

        foodcookingRepository.save(foodcooking);
        return foodcooking;
    }
}
