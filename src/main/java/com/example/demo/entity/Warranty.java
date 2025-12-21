package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "warranties")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private LocalDate expiryDate;

    @Column(unique = true, nullable = false)
    private String serialNumber;

    @OneToMany(
            mappedBy = "warranty",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<AlertSchedule> alertSchedules;

    @OneToMany(
            mappedBy = "warranty",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<AlertLog> alertLogs;
}
