package com.oreoluwa.productservice.Services;


import com.oreoluwa.productservice.Dtos.ProductRequest;
import com.oreoluwa.productservice.Dtos.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
}
