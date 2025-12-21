package com.example.demo.service.impl;

import com.example.demo.entity.AlertLog;
import com.example.demo.repository.AlertLogRepository;
import com.example.demo.service.AlertLogService;
import com.example.demo.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertLogServiceImpl implements AlertLogService {

    private final AlertLogRepository alertLogRepository;

    @Override
    public List<AlertLog> getLogs(Long userId) {
        return alertLogRepository.findByUserId(userId);
    }

    @Override
    public AlertLog createLog(AlertLog log) {
        return alertLogRepository.save(log);
    }

    @Override
    public AlertLog updateLog(Long id, AlertLog updatedLog) {
        AlertLog log = alertLogRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Log not found"));
        log.setMessage(updatedLog.getMessage());
        log.setTimestamp(updatedLog.getTimestamp());
        return alertLogRepository.save(log);
    }

    @Override
    public void deleteLog(Long id) {
        alertLogRepository.deleteById(id);
    }
}
