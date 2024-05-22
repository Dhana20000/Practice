package com.dhana.sbeans;

import org.springframework.stereotype.Component;

@Component("DHL")
public class DHL implements CoriorService{
	
	@Override
	public String orderPickedBy() {
		// TODO Auto-generated method stub
		return "Order is shipped by DHL";
	}

	@Override
	public String orderDelveredBY() {
		// TODO Auto-generated method stub
		return "Order delevered by DHL";
	}

}
