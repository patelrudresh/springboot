package com.Restapi.RestApi.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/En")
public class RestconEn {
	
	Map<Integer,RestEn> En=new HashMap<>();
	
	@GetMapping
	public List <RestEn>getAll(){
	return new ArrayList<>(En.values());
	}
	
	@PostMapping
	public boolean create(@RequestBody RestEn Myid) {
		
		En.put(Myid.getId(),Myid);
		return true;
	}
	@GetMapping("id/{myid}")
	public RestEn  findby(@PathVariable Integer myid) {
		return En.get(myid);
	}
}
