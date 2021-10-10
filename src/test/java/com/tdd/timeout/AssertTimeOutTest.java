package com.tdd.timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class AssertTimeOutTest {

	@Test
	void testAssertTimeout() {
		
		assertTimeout(Duration.ofSeconds(8),()->{
			TimeUnit.SECONDS.sleep(10);
			assertEquals(15,Math.multiplyExact(3, 5));
			
			System.out.println(" Numbers multiplied.");
			
		});
		
	}
	
	@Test
	void testAssertTimeoutPreemptively() {
		
		assertTimeoutPreemptively(Duration.ofSeconds(6),()->{
			TimeUnit.SECONDS.sleep(10);
			assertEquals(15,Math.addExact(10, 5));
			
			System.out.println(" Numbers added.");
			
		});
		
	}

}
