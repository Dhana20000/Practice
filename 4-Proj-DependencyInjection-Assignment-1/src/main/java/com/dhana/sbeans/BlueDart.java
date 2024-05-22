package com.dhana.sbeans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements CoriorService {

	@Override
	public String orderPickedBy() {
		// TODO Auto-generated method stub
		return "Order is shipped by BlueDart";
	}

	@Override
	public String orderDelveredBY() {
		// TODO Auto-generated method stub
		return "Order delevered by BlueDart";
	}

}
