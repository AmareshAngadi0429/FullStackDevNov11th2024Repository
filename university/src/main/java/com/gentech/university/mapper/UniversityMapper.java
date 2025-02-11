package com.gentech.university.mapper;

import com.gentech.university.dtolayer.UniversityDto;
import com.gentech.university.entity.University;

public class UniversityMapper {
    public  static UniversityDto mapToUniversityDto(University university)
    {
        UniversityDto universitydto = new UniversityDto(
                university.getId(),
                university.getName(),
                university.getDoe(),
                university.getChairman(),
                university.getViceChairman(),
                university.getAddress(),
                university.getContactNo(),
                university.getEMail());
        return universitydto;
    }
    public static University mapToUniversity(UniversityDto universityDto)
    {
        University university = new University(
                universityDto.getId(),
                universityDto.getName(),
                universityDto.getDoe(),
                universityDto.getChairman(),
                universityDto.getViceChairman(),
                universityDto.getAddress(),
                universityDto.getContactNo(),
                universityDto.getEMail());
        return university;
    }
}
