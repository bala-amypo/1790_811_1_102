package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import java.util.List;

public interface AlertLogService {
    List<AlertLog> getLogs(Long userId);
    AlertLog createLog(AlertLog log);
    AlertLog updateLog(Long id, AlertLog updatedLog);
    void deleteLog(Long id);
}
