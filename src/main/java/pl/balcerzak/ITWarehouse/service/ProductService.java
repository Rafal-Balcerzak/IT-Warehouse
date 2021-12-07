package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(long id);

    Product addProduct(Product product);

    void deleteProductById(long id);

    Product editProduct(Product product);
}
