package com.gentech.banking_project.repositary;

import com.gentech.banking_project.entity.Banking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingRepo extends JpaRepository<Banking,Integer> {
}
