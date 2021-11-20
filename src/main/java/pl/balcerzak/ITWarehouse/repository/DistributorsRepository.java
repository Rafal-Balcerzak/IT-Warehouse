package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Distributors;

@Repository
public interface DistributorsRepository extends JpaRepository<Distributors, Long> {

    Distributors findByIdDistributor(long id);

}
