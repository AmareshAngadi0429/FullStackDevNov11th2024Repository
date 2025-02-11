package com.gentech.student.serviceimpl;

import com.gentech.student.Service.StudentService;
import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.StudentEntity;
import com.gentech.student.mapping.StudentMapping;
import com.gentech.student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpli implements StudentService
{
    @Autowired
    private StudentRepo stdRepo;
    @Override
    public StudentDto create(StudentDto studentDto) {
        StudentEntity savedStudent = StudentMapping.mapToStudentEntity(studentDto);
        stdRepo.save(savedStudent);
        return StudentMapping.mapToStudentDto(savedStudent);
    }

    @Override
    public List<StudentDto> getAll(){
         List<StudentEntity> list = stdRepo.findAll();

        List<StudentDto> li = StudentMapping.mapToStudentDtoList(list);

        return li;
    }

    @Override
    public StudentDto getById(int id) throws Exception {
         StudentEntity std = stdRepo.findById(id).orElseThrow(() -> new Exception("data not found"));
        return StudentMapping.mapToStudentDto(std);
    }

    @Override
    public StudentDto update(StudentDto stdDto, int id) throws Exception{
        StudentEntity std = StudentMapping.mapToStudentEntity(stdDto);
        StudentEntity st = stdRepo.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
        st.setStdId(id);
        st.setStdName(std.getStdName());
        st.setCourseName(std.getCourseName());

        return StudentMapping.mapToStudentDto(st);
    }


}
