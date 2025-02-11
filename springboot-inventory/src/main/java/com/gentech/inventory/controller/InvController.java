package com.gentech.inventory.controller;

import com.gentech.inventory.entity.Inventory;
import com.gentech.inventory.service.InvService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
public class InvController {
    private InvService invService;

    public InvController(InvService invService) {
        this.invService = invService;
    }

    @PostMapping("/postInv")
    public ResponseEntity<Inventory> postInv(@RequestBody Inventory inventory)
    {
        Inventory inv = invService.createInv(inventory);
        return new ResponseEntity<>(inv, HttpStatus.CREATED);
    }
    @GetMapping("/getAllInv")
    public ResponseEntity<List<Inventory>> getAllInvObj()
    {
        List<Inventory> invList = invService.getAll();
        return new ResponseEntity<>(invList,HttpStatus.FOUND);
    }
    @GetMapping("/getById/{n}")
    public ResponseEntity <Inventory> getByIdObj(@PathVariable("n") int id ) throws Exception {
        Inventory res = invService.getById(id);
        return new ResponseEntity<>(invService.getById(id), HttpStatus.OK);
    }
    @PutMapping("/mod/inv/{x}")
    public ResponseEntity<Inventory> modifyByIdObjInv(@PathVariable("x") int id, @RequestBody Inventory inve)throws Exception
    {
        Inventory invee = invService.modifyInv(id,inve);
        return new ResponseEntity<>(inve,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete/id/{a}")
    public  ResponseEntity<String> deleteById(@PathVariable("a") int invId) throws Exception
    {
        invService.getById(invId);
        invService.deleteById(invId);
        return  new ResponseEntity<>("deleted",HttpStatus.OK);

    }
}
