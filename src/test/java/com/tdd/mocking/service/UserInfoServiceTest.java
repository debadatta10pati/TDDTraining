package com.tdd.mocking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.tdd.mocking.dao.DatabaseDAO;

import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserInfoServiceTest {
	
	@Mock
    DatabaseDAO databaseMock;
	
	@InjectMocks
    UserInfoService userInfoService;
	

	@Test
	void testDataBaseConnByMocking() {
		
		//Calling the mocked instance
		boolean available = userInfoService.get("deba@gmail.com");
		
		//asserting the result
		assertEquals(true,available);
		
		//Verifying that methods in the mocked objects have been invoked.
		verify(databaseMock,times(1)).get("deba@gmail.com");
		

	}

}
