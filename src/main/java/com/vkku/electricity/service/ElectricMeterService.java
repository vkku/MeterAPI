package com.vkku.electricity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sybit.airtable.Airtable;
import com.sybit.airtable.Base;
import com.sybit.airtable.exception.AirtableException;
import com.vkku.electricity.config.EnvironmentConfig;

@Service
public class ElectricMeterService {
	
	@Autowired
	EnvironmentConfig config;
	
	ElectricMeterService() throws AirtableException{
		//No-Args ctor
	}
	
	
	private Airtable airtable;
	
	Base base = airtable.base(config.getAIRTABLE_API_KEY());
	
	public void insertKWHUnits(Double unitsInKWH) {
		
		
		
	}

}
