package com.gentech.bnk.serviceimpl;


import com.gentech.bnk.dtolayer.BankingDto;
import com.gentech.bnk.entity.Banking;
import com.gentech.bnk.mapper.BankingMapper;
import com.gentech.bnk.repositary.BankingRepo;
import com.gentech.bnk.service.BankingService;
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
