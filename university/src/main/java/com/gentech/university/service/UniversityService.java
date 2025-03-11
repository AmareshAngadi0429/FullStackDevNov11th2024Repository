package com.gentech.university.service;

import com.gentech.university.dtolayer.UniversityDto;
import com.gentech.university.entity.University;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UniversityService {
    UniversityDto create(UniversityDto universityDto);

    List<UniversityDto> createMultiple(List<UniversityDto> universityDto);

    UniversityDto findByTheId(int id) throws Exception;

    List<UniversityDto> getByName(String name) throws Exception;

    List<UniversityDto> findAll(int pageNumber, int pageSize, String sortBy);

    void deleteById(int id)throws Exception;

    void deleteAll();

    List<UniversityDto> getByChairman(int pageNumber, int pageSize,String sortBy,String name)throws Exception;

    List<UniversityDto> getByViceChairman(int pageNumber, int pageSize,String sortBy,String vcName)throws Exception;

    List<UniversityDto> getByAddress(int pageNumber,int pageSize,String sortBy,String address)throws  Exception;

    List<UniversityDto> getByChairmanAndViceChairman(int pageNumber, int pageSize,String sortBy,String chairman,String viceChairman)throws Exception;

    List<UniversityDto> getByChairmanOrViceChairman(int pageNumber, int pageSize,String sortBy,String chairman,String viceChairman)throws Exception;

    Integer updateUniversitySetContactByName(long contactNo,String name);

    Integer updateUniversitySetContactAndAddressById(long contactNo,String address,int id);

    UniversityDto getUniversityByIdAndName(int id,String name) throws Exception;

    Integer updateUniversitySetEmailByChairman(String email, String chairman);

    Integer deleteUniversityByName(String name);
    Integer findAllPageCount();

    List<UniversityDto> getAllUniversitiesWithoutPagination()throws  Exception;
    void deleteInBatch (List<Integer> id);
}