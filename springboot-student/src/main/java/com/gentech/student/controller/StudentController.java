package com.gentech.student.controller;

import com.gentech.student.Service.StudentService;
import com.gentech.student.dto.StudentDto;
import com.gentech.student.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/save")
    public ResponseEntity<StudentDto> postStudent(@RequestBody StudentDto studentDto)
    {
        return  new ResponseEntity<>(studentService.create(studentDto), HttpStatus.CREATED);
    }
    @GetMapping("/getAllObj")
    public ResponseEntity<List<StudentDto>> getAllObj(){

        return new ResponseEntity<>(studentService.getAll(),HttpStatus.OK);
    }
    @GetMapping("/getObjById/{x}")
    public  ResponseEntity<StudentDto> getById(@PathVariable int id) throws Exception
    {
        return new ResponseEntity<>(studentService.getById(id),HttpStatus.OK);
    }

}
