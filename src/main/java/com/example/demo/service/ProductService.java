package com.example.warranty.service;

import java.util.List;
import com.example.warranty.entity.Product;

public interface ProductService {

    Product save(Product product);

    List<Product> getByUser(Long userId);
}
