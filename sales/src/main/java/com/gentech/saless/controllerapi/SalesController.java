package com.gentech.saless.controllerapi;

import com.gentech.saless.entity.Sales;

import com.gentech.saless.service.SalesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SalesController {
    private SalesService saleService;

    public SalesController(SalesService saleService) {
        this.saleService = saleService;
    }

    @PostMapping("/sale")
    public ResponseEntity<Sales> saveSales(@RequestBody Sales sales)
    {
        Sales savedSales = saleService.createSales(sales);
        return new ResponseEntity<>(savedSales,HttpStatus.CREATED);
    }
    @GetMapping("/getsales")
    public  ResponseEntity<List<Sales>> getAllSales()
    {
        List<Sales>displaySales = saleService.getAll();
        return new ResponseEntity<>(displaySales,HttpStatus.OK);
    }
    @GetMapping("/getsales/{n}")
    public  ResponseEntity<Sales> getSales(@PathVariable("n") int saleId) throws Exception
    {
        return new ResponseEntity<>(saleService.getById(saleId), HttpStatus.FOUND);
    }
    @PutMapping("/modifiable/{x}")
    public  ResponseEntity<Sales> modifySales(@PathVariable("x") int saleId, @RequestBody  Sales sale)
    {
        return new ResponseEntity<>(saleService.modifyById(saleId,sale), HttpStatus.OK);
    }
    @DeleteMapping("/deletebyid/{y}")
    public ResponseEntity<String> deleteById(@PathVariable("y") int saleId) throws Exception
    {
        saleService.getById(saleId);
        saleService.deleteBYId(saleId);
        return new ResponseEntity<>("deleted sucessfully",HttpStatus.ACCEPTED);
    }
}
