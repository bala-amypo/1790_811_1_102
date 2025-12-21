package com.example.demo.service.impl;

import com.example.demo.entity.AlertLog;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AlertLogRepository;
import com.example.demo.service.AlertLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertLogServiceImpl implements AlertLogService {

    private final AlertLogRepository alertLogRepository;

    public AlertLogServiceImpl(AlertLogRepository alertLogRepository) {
        this.alertLogRepository = alertLogRepository;
    }

    @Override
    public AlertLog createAlertLog(AlertLog alertLog) {
        return alertLogRepository.save(alertLog);
    }

    @Override
    public AlertLog getAlertLogById(Long id) {
        return alertLogRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("AlertLog not found with id: " + id));
    }

    @Override
    public List<AlertLog> getAllAlertLogs() {
        return alertLogRepository.findAll();
    }

    @Override
    public AlertLog updateAlertLog(Long id, AlertLog updatedAlertLog) {
        AlertLog alertLog = getAlertLogById(id);
        alertLog.setMessage(updatedAlertLog.getMessage());
        alertLog.setTimestamp(updatedAlertLog.getTimestamp());
        // add other fields as necessary
        return alertLogRepository.save(alertLog);
    }

    @Override
    public void deleteAlertLog(Long id) {
        AlertLog alertLog = getAlertLogById(id);
        alertLogRepository.delete(alertLog);
    }
}
