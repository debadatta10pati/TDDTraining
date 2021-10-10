package com.tdd.timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;


@Timeout(8)
class TimeoutClassLevelTest {
	
	@BeforeEach
    void setUp() throws Exception {
		
	// waits 10 seconds	
    TimeUnit.SECONDS.sleep(10); 
    
    System.out.println("@BeforeEach");
   
    }

	@Test
	void testAddition() throws InterruptedException {
		TimeUnit.SECONDS.sleep(10);

		assertEquals(10, Math.addExact(4, 6));

	}

}
