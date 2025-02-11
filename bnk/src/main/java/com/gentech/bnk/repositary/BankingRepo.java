package com.gentech.bnk.repositary;


import com.gentech.bnk.entity.Banking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankingRepo extends JpaRepository<Banking,Integer> {
}
