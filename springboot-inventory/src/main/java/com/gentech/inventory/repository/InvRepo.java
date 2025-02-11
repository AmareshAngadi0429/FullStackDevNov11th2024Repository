package com.gentech.inventory.repository;

import com.gentech.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvRepo extends JpaRepository <Inventory, Integer>{

}
