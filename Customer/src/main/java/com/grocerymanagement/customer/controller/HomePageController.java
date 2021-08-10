package com.grocerymanagement.customer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.grocerymanagement.customer.services.HomePageControllerService;

@RestController
public class HomePageController {

	@Autowired
	HomePageControllerService homePageControllerService;
	
	@GetMapping("/homepage")
	public Map<String, Object> getHomePageInformation( Long id){
		 Map<String, Object> map= new HashMap<>();
		 map.put("Ganesh", "Hello");
		 map.put("Id", ""+id);
		 homePageControllerService.getUserHomePageInformation(id);
		return homePageControllerService.getUserHomePageInformation(id);
	}
	
}
