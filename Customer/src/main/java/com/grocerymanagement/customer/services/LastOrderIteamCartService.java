package com.grocerymanagement.customer.services;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerymanagement.customer.entities.Order;
import com.grocerymanagement.customer.entities.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

import feign.Headers;

@Headers("Content-Type:application/json")
@FeignClient(name="${feign.name}", url="${feign.url}")
public interface LastOrderIteamCartService {

	//@RequestMapping(value="/getLastOrder", method= {RequestMethod.POST}, consumes = {"application/json"}, produces = {"application/json"})
	
	
	@PostMapping("/getLastOrder")
	public Map<String, Object> getLastOrderDetail(@RequestBody User user);
}
