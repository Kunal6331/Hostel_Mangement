package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PgMangement;
import com.example.demo.repository.Pgrepo;

@Service
public class pgservice {

	@Autowired
	Pgrepo pr;

	public void savepg(PgMangement p) {
		pr.save(p);

	}

	public void deletepg(int roomNo) {

		pr.deleteById(roomNo);

	}

	public PgMangement getpg(int roomNo) {

		return pr.findById(roomNo).get();

	}

	public void deleteall()

	{
		pr.deleteAll();

	}

}
