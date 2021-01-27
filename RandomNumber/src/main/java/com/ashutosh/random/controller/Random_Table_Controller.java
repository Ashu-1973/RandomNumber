package com.ashutosh.random.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ashutosh.random.entities.Random_Table;
import com.ashutosh.random.repos.Random_Table_Repository;
import com.ashutosh.random.service.Random_Table_Service;



@Controller
public class Random_Table_Controller {
	
	@Autowired
	private Random_Table_Service rts;
	
	@Autowired
	private Random_Table_Repository rtp;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		long number=(long)(Math.random()*(Math.pow(10, 13)));
		String myRandom=""+number;
		List<Random_Table> list=rts.toCheckRandom(myRandom);
		while(list.size()!=0) {
			list.clear();
			number=(long)(Math.random()*(Math.pow(10, 13)));
			myRandom=""+number;
			list=rts.toCheckRandom(myRandom);
		}
		Random_Table RT = new Random_Table(myRandom);
		rtp.save(RT);
		
		model.addAttribute("myRandom", RT);
		
		return "find";
	}
	
	@GetMapping("/find")
	public String myFindMethod(Model model) {
		long number=(long)(Math.random()*(Math.pow(10, 13)));
		String myRandom=""+number;
		List<Random_Table> list=rts.toCheckRandom(myRandom);
		while(list.size()!=0) {
			list.clear();
			number=(long)(Math.random()*(Math.pow(10, 13)));
			myRandom=""+number;
			list=rts.toCheckRandom(myRandom);
		}
		Random_Table RT = new Random_Table(myRandom);
		rtp.save(RT);
		
		model.addAttribute("myRandom", RT);
		
		return "find";
	}
	
	
	
	
}
