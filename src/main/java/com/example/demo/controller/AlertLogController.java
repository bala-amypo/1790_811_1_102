package com.example.warranty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.warranty.entity.AlertLog;
import com.example.warranty.service.AlertLogService;

@RestController
@RequestMapping("/alert-logs")
public class AlertLogController {

    @Autowired
    private AlertLogService alertLogService;

    // Get all alert logs
    @GetMapping
    public List<AlertLog> getAllAlertLogs() {
        return alertLogService.getAll();
    }
}
