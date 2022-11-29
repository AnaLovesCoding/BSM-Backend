package com.bsm.backend.apis;

import java.util.List;

public interface IProductService {
    List<Product> findAllProducts();

    Product findProductById(long productId);

    Product saveProduct(Product product);

    Product deleteProduct(Product product);
}
