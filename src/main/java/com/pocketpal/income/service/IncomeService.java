package com.pocketpal.income.service;

import com.pocketpal.income.entity.IncomeEntity;
import com.pocketpal.income.repository.IncomeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncomeService {


    private final IncomeEntityRepository incomeEntityRepository;

    @Autowired
    public IncomeService(IncomeEntityRepository incomeEntityRepository) {
        this.incomeEntityRepository = incomeEntityRepository;
    }

    // Create Operation
    public IncomeEntity createIncome(IncomeEntity incomeEntity) {
        return incomeEntityRepository.save(incomeEntity);
    }

    // Read Operation
    public Optional<IncomeEntity> getIncome(Long id) {
        return incomeEntityRepository.findById(id);
    }

    // Update Operation
    public IncomeEntity updateIncome(IncomeEntity incomeEntity) {
        Optional<IncomeEntity> incomeFromDb = incomeEntityRepository.findById(incomeEntity.getId());
        IncomeEntity inc = null;
        if(incomeFromDb.isPresent()){
            inc = incomeFromDb.get();
            if(incomeEntity.getActualIncome() != null){
                inc.setActualIncome(incomeEntity.getActualIncome());
            }

            if(incomeEntity.getPlannedIncome() != null){
                inc.setPlannedIncome(incomeEntity.getPlannedIncome());
            }

            if(incomeEntity.getIncomeDate() != null){
                inc.setIncomeDate(incomeEntity.getIncomeDate());
            }

            if(incomeEntity.getCategory() != null){
                inc.setCategory(incomeEntity.getCategory());
            }

            if(incomeEntity.getIsRecurring() != null){
                inc.setIsRecurring(incomeEntity.getIsRecurring());
            }

            if(incomeEntity.getDescription() != null){
                inc.setDescription(incomeEntity.getDescription());
            }

            if(incomeEntity.getCreatedAt() != null){
                inc.setCreatedAt(incomeEntity.getCreatedAt());
            }

            if(incomeEntity.getUpdatedAt() != null){
                inc.setUpdatedAt(incomeEntity.getUpdatedAt());
            }

            if(incomeEntity.getSource() != null){
                inc.setSource(incomeEntity.getSource());
            }

        }
        return incomeEntityRepository.save(inc);
    }

    // Delete Operation
    public void deleteIncome(Long id) {
        incomeEntityRepository.deleteById(id);
    }

    // List all Incomes
    public List<IncomeEntity> getAllIncomes() {
        return incomeEntityRepository.findAll();
    }



}
