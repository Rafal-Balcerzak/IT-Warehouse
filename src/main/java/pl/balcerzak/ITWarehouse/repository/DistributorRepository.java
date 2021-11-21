package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Distributor;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor, Long> {

    Distributor findByIdDistributor(long id);

}
