package com.example.demo.service;

import com.example.demo.entity.AlertLog;
import java.util.List;

public interface AlertLogService {
    AlertLog createLog(AlertLog log);
    List<AlertLog> getLogs(Long userId);
}
