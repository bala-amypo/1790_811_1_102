package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.repository.AlertScheduleRepository;
import com.example.demo.service.AlertScheduleService;
import com.example.demo.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertScheduleServiceImpl implements AlertScheduleService {

    private final AlertScheduleRepository alertScheduleRepository;

    @Override
    public List<AlertSchedule> getSchedules(Long userId) {
        return alertScheduleRepository.findByUserId(userId);
    }

    @Override
    public AlertSchedule createSchedule(AlertSchedule schedule) {
        return alertScheduleRepository.save(schedule);
    }

    @Override
    public AlertSchedule updateSchedule(Long id, AlertSchedule updatedSchedule) {
        AlertSchedule schedule = alertScheduleRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Schedule not found"));
        schedule.setName(updatedSchedule.getName());
        schedule.setTime(updatedSchedule.getTime());
        return alertScheduleRepository.save(schedule);
    }

    @Override
    public void deleteSchedule(Long id) {
        alertScheduleRepository.deleteById(id);
    }
}
