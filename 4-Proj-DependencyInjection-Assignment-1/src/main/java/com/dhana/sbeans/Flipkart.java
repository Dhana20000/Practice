package com.dhana.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("flipkart")
public class Flipkart {
	
	@Autowired
	@Qualifier("coriorService")
	public CoriorService service;
	
	public void Cservice() {
		System.out.println("Flipkart order placed");
		System.out.println(service.orderPickedBy());
		System.out.println(service.orderDelveredBY());
	}

}
