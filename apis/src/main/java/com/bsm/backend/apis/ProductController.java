package com.bsm.backend.apis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor

public class ProductController {
    private final IProductService productService;
    @GetMapping("")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }
    @GetMapping("/{product_id}")
    public Product FindProductById(@PathVariable long product_id) {
        return productService.findProductById(product_id);
    }
    @PostMapping("")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @DeleteMapping("")
    public Product deleteProduct(@RequestBody Product product) {
        return productService.deleteProduct(product);
    }


}
