package com.example.warranty.service;

import java.util.List;

import com.example.warranty.entity.AlertLog;

public interface AlertLogService {

    AlertLog save(AlertLog alertLog);

    List<AlertLog> getAll();

    List<AlertLog> getByWarrantyId(Long warrantyId);
}
