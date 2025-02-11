package com.gentech.student.Service;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public StudentDto create(StudentDto studentDto) ;
    public List<StudentDto> getAll();
    public  StudentDto getById(int id)throws Exception;
    public  StudentDto update(StudentDto stdDto,int id) throws Exception;


}
