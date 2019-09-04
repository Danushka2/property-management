package com.Boardimak.main.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Boardimak.main.model.testImages;

@Configuration
public class AppConfigurations {

	@Bean
	public testImages getAmodelBean() {
		return new testImages();
	}
	
}
