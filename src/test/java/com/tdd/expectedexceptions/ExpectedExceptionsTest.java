package com.tdd.expectedexceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.tdd.ssn.service.ValidateSSNService;

class ExpectedExceptionsTest {

	@Test
	void testForExpectedExceptionNumberFormat() {
		
		assertThrows(NumberFormatException.class,()->{
			
			ValidateSSNService validateSSNService = new ValidateSSNService();
			
			validateSSNService.checkSSN("9091234567");
			
		});
		
	}
	
	@Test
	void testForExpectedExceptionParent() {
		
		assertThrows(IllegalArgumentException.class,()->{
			
			ValidateSSNService validateSSNService = new ValidateSSNService();
			
			validateSSNService.checkSSN("9091234567");
			
		});
		
	}
	
	
	

}
