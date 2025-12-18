package com.example.warranty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.warranty.entity.AlertLog;
import com.example.warranty.repository.AlertLogRepository;
import com.example.warranty.service.AlertLogService;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    @Autowired
    private AlertLogRepository alertLogRepository;

    @Override
    public AlertLog save(AlertLog alertLog) {
        return alertLogRepository.save(alertLog);
    }

    @Override
    public List<AlertLog> getAll() {
        return alertLogRepository.findAll();
    }

    @Override
    public List<AlertLog> getByWarrantyId(Long warrantyId) {
        return alertLogRepository.findByWarrantyId(warrantyId);
    }
}
