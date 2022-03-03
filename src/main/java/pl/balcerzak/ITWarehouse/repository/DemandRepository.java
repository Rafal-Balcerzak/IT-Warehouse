package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Demand;

import java.util.List;

@Repository
public interface DemandRepository extends JpaRepository<Demand, Long> {

    Demand findByIdDemand(long id);

    List<Demand> findAllByIsDoneFalse();

    long countByIsDoneFalse();
}
