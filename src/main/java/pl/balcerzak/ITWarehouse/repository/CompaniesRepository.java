package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Companies;

@Repository
public interface CompaniesRepository extends JpaRepository<Companies, Long> {

    Companies findByIdCompanie(long id);

}
