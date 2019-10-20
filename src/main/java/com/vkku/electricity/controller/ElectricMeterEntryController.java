package com.vkku.electricity.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/electric")
public class ElectricMeterEntryController {
	
	@GetMapping({"/kwhUnits/{kwh}", "/kwhUnits/{kwh}/{remark}"})
	public void insertMeterReading(@PathVariable(value = "kwh") Double kwh, @PathVariable Optional<String> remark) {
		
		if(remark.isPresent()) {
			
		}
		
	}
	
}
