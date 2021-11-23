package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address findByIdAddress(long id);

}
