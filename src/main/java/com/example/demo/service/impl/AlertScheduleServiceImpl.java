package com.example.warranty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.warranty.entity.AlertLog;
import com.example.warranty.repository.AlertLogRepository;
import com.example.warranty.service.AlertService;

@Service
public class AlertServiceImpl implements AlertService {

    @Autowired
    private AlertLogRepository alertLogRepository;

    @Override
    public List<AlertLog> getAllLogs() {
        return alertLogRepository.findAll();
    }
}
