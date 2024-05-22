package com.dhana.sbeans;

import org.springframework.stereotype.Component;

@Component("EcomerceExpress")
public class EcomerceExpress implements CoriorService {

	@Override
	public String orderPickedBy() {
		// TODO Auto-generated method stub
		return "Order is shipped by EcomerceExpress";
	}

	@Override
	public String orderDelveredBY() {
		// TODO Auto-generated method stub
		return "Order delevered by EcomerceExpress";
	}
}
