package com.ms.example.configclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.example.configclientdemo.bean.Configuration;

@RestController  
public class LimitsConfigurationController {
	@Autowired    
	private Configuration configuration; 
	/*@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(1000, 1);  
	}  */
	
	
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	//getting values from the properties file  
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}  

	
}
