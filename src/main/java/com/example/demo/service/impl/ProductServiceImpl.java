package com.example.warranty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.warranty.entity.Product;
import com.example.warranty.repository.ProductRepository;
import com.example.warranty.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getByUser(Long userId) {
        return productRepository.findByUserId(userId);
    }
}
