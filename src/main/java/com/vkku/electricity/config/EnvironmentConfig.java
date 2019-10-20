package com.vkku.electricity.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "airtable")
public class EnvironmentConfig {
	
	public String AIRTABLE_API_KEY;

	public String getAIRTABLE_API_KEY() {
		return AIRTABLE_API_KEY;
	}

	public void setAIRTABLE_API_KEY(String aIRTABLE_API_KEY) {
		AIRTABLE_API_KEY = aIRTABLE_API_KEY;
	}
	
	
	
}
