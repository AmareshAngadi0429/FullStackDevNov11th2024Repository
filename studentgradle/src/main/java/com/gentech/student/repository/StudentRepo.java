package com.gentech.student.repository;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
