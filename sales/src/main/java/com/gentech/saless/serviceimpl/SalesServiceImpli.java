package com.gentech.saless.serviceimpl;

import com.gentech.saless.entity.Sales;
import com.gentech.saless.repositary.SalesRepositary;
import com.gentech.saless.service.SalesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesServiceImpli implements SalesService {
    private SalesRepositary saleRep;

    public SalesServiceImpli(SalesRepositary saleRep) {
        this.saleRep = saleRep;
    }

    @Override
    public Sales createSales(Sales sales) {
        return saleRep.save(sales);
    }

    @Override
    public List<Sales> getAll() {
        return saleRep.findAll();
    }

    @Override
    public Sales getById(int saleId) throws Exception{
        return saleRep.findById(saleId).orElseThrow(()->new Exception("id does not found"));

    }

    @Override
    public Sales modifyById(int saleId,Sales sale) {
        Sales sal = saleRep.findById(saleId).orElseThrow(()-> new RuntimeException("   "));
        sal.setProductName(sale.getProductName());
        sal.setSaleId(saleId);
        sal.setQuantitySold(sale.getQuantitySold());
        sal.setTotalPrice(sale.getTotalPrice());
        return saleRep.save(sal);
    }

    @Override
    public void deleteBYId(int saleId) throws Exception {
        saleRep.deleteById(saleId);
    }
}
