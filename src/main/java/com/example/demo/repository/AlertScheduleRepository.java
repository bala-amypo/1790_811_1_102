package com.example.demo.repository;

import com.example.demo.entity.AlertSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlertScheduleRepository extends JpaRepository<AlertSchedule, Long> {

    Optional<AlertSchedule> findByWarrantyId(Long warrantyId);
}
