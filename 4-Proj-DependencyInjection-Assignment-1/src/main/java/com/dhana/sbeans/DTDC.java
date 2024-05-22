package com.dhana.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements CoriorService {

	@Override
	public String orderPickedBy() {
		// TODO Auto-generated method stub
		return "Order is shipped by DTDC";
	}

	@Override
	public String orderDelveredBY() {
		// TODO Auto-generated method stub
		return "Order delevered by DTDC";
	}

}
