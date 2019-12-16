package com.fyle.assignment.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fyle.assignment.model.Banks;

public interface BankRepository extends CrudRepository<Banks, Integer> {
	 public Banks findById(int id);
	 List <Banks> findAll();


}
