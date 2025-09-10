package com.example.demo.controlled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PgMangement;
import com.example.demo.service.pgservice;

@RestController
public class pgcontrollerd {

	
	@Autowired
	pgservice ps;
	
	@PostMapping("pg")
	String addpg(@RequestBody PgMangement p)
	{
		
	ps.savepg(p);
		return"pg details added";
	}
	
	
	@GetMapping("pg/{roomNo}")
	PgMangement getpg(@PathVariable int roomNo) {
		
		
		return ps.getpg(roomNo);
	}
	
	
	@DeleteMapping("pg/{roomNo}")
	String deletepg(@PathVariable int roomNo) {
		
		ps.deletepg(roomNo);
		
		return "pg details deleted";
	

		
		
	}
	
	@DeleteMapping("pginfo")
	String deleteall(@PathVariable int roomNo) {
		
		ps.deleteall();
		return "Pg data clear";
	}
	
	
	
	
	
}
