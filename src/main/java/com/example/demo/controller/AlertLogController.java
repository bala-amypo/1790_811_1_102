package com.example.demo.controller;

import com.example.demo.entity.AlertLog;
import com.example.demo.service.AlertLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertlogs")
public class AlertLogController {

    private final AlertLogService alertLogService;

    public AlertLogController(AlertLogService alertLogService) {
        this.alertLogService = alertLogService;
    }

    @PostMapping
    public AlertLog createLog(@RequestBody AlertLog log) {
        return alertLogService.createLog(log);
    }

    @GetMapping("/user/{userId}")
    public List<AlertLog> getLogsByUser(@PathVariable Long userId) {
        return alertLogService.getLogs(userId);
    }
}
