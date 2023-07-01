package com.pocketpal.income.repository;

import com.pocketpal.income.entity.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeEntityRepository extends JpaRepository<IncomeEntity, Long> {
}