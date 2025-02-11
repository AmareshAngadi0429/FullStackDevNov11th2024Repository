package com.gentech.bnk.mapper;


import com.gentech.bnk.dtolayer.BankingDto;
import com.gentech.bnk.entity.Banking;

public class BankingMapper {
    public static BankingDto mapToBankingDTO(Banking banking)
    {
        BankingDto bankingDto = new BankingDto(banking.getId(),
                banking.getAccountHolderName(),
                banking.getAccountNumber(),
                banking.getBalance());
        return bankingDto;
    }
    public  static Banking mapToBanking(BankingDto bankingDto)
    {
        Banking banking = new Banking(bankingDto.getId(),
                bankingDto.getAccountHolderName(),
                bankingDto.getAccountNumber(),
                bankingDto.getBalance());
        return  banking;
    }
}
