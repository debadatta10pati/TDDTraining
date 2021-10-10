package com.tdd.executionorder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.tdd.ssn.service.ValidateSSNService;

@TestMethodOrder(MethodOrderer.Random.class)
class RandomAnnotationExecutionOrderTest {
	
	@Test
	void ssnStringShouldHave11Characters() {

		ValidateSSNService validateSSNService = new ValidateSSNService();

		boolean result = validateSSNService.checkSSN("289-91-3470");

		assertTrue(result, "ssn length");

	}

	@Test
	void ssnShouldNotEndWith4Zeros() {

		ValidateSSNService validateSSNService = new ValidateSSNService();

		boolean result = validateSSNService.checkSSN("200-91-0000");

		assertTrue(result, "first ssn");
	}
	
	
	
}
