package com.example.demo.service.impl;

import com.example.demo.entity.AlertSchedule;
import com.example.demo.exception.ResourceNotFoundException;
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
    public AlertSchedule createAlertSchedule(AlertSchedule alertSchedule) {
        return alertScheduleRepository.save(alertSchedule);
    }

    @Override
    public AlertSchedule getAlertScheduleById(Long id) {
        return alertScheduleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("AlertSchedule not found with id: " + id));
    }

    @Override
    public List<AlertSchedule> getAllAlertSchedules() {
        return alertScheduleRepository.findAll();
    }

    @Override
    public AlertSchedule updateAlertSchedule(Long id, AlertSchedule updatedAlertSchedule) {
        AlertSchedule alertSchedule = getAlertScheduleById(id);
        alertSchedule.setName(updatedAlertSchedule.getName());
        alertSchedule.setTime(updatedAlertSchedule.getTime());
        // add other fields
        return alertScheduleRepository.save(alertSchedule);
    }

    @Override
    public void deleteAlertSchedule(Long id) {
        AlertSchedule alertSchedule = getAlertScheduleById(id);
        alertScheduleRepository.delete(alertSchedule);
    }
}
