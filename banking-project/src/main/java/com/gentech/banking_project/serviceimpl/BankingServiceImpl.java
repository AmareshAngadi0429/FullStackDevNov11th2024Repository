package com.gentech.banking_project.serviceimpl;

import com.gentech.banking_project.dtolayer.BankingDto;
import com.gentech.banking_project.entity.Banking;
import com.gentech.banking_project.mapper.BankingMapper;
import com.gentech.banking_project.repositary.BankingRepo;
import com.gentech.banking_project.service.BankingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BankingServiceImpl implements BankingService {

    private BankingRepo bnkRepo;

    @Override
    public BankingDto createSavingAccount(BankingDto bankingDto) {
        Banking bankingEntity = BankingMapper.mapToBanking(bankingDto);
        BankingDto b = BankingMapper.mapToBankingDTO(bnkRepo.save(bankingEntity));
        return b;
    }
}
