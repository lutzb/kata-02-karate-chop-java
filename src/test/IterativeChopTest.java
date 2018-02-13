package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import chopper.IKarateChop;
import chopper.IterativeChop;

class IterativeChopTest {

	IKarateChop chopper = new IterativeChop();
	
	@Test
	void testPosition0() {
		assertEquals(0, chopper.chop(1, new int[] {1}));
		assertEquals(0, chopper.chop(1, new int[] {1, 3, 5}));
		assertEquals(0, chopper.chop(1, new int[] {1, 3, 5, 7}));		
	}
	
	@Test
	void testPosition1() {
		assertEquals(1, chopper.chop(3, new int[] {1, 3, 5}));
		assertEquals(1, chopper.chop(3, new int[] {1, 3, 5, 7}));
	}
	
	@Test
	void testPosition2() {
		assertEquals(2, chopper.chop(5, new int[] {1, 3, 5}));
		assertEquals(2, chopper.chop(5, new int[] {1, 3, 5, 7}));
	}
	
	@Test
	void testPosition3() {
		assertEquals(3, chopper.chop(7, new int[] {1, 3, 5, 7}));
	}
	
	@Test
	void testTargetNotFound() {
		assertEquals(-1, chopper.chop(3, new int[] {}));
		assertEquals(-1, chopper.chop(3, new int[] {1}));
		assertEquals(-1, chopper.chop(0, new int[] {1, 3, 5}));
		assertEquals(-1, chopper.chop(2, new int[] {1, 3, 5}));
		assertEquals(-1, chopper.chop(4, new int[] {1, 3, 5}));
		assertEquals(-1, chopper.chop(6, new int[] {1, 3, 5}));
		assertEquals(-1, chopper.chop(0, new int[] {1, 3, 5, 7}));
		assertEquals(-1, chopper.chop(2, new int[] {1, 3, 5, 7}));
		assertEquals(-1, chopper.chop(4, new int[] {1, 3, 5, 7}));
		assertEquals(-1, chopper.chop(6, new int[] {1, 3, 5, 7}));
		assertEquals(-1, chopper.chop(8, new int[] {1, 3, 5, 7}));
	}

}
