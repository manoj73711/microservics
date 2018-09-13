package com.syntel.microservics.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syntel.microservics.limitsservice.bean.Configuration;
import com.syntel.microservics.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration conf;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {

		return new LimitConfiguration(conf.getMaximum(), conf.getMinimum());
	}

}
