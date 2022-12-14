package com.bsm.backend.apis.product;

import com.bsm.backend.apis.product.IProductService;
import com.bsm.backend.apis.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final IProductService productService;

    @GetMapping("")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/{productId}")
    public Product FindProductById(@PathVariable long productId) {
        return productService.findProductById(productId);
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
