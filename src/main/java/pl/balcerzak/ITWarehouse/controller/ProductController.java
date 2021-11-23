package pl.balcerzak.ITWarehouse.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Product;
import pl.balcerzak.ITWarehouse.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> getProductById(@PathVariable long id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping
    ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.addProduct(product));
    }
}
