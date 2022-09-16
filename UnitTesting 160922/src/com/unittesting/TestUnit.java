package com.unittesting;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.unittest.operation.Operation;

class TestUnit {

	@Test
	public void testMain() {
		System.out.println("Working");
	}
	
	@Test
	@DisplayName("StringNull")
	public void testString() {
		Operation obj1 = new Operation();
		assertNull(obj1.myName("Hitesh"));

	}

	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforeAll");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("AfterAll");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Before each");
	}
	
	 @Test
	    public void testAddition() {
	        Operation obj = new Operation();
	        assertEquals(30, obj.addition(10, 20));
	    }
	 @Test
	 public void testCheckEqual() {
	        assertNotEquals(30, 10);
	    }
	
	

}
