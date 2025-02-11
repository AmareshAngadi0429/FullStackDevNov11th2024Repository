package com.gentech.inventory.service;

import com.gentech.inventory.entity.Inventory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface InvService  {
    Inventory createInv (Inventory inventory);
    List<Inventory> getAll();
    Inventory getById(int invId) throws Exception;
    Inventory modifyInv(int invId ,Inventory inv) throws Exception;
    void deleteById(int invId)throws Exception;
}
