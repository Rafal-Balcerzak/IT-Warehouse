package pl.balcerzak.ITWarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.balcerzak.ITWarehouse.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByIdProduct(long id);

}
