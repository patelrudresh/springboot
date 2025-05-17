package com.Restapi.RestApi.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rest")
public class RestCon {
	
	
	Map<Integer ,RestEntry> Demo=new HashMap<>();
	
	@GetMapping
      public List<RestEntry>getAll() {
		return new ArrayList<>(Demo.values());
		
	}
	
	@PostMapping
	public String   createEntry(@RequestBody RestEntry MyEntry) {
		Demo.put( MyEntry.getId(), MyEntry);
		return "added";
		
	}
	
	@GetMapping("id/{mid}")
	public  RestEntry checkbyid(@PathVariable Integer mid) {
		return Demo.get(mid);
		
	}
	
	@DeleteMapping("id/{mid}")
	public RestEntry Deletebyid(@PathVariable Integer mid ) {
		return Demo.remove(mid);
	}
	
	@PutMapping("id/{myid}")
	public RestEntry UpdATEBID(@PathVariable Integer id, @RequestBody RestEntry myid) {
		return Demo.put(myid.getId(), myid);
	}
}
