package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FoodcookingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Foodcooking>> {

    @Override
    public EntityModel<Foodcooking> process(EntityModel<Foodcooking> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/accept")
                .withRel("accept")
        );

        return model;
    }
}
