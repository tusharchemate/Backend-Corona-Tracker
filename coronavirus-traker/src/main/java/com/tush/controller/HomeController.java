package com.tush.controller;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tush.model.LocationStats;
import com.tush.service.CoronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	CoronaVirusDataService cvs;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = cvs.getAllStates();
		int cases = allStats.stream().mapToInt(stat-> stat.getTotalcases()).sum();
		
		model.addAttribute("locationStats",allStats);
		model.addAttribute("cases",cases);
		
		return "home";
		
	}
	
}
