package stmalljsson.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmalljsson.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deliveries",
    path = "deliveries"
)
public interface DeliveryRepository
    extends PagingAndSortingRepository<Delivery, Long> {}
