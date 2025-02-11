package com.gentech.saless.service;

import com.gentech.saless.entity.Sales;

import java.util.List;

public interface SalesService {
    Sales createSales(Sales sales);
    List<Sales> getAll();
    Sales getById(int saleId) throws Exception;
    Sales modifyById(int saleId, Sales sale);
    void deleteBYId(int saleId) throws Exception;
}
