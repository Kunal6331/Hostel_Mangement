package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PgMangement;

public interface Pgrepo extends JpaRepository<PgMangement, Integer> {

}
