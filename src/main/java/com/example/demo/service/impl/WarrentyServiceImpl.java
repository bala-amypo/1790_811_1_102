package com.example.warranty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.warranty.entity.Warranty;
import com.example.warranty.repository.WarrantyRepository;
import com.example.warranty.service.WarrantyService;

@Service
public class WarrantyServiceImpl implements WarrantyService {

    @Autowired
    private WarrantyRepository warrantyRepository;

    @Override
    public Warranty save(Warranty warranty) {
        return warrantyRepository.save(warranty);
    }

    @Override
    public List<Warranty> getAll() {
        return warrantyRepository.findAll();
    }
}
