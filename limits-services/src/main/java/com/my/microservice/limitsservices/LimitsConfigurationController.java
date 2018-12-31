package com.my.microservice.limitsservices;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	private static final Logger logger = LoggerFactory.getLogger(LimitsConfigurationController.class);
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		logger.info("Name {}", configuration.getName());
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
