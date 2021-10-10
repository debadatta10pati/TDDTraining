package com.tdd.displayname;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.tdd.ssn.service.ValidateSSNService;

@DisplayName("SSN Validation Test")
class DisplayNameTest {

	@Test
	@DisplayName("SSN length check")
	void checkSSNLength() {

		ValidateSSNService validateSSNService = new ValidateSSNService();

		boolean result = validateSSNService.checkSSN("289-91-3470");

		assertTrue(result, "ssn length");

	}

}
