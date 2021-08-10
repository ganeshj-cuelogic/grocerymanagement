package com.grocerymanagement.customer.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerymanagement.customer.entities.Order;
import com.grocerymanagement.customer.entities.User;
import com.grocerymanagement.customer.repository.UserInformationRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class HomePageControllerService {

	@Autowired
	LastOrderIteamCartService lastOrderIteamCartService;
	
	@Autowired
	UserInformationRepository userInformationRepository;
	
	@HystrixCommand(fallbackMethod = "fallback", commandKey = "error", groupKey = "error")
	public Map<String , Object> getUserHomePageInformation(Long userId){
		Map<String , Object> homePageInfo = new HashMap<String, Object>();
		Optional<User> user = userInformationRepository.findById(userId);
		User user2 = new User(1L);
		Map<String, Object> map=lastOrderIteamCartService.getLastOrderDetail(user2);
		return map;
	}
	
	public Map<String,Object> fallback(Long userId){
		Map<String , Object> homePageInfo = new HashMap<String, Object>();
		homePageInfo.put("Status", "Item Card Application is down");
		return homePageInfo;
	}
}
