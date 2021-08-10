package com.grocerymanagement.iteamcatelog.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grocerymanagement.iteamcatelog.Order.Order;
import com.grocerymanagement.iteamcatelog.Order.User;

@RestController
public class OrderController {
	
	@PostMapping(value ="/getLastOrder", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Map<String, Object> getOrderDetail(@RequestBody User user ) {
		Order order = new Order(1L,"Onion",2L,10L);
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("UserInfo", user.toString());
		map.put("OrderData",order.toString());
		return map;
	} 

}
