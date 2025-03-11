package com.gentech.university.serviceimpl;

import com.gentech.university.dtolayer.UniversityDto;
import com.gentech.university.entity.University;
import com.gentech.university.expection.UniversityExepection;
import com.gentech.university.mapper.UniversityMapper;
import com.gentech.university.repositary.UniversityRepository;
import com.gentech.university.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UniversityServiceImpl implements UniversityService {
    @Autowired
    private UniversityRepository repository;

    @Override
    public UniversityDto create(UniversityDto universityDto) {
        University university = UniversityMapper.mapToUniversity(universityDto);
        return UniversityMapper.mapToUniversityDto(repository.save(university));
    }

    @Override
    public List<UniversityDto> createMultiple(List<UniversityDto> universityDto) {
        List<University> list = repository.saveAll(universityDto.stream().map((universityDto1) -> UniversityMapper.mapToUniversity(universityDto1)).collect(Collectors.toList()));
       return list.stream().map((university )-> UniversityMapper.mapToUniversityDto(university)).collect(Collectors.toList());
    }

    @Override
    public UniversityDto findByTheId(int id) throws Exception {
        return UniversityMapper.mapToUniversityDto(repository.findById(id).orElseThrow(() -> new RuntimeException("record does not exist")));

    }

    @Override
    public List<UniversityDto> getByName(String name)throws Exception {
        Optional<List<University>> university = repository.findByName(name);

        university.filter(universityList -> !universityList.isEmpty()).orElseThrow(()->new UniversityExepection("not found"));

        return university.get().stream().map((university1 -> UniversityMapper.mapToUniversityDto(university1))).collect(Collectors.toList());

    }

    @Override
    public List<UniversityDto> findAll(int pageNumber, int pageSize, String sortBy) {
        Sort sort = Sort.by(Sort.Direction.ASC,sortBy);
        Pageable page = PageRequest.of(pageNumber,pageSize,sort);
        return repository.findAll(page).stream().map((university -> UniversityMapper.mapToUniversityDto(university))).collect(Collectors.toList());
    }

    @Override
    public void deleteById(int id) throws UniversityExepection {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new UniversityExepection("ID not found: " + id);
        }
    }


    @Override
    public void deleteAll() {
        repository.deleteAll();

    }

    @Override
    public List<UniversityDto> getByChairman(int pageNumber, int pageSize, String sortBy,String name) throws Exception{
        Sort sort = Sort.by(Sort.Direction.ASC,sortBy);
        Pageable pg = PageRequest.of(pageNumber,pageSize,sort);
        Page<University> page = repository.findByChairman(name,pg);

        if (page.isEmpty())
        {
            throw new Exception("not found");
        }

        return page.getContent().stream().map((university1 -> UniversityMapper.mapToUniversityDto(university1))).collect(Collectors.toList());
    }

    @Override
    public List<UniversityDto> getByViceChairman(int pageNumber, int pageSize, String sortBy, String vcName) throws Exception {
        Sort sort = Sort.by(Sort.Direction.ASC,sortBy);
        Pageable pg = PageRequest.of(pageNumber,pageSize,sort);
        Optional<List<University>> list = repository.findByViceChairman(vcName,pg);
        list.filter(li->!li.isEmpty()).orElseThrow(()->new UniversityExepection("not found"));
        return list.get().stream().map((university -> UniversityMapper.mapToUniversityDto(university))).collect(Collectors.toList());
    }

    @Override
    public List<UniversityDto> getByAddress(int pageNumber, int pageSize, String sortBy, String address) throws Exception {
        Sort sort = Sort.by(Sort.Direction.ASC,sortBy);
        Pageable page = PageRequest.of(pageNumber,pageSize,sort);
        Page<University> page1 = repository.findByAddress(address,page);
        if (page1.isEmpty())
        {
            throw new UniversityExepection("not found");
        }
        return page1.getContent().stream().map((university -> UniversityMapper.mapToUniversityDto(university))).collect(Collectors.toList());
    }

    @Override
    public List<UniversityDto> getByChairmanAndViceChairman(int pageNumber, int pageSize, String sortBy, String chairman,String viceChairman) throws Exception {
        Sort sort = Sort.by(Sort.Direction.ASC,sortBy);
        Pageable page = PageRequest.of(pageNumber,pageSize,sort);
        Optional<List<University>> list = repository.findByChairmanAndViceChairman(chairman,viceChairman,page);
        list.filter(universityList -> !universityList.isEmpty()).orElseThrow(()->new UniversityExepection("not found"));

        return list.get().stream().map((university -> UniversityMapper.mapToUniversityDto(university))).collect(Collectors.toList());
    }

    @Override
    public List<UniversityDto> getByChairmanOrViceChairman(int pageNumber, int pageSize, String sortBy, String chairman,String viceChairman)throws Exception {
        Sort sort = Sort.by(Sort.Direction.ASC,sortBy);
        Pageable page = PageRequest.of(pageNumber,pageSize,sort);
         Optional<List<University>> list = repository.getUniversityByChairmanOrViceChairman(chairman,viceChairman,page);
         list.filter(universityList -> !universityList.isEmpty()).orElseThrow(()-> new UniversityExepection("not found"));
         return list.get().stream().map(university -> UniversityMapper.mapToUniversityDto(university)).collect(Collectors.toList());
    }

    @Override
    public Integer updateUniversitySetContactByName(long contactNo, String name) {

        return repository.updateUniversityByName(contactNo, name);
    }

    @Override
    public Integer updateUniversitySetContactAndAddressById(long contactNo, String address, int id) {

        return repository.updateUniversityById(contactNo, address, id);
    }

    @Override
    public UniversityDto getUniversityByIdAndName(int id, String name)throws Exception {
        return UniversityMapper.mapToUniversityDto(repository.getUniversityByIdAndName(id,name).orElseThrow(()-> new UniversityExepection("Record not found")));

    }

    @Override
    public Integer updateUniversitySetEmailByChairman(String email, String chairman) {
        return repository.updateUniversityByChairman(email, chairman);
    }

    @Override
    public Integer deleteUniversityByName(String name) {
        return repository.deleteUniversityByName(name);
    }

    @Override
    public Integer findAllPageCount() {
        int  val = repository.findAll().size();
        return val;
    }

    @Override
    public List<UniversityDto> getAllUniversitiesWithoutPagination() throws Exception {
        if (repository.findAll().size()==0)
        {
            throw new Exception((" no records  found"));
        }
        else {
            return repository.findAll().stream().map((university -> UniversityMapper.mapToUniversityDto(university))).collect(Collectors.toList());
        }
    }

    @Override
    public void deleteInBatch(List<Integer> id) {
        repository.deleteAllByIdInBatch(id);
    }


}
