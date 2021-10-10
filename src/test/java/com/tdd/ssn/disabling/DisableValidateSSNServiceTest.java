package com.tdd.ssn.disabling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.tdd.ssn.service.ValidateSSNService;


class DisableValidateSSNServiceTest {

	@Disabled("Disabled until we finalize on the validation on 0s")
	@Test
	void checkValidSSN() {

		ValidateSSNService validateSSNService = new ValidateSSNService();

		boolean result = validateSSNService.checkSSN("200-91-0000");

		assertTrue(result, "first ssn");
	}
	
	
	@Test
	void checkSSNLength() {

		ValidateSSNService validateSSNService = new ValidateSSNService();

		boolean result = validateSSNService.checkSSN("289-91-3470");

		assertTrue(result, "ssn length");

	}

}
