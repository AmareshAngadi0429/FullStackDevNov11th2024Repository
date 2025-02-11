package com.gentech.student.mapping;

import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentMapping {
    public static StudentDto mapToStudentDto(StudentEntity student)
    {
        StudentDto studentDto = new StudentDto(
                                                student.getStdId(),
                                                student.getStdName(),
                                                student.getCourseName());
        return studentDto;
    }
    public static StudentEntity mapToStudentEntity(StudentDto studentDto)
    {
        StudentEntity studentEntity = new StudentEntity(
                studentDto.getStdId(),
                studentDto.getStdName(),
                studentDto.getCourseName());
        return studentEntity;
    }
    public static List<StudentDto> mapToStudentDtoList(List<StudentEntity> student)
    {
        List<StudentDto> sl = new ArrayList<>();
        for(int i=0;i<student.size();i++) {
            StudentDto studentDto = new StudentDto(
                    student.get(i).getStdId(),
                    student.get(i).getStdName(),
                    student.get(i).getCourseName());
            sl.add(i,studentDto);
        }
        return sl;
    }
}
