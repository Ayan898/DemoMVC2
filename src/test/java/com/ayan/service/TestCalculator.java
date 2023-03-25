package com.ayan.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	
	CalculateModal calc = new CalculateModal();
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(2, 3));
	}
	@Test 
	public void testSub() {
		assertEquals(3, calc.sub(10, 7));
	}
	@Test 
	public void testMult() {
		assertEquals(48, calc.mult(8, 6));
	}
	@Test 
	public void testDiv() {
		assertEquals(5, calc.div(15, 3));
	}
	@Test
	public void testDivZero() {
		assertEquals(0, calc.div(1, 0));
	}
	@Test 
	public void testMod() {
		assertEquals(4, calc.mod(19, 5));
	}
	@Test 
	public void testModZero() {
		assertEquals(0, calc.mod(1, 0));
	}

}
