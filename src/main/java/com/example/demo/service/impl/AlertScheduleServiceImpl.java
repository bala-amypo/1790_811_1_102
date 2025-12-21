package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;
import com.example.demo.service.AlertScheduleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertScheduleServiceImpl implements AlertScheduleService {

    private final AlertScheduleRepository alertScheduleRepository;

    public AlertScheduleServiceImpl(AlertScheduleRepository alertScheduleRepository) {
        this.alertScheduleRepository = alertScheduleRepository;
    }

    @Override
    public AlertSchedule createSchedule(AlertSchedule schedule) {
        return alertScheduleRepository.save(schedule);
    }

    @Override
    public List<AlertSchedule> getSchedules(Long userId) {
        return alertScheduleRepository.findByUserId(userId);
    }
}
