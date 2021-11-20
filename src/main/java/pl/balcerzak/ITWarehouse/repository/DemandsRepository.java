package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Demands;

@Repository
public interface DemandsRepository extends JpaRepository<Demands, Long> {

    Demands findByIdDemands(long id);

}
