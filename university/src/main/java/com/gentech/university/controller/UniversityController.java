package com.gentech.university.controller;

import com.gentech.university.dtolayer.UniversityDto;
import com.gentech.university.serviceimpl.UniversityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class UniversityController {
    @Autowired
    private UniversityServiceImpl service;
    @PostMapping("/saveuniversity")
    public ResponseEntity<UniversityDto> saveUniversity(@RequestBody UniversityDto universityDto)
    {
      
        return new ResponseEntity<>(service.create(universityDto), HttpStatus.CREATED);
    }

    @PostMapping("/savealluniversity")
    public ResponseEntity<List<UniversityDto>> saveAllUniversity(@RequestBody List<UniversityDto> universityDtos)
    {
        return new ResponseEntity<>(service.createMultiple(universityDtos),HttpStatus.CREATED);
    }
    @GetMapping("/getbyid")
    public ResponseEntity<UniversityDto> getById(@RequestParam int id) throws Exception
    {
        return new ResponseEntity<>(service.findByTheId(id),HttpStatus.OK);
    }
    @GetMapping("/getbyname")
    public ResponseEntity<List<UniversityDto>> getByName(@RequestParam String name)throws Exception
    {
        List<UniversityDto> list = service.getByName(name);
        return  new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/getall")
    public ResponseEntity<List<UniversityDto>>getAll(@RequestParam int pageNumber,
                                                     @RequestParam int pageSize,
                                                     @RequestParam String sortBy)
    {
        return new ResponseEntity<>(service.findAll(pageNumber, pageSize, sortBy),HttpStatus.OK);
    }
    @DeleteMapping("/deleteall")
    public ResponseEntity<String > deleteAllRecords()
    {
        service.deleteAll();
        return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
    }
    @GetMapping("/getbychairman")
    public ResponseEntity<List<UniversityDto>>getByChairman(@RequestParam String sortBy,
                                                            @RequestParam int pageNumber,
                                                            @RequestParam int pageSize,
                                                            @RequestParam String name)throws Exception
    {
        List<UniversityDto>list = service.getByChairman(pageNumber,pageSize,sortBy,name);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @DeleteMapping("/deletebyid")
    public  ResponseEntity<String>deleteById(@RequestParam int id)throws Exception
    {

        service.deleteById(id);
        return new ResponseEntity<>("deleted successfully",HttpStatus.OK);
    }
    @GetMapping("/getbyvcchairman")
    public ResponseEntity<List<UniversityDto>>getByViceChairman(@RequestParam String sortBy,
                                                            @RequestParam int pageNumber,
                                                            @RequestParam int pageSize,
                                                            @RequestParam String vcName)throws Exception
    {
        List<UniversityDto>list = service.getByViceChairman(pageNumber,pageSize,sortBy,vcName);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/getbyaddress")
    public ResponseEntity<List<UniversityDto>> getByAddress(@RequestParam String sortBy,
                                                            @RequestParam int pageNumber,
                                                            @RequestParam int pageSize,
                                                            @RequestParam String address)throws Exception
    {
        return new ResponseEntity<>(service.getByAddress(pageNumber, pageSize, sortBy, address),HttpStatus.OK);
    }
    @GetMapping("/getbychairmanandvicechairman")
    public ResponseEntity<List<UniversityDto>>getByChairmanAndViceChairman(@RequestParam String sortBy,
                                                                           @RequestParam int pageNumber,
                                                                           @RequestParam int pageSize,
                                                                           @RequestParam String chairman,
                                                                           @RequestParam String viceChairman)throws Exception
    {
        return new ResponseEntity<>(service.getByChairmanAndViceChairman(pageNumber, pageSize, sortBy, chairman, viceChairman),HttpStatus.OK);
    }
    @GetMapping("/getbychairmanaorvicechairman")
    public ResponseEntity<List<UniversityDto>>getByChairmanOrViceChairman(@RequestParam String sortBy,
                                                                           @RequestParam int pageNumber,
                                                                           @RequestParam int pageSize,
                                                                           @RequestParam String chairman,
                                                                           @RequestParam String viceChairman)throws Exception
    {
        return new ResponseEntity<>(service.getByChairmanOrViceChairman(pageNumber, pageSize, sortBy, chairman, viceChairman),HttpStatus.OK);
    }
    @PutMapping("/udatecontactbyname")
    public  ResponseEntity<String>updateUniversityContactByName(@RequestParam String name,
                                                                @RequestParam long contactNo)
    {
        int count = service.updateUniversitySetContactByName(contactNo, name);
        return new ResponseEntity<>(count+" no of rows effected",HttpStatus.OK);
    }
    @PutMapping("/updateaddressandcontactbyid")
    public ResponseEntity<String>updateUniversitySetContactAndAddressById(@RequestParam long contactNo,
                                                                           @RequestParam String address,
                                                                           @RequestParam int id)
    {
        int count = service.updateUniversitySetContactAndAddressById(contactNo,address,id);
        return  new ResponseEntity<>(count+" no of rows are affected",HttpStatus.OK);
    }

    @GetMapping("/getuniversitybyidandname")
    public ResponseEntity<UniversityDto> getUniversityByIdAndName(@RequestParam int id,
                                                                  @RequestParam String name)throws Exception
    {
        return new ResponseEntity<>(service.getUniversityByIdAndName(id,name),HttpStatus.OK);
    }
    @PutMapping("/updateemailbychairman")
    public ResponseEntity<String> updateUniversitySetEmailByName(@RequestParam String email,
                                                                 @RequestParam String chairman)
    {
        int count = service.updateUniversitySetEmailByChairman(email, chairman);
        return new ResponseEntity<>(count+" number of rows affected ",HttpStatus.OK);
    }
    @DeleteMapping("/deletebyname")
    public  ResponseEntity<String>deleteUniversityByName(@RequestParam String name)
    {
        int count = service.deleteUniversityByName(name);
        return new ResponseEntity<>(count+" no of rows are affected",HttpStatus.OK);
    }


}
