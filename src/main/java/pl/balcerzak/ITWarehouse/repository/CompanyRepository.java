package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company findByIdCompany(long id);

}
