package com.ashutosh.random.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashutosh.random.entities.Random_Table;
import com.ashutosh.random.repos.Random_Table_Repository;

@Service
public class Random_Table_Service {
	
	@Autowired
	private Random_Table_Repository rts;
	
	public List<Random_Table> toCheckRandom(String data){
		
		List<Random_Table> checkList = rts.toCheck(data);
		return checkList;
	}
	
}
