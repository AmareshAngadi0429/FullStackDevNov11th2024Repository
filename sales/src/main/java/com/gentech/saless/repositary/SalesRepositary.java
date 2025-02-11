package com.gentech.saless.repositary;

import com.gentech.saless.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepositary extends JpaRepository<Sales, Integer> {
}
