package com.pocketpal.income.entity;

import com.pocketpal.income.constant.IncomeSource;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "income")
@Getter
@Setter
public class IncomeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)

    private IncomeSource source;

    private BigDecimal plannedIncome;

    private BigDecimal actualIncome;

    private LocalDateTime incomeDate;

    private String category;

    private String description;

    private Boolean isRecurring;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}