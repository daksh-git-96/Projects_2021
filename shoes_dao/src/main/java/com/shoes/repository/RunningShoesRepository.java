package com.shoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoes.entity.RunningShoes;

public interface RunningShoesRepository extends JpaRepository<RunningShoes, Integer>{

}
