package com.example.demo.controller;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.service.AlertScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertschedules")
public class AlertScheduleController {

    private final AlertScheduleService alertScheduleService;

    public AlertScheduleController(AlertScheduleService alertScheduleService) {
        this.alertScheduleService = alertScheduleService;
    }

    @PostMapping
    public AlertSchedule createSchedule(@RequestBody AlertSchedule schedule) {
        return alertScheduleService.createSchedule(schedule);
    }

    @GetMapping("/user/{userId}")
    public List<AlertSchedule> getSchedulesByUser(@PathVariable Long userId) {
        return alertScheduleService.getSchedules(userId);
    }
}
