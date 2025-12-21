package com.example.demo.service.impl;

import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.entity.Warranty;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WarrantyRepository;
import com.example.demo.service.WarrantyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WarrantyServiceImpl implements WarrantyService {

    private final WarrantyRepository warrantyRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    @Override
    public Warranty createWarranty(Warranty warranty, Long userId, Long productId) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));

        warranty.setUser(user);
        warranty.setProduct(product);

        return warrantyRepository.save(warranty);
    }

    @Override
    public Warranty getWarrantyById(Long id) {
        return warrantyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Warranty not found"));
    }

    @Override
    public List<Warranty> getAllWarranties() {
        return warrantyRepository.findAll();
    }

    @Override
    public Warranty updateWarranty(Long id, Warranty updatedWarranty) {

        Warranty existing = warrantyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Warranty not found"));

        existing.setPurchaseDate(updatedWarranty.getPurchaseDate());
        existing.setExpiryDate(updatedWarranty.getExpiryDate());
        existing.setSerialNumber(updatedWarranty.getSerialNumber());

        return warrantyRepository.save(existing);
    }

    @Override
    public void deleteWarranty(Long id) {
        Warranty warranty = warrantyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Warranty not found"));

        warrantyRepository.delete(warranty);
    }
}
