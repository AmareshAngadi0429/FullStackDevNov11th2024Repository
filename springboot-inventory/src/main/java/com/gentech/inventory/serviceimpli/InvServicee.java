package com.gentech.inventory.serviceimpli;

import com.gentech.inventory.entity.Inventory;
import com.gentech.inventory.repository.InvRepo;
import com.gentech.inventory.service.InvService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvServicee implements InvService {
    private InvRepo invRepo;

    public InvServicee(InvRepo invRepo) {
        this.invRepo = invRepo;
    }

    @Override
    public Inventory createInv(Inventory inventory) {
        return invRepo.save(inventory) ;
    }

    @Override
    public List<Inventory> getAll() {
        List<Inventory> list = invRepo.findAll();
        return list;
    }



    @Override
    public Inventory getById(int invId) throws Exception {

        return invRepo.findById(invId).orElseThrow(() -> new Exception("The department Number does not exists!!!"));
    }

    @Override
    public Inventory modifyInv(int invId, Inventory inv) throws Exception {
        Inventory in = invRepo.findById(invId).orElseThrow(() -> new Exception("not found !!!!!1"));
        in.setInvId(invId);
        in.setpName(inv.getpName());
        in.setpQuantity(inv.getpQuantity());
        in.setPrice(inv.getPrice());
        invRepo.save(in);
        return in;
    }

    @Override
    public void deleteById(int invId) throws Exception {
        invRepo.deleteById(invId);
    }
}
