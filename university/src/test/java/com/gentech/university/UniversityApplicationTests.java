package com.gentech.university;

import com.gentech.university.dtolayer.UniversityDto;
import com.gentech.university.entity.University;
import com.gentech.university.mapper.UniversityMapper;
import com.gentech.university.repositary.UniversityRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UniversityApplicationTests {


	@LocalServerPort
	private int port;

	@Autowired
	private UniversityRepository repository;

	private static RestTemplate restTemplate = null;

	private String baseUrl = "http://localhost:";

	@BeforeAll
	public static void init()
	{
		restTemplate = new RestTemplate();
	}
	@BeforeEach
	public  void url()
	{
		baseUrl=baseUrl+port+"/api/v1";
	}
	@AfterEach
	public void flush()
	{
		repository.deleteAll();
	}


// -------------------------------------------Test cases for university------------------------------------------------------------

//----------------- Test for save University--------------------------------------------------------------------

	@Test
	public void shouldSaveUniversity()
	{
		University university = new University("Banglore","VTU","Gangadar","Suresh",9900860380L,"@gmail");
		UniversityDto universityDto = UniversityMapper.mapToUniversityDto(university);
		UniversityDto u1 =restTemplate.postForObject(baseUrl+"/saveuniversity",universityDto,UniversityDto.class);

		//Validate the testcase

		Assertions.assertTrue(u1.getChairman().contains("Gangadar"));
		Assertions.assertNotNull(u1);
		Assertions.assertEquals("Banglore",u1.getAddress());

	}

//------------------------------- Test for saveAll universities---------------------------------------------------------------

	@Test
	public  void shouldSaveAllUniversities()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		University university2 = new University("Banglore","VTU","Gangadar","Suresh",9900860380L,"vtu@gmail");
		UniversityDto universityDto1= UniversityMapper.mapToUniversityDto(university1);
		UniversityDto universityDto2 = UniversityMapper.mapToUniversityDto(university2);
		List<UniversityDto> list = new ArrayList<>();
		list.add(universityDto1);
		list.add(universityDto2);
		List<UniversityDto> li =restTemplate.postForObject(baseUrl+"/savealluniversity",list,List.class);

		ResponseEntity<List> responseEntity =  restTemplate.exchange(baseUrl+"/getall?pageNumber="+0+"&pageSize="+20+"&sortBy=name", HttpMethod.GET,null, List.class);

		List<Map<String,Object>> list1 = responseEntity.getBody();

		List<UniversityDto> universityDtoList = list1.stream().map(stringObjectMap ->
		{
			UniversityDto dto = new UniversityDto();
			dto.setName((String)stringObjectMap.get("name"));
			dto.setAddress((String) stringObjectMap.get("address"));
			dto.setContactNo(Long.parseLong((String)stringObjectMap.get("contactNo")));
			dto.setChairman((String) stringObjectMap.get("chairman"));
			dto.setViceChairman((String) stringObjectMap.get("viceChairman"));
			dto.setEMail((String) stringObjectMap.get("eMail"));
			return dto;

		}).collect(Collectors.toList());

		// validation for testcases
		Assertions.assertFalse(universityDtoList.isEmpty());
		Assertions.assertEquals("Tumkur",universityDtoList.get(0).getAddress());
	}
	//---------------------------------------- test case for get by id-------------------------------------------------------------
	@Test
	public void shouldGetById()
	{

		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");


		UniversityDto li =restTemplate.postForObject(baseUrl+"/saveuniversity",UniversityMapper.mapToUniversityDto(university1),UniversityDto.class);

		UniversityDto universityDto =restTemplate.getForObject(baseUrl+"/getbyid?id="+li.getId(),UniversityDto.class);

		// validate testcase
		Assertions.assertEquals("Tumkur",universityDto.getAddress());
		Assertions.assertTrue(universityDto.getChairman().contains("Ganesh"));


	}
	//-------------------------------------test case for get by name-------------------------------------------------------------
	@Test
	public  void shouldGetByName()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		UniversityDto universityDto = restTemplate.postForObject(baseUrl+"/saveuniversity",university1,UniversityDto.class);

		ResponseEntity<List> list = restTemplate.exchange(baseUrl+"/getbyname?name="+universityDto.getName(), HttpMethod.GET,null, List.class);

		List<Map<String, Object>> responseList = list.getBody();

		List<UniversityDto> universityDtos = responseList.stream()
				.map(map -> {
					UniversityDto dto = new UniversityDto();
					dto.setName((String) map.get("name"));
					dto.setAddress((String) map.get("address"));
					dto.setContactNo(Long.parseLong((String)map.get("contactNo")));
					dto.setChairman((String) map.get("chairman"));
					dto.setViceChairman((String)map.get( "viceChairman"));
					dto.setEMail((String) map.get("eMail"));
					return dto;
				})
				.collect(Collectors.toList());

		// validation for testcases
		Assertions.assertFalse(universityDtos.isEmpty(), "No UniversityDto found for the given name");
		Assertions.assertEquals(9900860377L, universityDtos.get(0).getContactNo());


	}
	//----------------------------------------------testcase for get all----------------------------------------------------------
	@Test
	public void getAll()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		University university2 = new University("Banglore","VTU","Gangadar","Suresh",9900860380L,"vtu@gmail");
		UniversityDto universityDto1= UniversityMapper.mapToUniversityDto(university1);
		UniversityDto universityDto2 = UniversityMapper.mapToUniversityDto(university2);
		List<UniversityDto> list = new ArrayList<>();
		list.add(universityDto1);
		list.add(universityDto2);
		List<UniversityDto> li =restTemplate.postForObject(baseUrl+"/savealluniversity",list, List.class);

		ResponseEntity<List>  responseEntity =  restTemplate.exchange(baseUrl+"/getall?pageNumber="+0+"&pageSize="+20+"&sortBy=name",HttpMethod.GET,null, List.class);

		List<Map<String,Object>> list1 = responseEntity.getBody();

		List<UniversityDto> universityDtoList = list1.stream().map(stringObjectMap ->
		{
			UniversityDto dto = new UniversityDto();
			dto.setName((String)stringObjectMap.get("name"));
			dto.setAddress((String) stringObjectMap.get("address"));
			dto.setContactNo(Long.parseLong((String)stringObjectMap.get("contactNo")));
			dto.setChairman((String) stringObjectMap.get("chairman"));
			dto.setViceChairman((String) stringObjectMap.get("viceChairman"));
			dto.setEMail((String) stringObjectMap.get("eMail"));
			return dto;

		}).collect(Collectors.toList());

		// validation for testcases
		Assertions.assertFalse(universityDtoList.isEmpty());
		Assertions.assertEquals("Tumkur",universityDtoList.get(0).getAddress());
	}
	//-------------------------------------testcase for delete All--------------------------------------------------------------------
	@Test
	public void deleteAll()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		University university2 = new University("Banglore","VTU","Gangadar","Suresh",9900860380L,"vtu@gmail");
		UniversityDto universityDto1= UniversityMapper.mapToUniversityDto(university1);
		UniversityDto universityDto2 = UniversityMapper.mapToUniversityDto(university2);
		List<UniversityDto> list = new ArrayList<>();
		list.add(universityDto1);
		list.add(universityDto2);
		List<UniversityDto> li =restTemplate.postForObject(baseUrl+"/savealluniversity",list,List.class);

		restTemplate.delete(baseUrl+"/deleteall");
		ResponseEntity<List>  responseEntity =  restTemplate.exchange(baseUrl+"/getall?pageNumber="+0+"&pageSize="+20+"&sortBy=name",HttpMethod.GET,null, List.class);
		List<Map<String,Object>> list1 = responseEntity.getBody();

		// validation for testcases

		Assertions.assertTrue(list1.isEmpty());
	}

	//---------------------------------------Testcase for delete by id----------------------------------------------------------------------
	@Test
	public void deleteById()
	{
		University university = new University("Banglore","VTU","Gangadar","Suresh",9900860380L,"@gmail");
		UniversityDto universityDto = UniversityMapper.mapToUniversityDto(university);
		UniversityDto u1 =restTemplate.postForObject(baseUrl+"/saveuniversity",universityDto,UniversityDto.class);

		restTemplate.delete(baseUrl+"/deletebyid?id="+u1.getId());

		int countOfExistingStudents=repository.findAll().size();

		// validation for testcases
		Assertions.assertEquals(0,countOfExistingStudents);
	}
	//--------------------------------------------Testcase for get by chairman----------------------------------------------------------------------------------
	@Test
	public  void getByChairman()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		UniversityDto universityDto = restTemplate.postForObject(baseUrl+"/saveuniversity",university1,UniversityDto.class);

		ResponseEntity<List> list = restTemplate.exchange(baseUrl+"/getbychairman?sortBy=name&pageNumber="+0+"&pageSize="+20+"&name=Ganesh", HttpMethod.GET,null, List.class);

		List<Map<String,Object>> universityDtoList = list.getBody();

		List<UniversityDto >universityDtoList1 = universityDtoList.stream().map(map ->
		{
			UniversityDto dto = new UniversityDto();
			dto.setId(Integer.parseInt((String) map.get("id")));
			dto.setName((String)map.get("name"));
			dto.setAddress((String) map.get("address"));
			dto.setContactNo(Long.parseLong((String)map.get("contactNo")));
			dto.setChairman((String) map.get("chairman"));
			dto.setViceChairman((String) map.get("viceChairman"));
			dto.setEMail((String) map.get("eMail"));
			return  dto;
		}).collect(Collectors.toList());

		//validation for testcases

		Assertions.assertEquals("Ganesh",universityDtoList1.get(0).getChairman());

	}
	//---------------------------------------testcase for get by vice chairman---------------------------------------------------------
	@Test
	public  void getByViceChairman()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		UniversityDto universityDto = restTemplate.postForObject(baseUrl+"/saveuniversity",university1,UniversityDto.class);

		ResponseEntity<List> list = restTemplate.exchange(baseUrl+"/getbyvcchairman?sortBy=name&pageNumber="+0+"&pageSize="+20+"&vcName=Somesh", HttpMethod.GET,null, List.class);

		List<Map<String,Object>> universityDtoList = list.getBody();

		List<UniversityDto >universityDtoList1 = universityDtoList.stream().map(map ->
		{
			UniversityDto dto = new UniversityDto();
			dto.setId(Integer.parseInt((String) map.get("id")));
			dto.setName((String)map.get("name"));
			dto.setAddress((String) map.get("address"));
			dto.setContactNo(Long.parseLong((String) map.get("contactNo")));
			dto.setChairman((String) map.get("chairman"));
			dto.setViceChairman((String) map.get("viceChairman"));
			dto.setEMail((String) map.get("eMail"));
			return  dto;
		}).collect(Collectors.toList());

		// validation for testcases

		Assertions.assertEquals("Somesh",universityDtoList1.get(0).getViceChairman());

	}
	//--------------------------------------------------Testcase for get by address-------------------------------------------------------------------------------------------------
	@Test
	public void getByAddress ()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		UniversityDto universityDto = restTemplate.postForObject(baseUrl+"/saveuniversity",university1,UniversityDto.class);

		ResponseEntity<List> list = restTemplate.exchange(baseUrl+"/getbyaddress?sortBy=name&pageNumber="+0+"&pageSize="+20+"&address=Tumkur", HttpMethod.GET,null, List.class);

		List<Map<String,Object>> universityDtoList = list.getBody();

		List<UniversityDto >universityDtoList1 = universityDtoList.stream().map(map ->
		{
			UniversityDto dto = new UniversityDto();
			dto.setId(Integer.parseInt((String) map.get("id")));
			dto.setName((String)map.get("name"));
			dto.setAddress((String) map.get("address"));
			dto.setContactNo(Long.parseLong((String)map.get("contactNo")));
			dto.setChairman((String) map.get("chairman"));
			dto.setViceChairman((String) map.get("viceChairman"));
			dto.setEMail((String) map.get("eMail"));
			return  dto;
		}).collect(Collectors.toList());

		// validation for testcases

		Assertions.assertTrue(!universityDtoList1.isEmpty());



	}
	//-----------------------------------------Testcase for get By Chairman And Vice Chairman------------------------------------------
	@Test
	public void getByChairmanAndViceChairman()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		UniversityDto universityDto = restTemplate.postForObject(baseUrl+"/saveuniversity",university1,UniversityDto.class);

		ResponseEntity<List> list = restTemplate.exchange(baseUrl+"/getbychairmanandvicechairman?sortBy=name&pageNumber="+0+"&pageSize="+20+"&chairman=Ganesh&viceChairman=Somesh", HttpMethod.GET,null, List.class);

		List<Map<String,Object>> universityDtoList = list.getBody();

		List<UniversityDto >universityDtoList1 = universityDtoList.stream().map(map ->
		{
			UniversityDto dto = new UniversityDto();
			dto.setId(Integer.parseInt((String) map.get("id")));
			dto.setName((String)map.get("name"));
			dto.setAddress((String) map.get("address"));
			dto.setContactNo(Long.parseLong((String)map.get("contactNo")));
			dto.setChairman((String) map.get("chairman"));
			dto.setViceChairman((String) map.get("viceChairman"));
			dto.setEMail((String) map.get("eMail"));
			return  dto;
		}).collect(Collectors.toList());

		//  validation for testcases

		Assertions.assertTrue(!universityDtoList1.isEmpty());
		Assertions.assertEquals("SIT",universityDtoList1.get(0).getName());
	}

	//------------------------------------Testcase for get by chairman or vice chairman---------------------------------------------------------------------
	@Test
	public void getByChairmanOrViceChairman()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");
		UniversityDto universityDto = restTemplate.postForObject(baseUrl+"/saveuniversity",university1,UniversityDto.class);

		ResponseEntity<List> list = restTemplate.exchange(baseUrl+"/getbychairmanaorvicechairman?sortBy=name&pageNumber="+0+"&pageSize="+20+"&chairman=Ganesh&viceChairman=prabu", HttpMethod.GET,null, List.class);

		List<Map<String,Object>> universityDtoList = list.getBody();

		List<UniversityDto >universityDtoList1 = universityDtoList.stream().map(map ->
		{
			UniversityDto dto = new UniversityDto();
			dto.setId(Integer.parseInt((String) map.get("id")));
			dto.setName((String)map.get("name"));
			dto.setAddress((String) map.get("address"));
			dto.setContactNo(Long.parseLong((String)map.get("contactNo")));
			dto.setChairman((String) map.get("chairman"));
			dto.setViceChairman((String) map.get("viceChairman"));
			dto.setEMail((String) map.get("eMail"));
			return  dto;
		}).collect(Collectors.toList());

		// validation for testcase

		Assertions.assertTrue(!universityDtoList1.isEmpty());
		Assertions.assertEquals("SIT",universityDtoList1.get(0).getName());
	}

	//------------------------------------Testcase for update contact by name-----------------------------------------------------------
	@Test
	public void updateContactByName()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");

		UniversityDto li =restTemplate.postForObject(baseUrl+"/saveuniversity",UniversityMapper.mapToUniversityDto(university1),UniversityDto.class);
		restTemplate.put(baseUrl+"/udatecontactbyname?name=SIT&contactNo="+90909090909L,null);
		UniversityDto universityDto =restTemplate.getForObject(baseUrl+"/getbyid?id="+li.getId(),UniversityDto.class);

		// validation for testcase

		Assertions.assertEquals(90909090909L,universityDto.getContactNo());
	}
	//-----------------------------------update address and contact by id----------------------------------------------------------
	@Test
	public void updateAddressAndContactById()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");

		UniversityDto li =restTemplate.postForObject(baseUrl+"/saveuniversity",UniversityMapper.mapToUniversityDto(university1),UniversityDto.class);
		restTemplate.put(baseUrl+"/updateaddressandcontactbyid?contactNo="+9096868909L+"&address=Bengaluru&id="+li.getId(),null);
		UniversityDto universityDto =restTemplate.getForObject(baseUrl+"/getbyid?id="+li.getId(),UniversityDto.class);

		// validation for testcase

		Assertions.assertEquals(9096868909L,universityDto.getContactNo());
		Assertions.assertEquals("Bengaluru",universityDto.getAddress());

	}
	//----------------------------------------------get university by id and name----------------------------------------------------------
	@Test
	public void getUniversityByIdAndName()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");

		UniversityDto li =restTemplate.postForObject(baseUrl+"/saveuniversity",UniversityMapper.mapToUniversityDto(university1),UniversityDto.class);
		UniversityDto universityDto =restTemplate.getForObject(baseUrl+"/getuniversitybyidandname?id="+li.getId()+"&name=SIT",UniversityDto.class);

		// validation for testcase

		Assertions.assertTrue(universityDto.getName().contains("SIT"));
		Assertions.assertEquals("Tumkur",universityDto.getAddress());
	}

	//---------------------------------------------------update email by chairman--------------------------------------------------------------------------------------------------
	@Test
	public void updateEmailByChairman()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");

		UniversityDto li =restTemplate.postForObject(baseUrl+"/saveuniversity",UniversityMapper.mapToUniversityDto(university1),UniversityDto.class);
		restTemplate.put(baseUrl+"/updateemailbychairman?email=abc@gmail.com&chairman=Ganesh",null);
		UniversityDto universityDto =restTemplate.getForObject(baseUrl+"/getbyid?id="+li.getId(),UniversityDto.class);

		// validation for testcase

		Assertions.assertEquals("abc@gmail.com",universityDto.getEMail());
		Assertions.assertTrue(universityDto.getEMail().contains("abc@gmail.com"));

	}

	//---------------------------------delete by name-------------------------------------------------------------------------------------
	@Test
	public void deleteByName()
	{
		University university1 = new University("Tumkur","SIT","Ganesh","Somesh",9900860377L,"sit@gmail");

		UniversityDto li =restTemplate.postForObject(baseUrl+"/saveuniversity",UniversityMapper.mapToUniversityDto(university1),UniversityDto.class);
		restTemplate.delete(baseUrl+"/deletebyname?name="+li.getName());
		int count = repository.findAll().size();
		// validation for testcases

		Assertions.assertTrue(count==0);
	}






}
