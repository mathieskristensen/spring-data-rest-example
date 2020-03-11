package dk.mgk.springdatatest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "telematics-devices", path = "telematics-devices")
public interface TelematicsDeviceRepository extends PagingAndSortingRepository<TelematicsDevice, UUID> {
    List<TelematicsDevice> findByType(@Param("type") String type);
    TelematicsDevice findByIdentifier(@Param("identifier") String identifier);
}
