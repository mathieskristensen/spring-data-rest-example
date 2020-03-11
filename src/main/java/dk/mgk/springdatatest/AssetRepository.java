package dk.mgk.springdatatest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "assets", path = "assets")
public interface AssetRepository extends PagingAndSortingRepository<Asset, UUID> {
    List<Asset> findByType(@Param("type") String type);
}
