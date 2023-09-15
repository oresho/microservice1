package com.oreoluwa.productservice.Repositories;

import com.oreoluwa.productservice.Entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}
