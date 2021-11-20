package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Addresses;

@Repository
public interface AddressesRepository extends JpaRepository<Addresses, Long> {

    Addresses findByIdAddress(long id);

}
