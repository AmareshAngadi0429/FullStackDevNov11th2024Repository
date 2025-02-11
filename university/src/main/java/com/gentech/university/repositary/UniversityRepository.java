package com.gentech.university.repositary;

import com.gentech.university.entity.University;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UniversityRepository extends JpaRepository<University,Integer>, PagingAndSortingRepository<University,Integer> {
    Optional<List<University>> findByName(String name);

    Page<University> findByChairman(String name, Pageable page);

    Optional<List<University>> findByViceChairman(String vcName,Pageable page);

    Page<University> findByAddress(String address, Pageable page);

    Optional<List<University>> findByChairmanAndViceChairman(String chairman,String viceChairman, Pageable page);

    @Query("FROM University WHERE chairman=:chairman OR viceChairman=:viceChairman")
    Optional<List<University>>getUniversityByChairmanOrViceChairman(@Param("chairman") String chairman,@Param("viceChairman") String viceChairman,Pageable pageable);

    @Query("FROM University WHERE id=:id AND name=:name")
    Optional<University>getUniversityByIdAndName(int id,String name);

    @Modifying
    @Transactional
    @Query("UPDATE University SET contactNo=:contactNo WHERE name=:name")
    Integer updateUniversityByName(long contactNo,String name);

    @Modifying
    @Transactional
    @Query("UPDATE University SET contactNo=:contactNo,address=:address WHERE id=:id")
    Integer updateUniversityById(long contactNo,String address,int id);

    @Modifying
    @Transactional
    @Query("UPDATE University SET eMail=:eMail WHERE chairman=:chairman")
    Integer updateUniversityByChairman(String eMail,String chairman);

    @Modifying
    @Transactional
    @Query("DELETE FROM University WHERE name=:name")
    Integer deleteUniversityByName(String name);






}
