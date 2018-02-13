package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import chopper.IKarateChop;
import chopper.IterativeChop;

class ChopTest {

	IKarateChop chopper = new IterativeChop();
	
	@Test
	void testEmptyArray() {
		List<Integer> testList = new ArrayList<Integer>();
		assertEquals(-1, chopper.chop(3, testList));
	}
	
	@Test
	void testArrayWithOneElement() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(1);
		
		assertEquals(0, chopper.chop(1, testList));
		assertEquals(-1, chopper.chop(3, testList));
	}
	
	@Test
	void testArrayWithTwoElements() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(1);
		testList.add(3);
		
		assertEquals(0, chopper.chop(1, testList));
		assertEquals(1, chopper.chop(3, testList));
	}
	
	@Test
	void testArrayWithThreeElements() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(1);
		testList.add(3);
		testList.add(5);
		
		assertEquals(0, chopper.chop(1, testList));
		assertEquals(1, chopper.chop(3, testList));
		assertEquals(2, chopper.chop(5, testList));
		
		assertEquals(-1, chopper.chop(0, testList));
		assertEquals(-1, chopper.chop(2, testList));
		assertEquals(-1, chopper.chop(4, testList));
		assertEquals(-1, chopper.chop(6, testList));
	}
	@Test
	void testArrayWithFourElements() {
		List<Integer> testList = new ArrayList<Integer>();
		testList.add(1);
		testList.add(3);
		testList.add(5);
		testList.add(7);
		
		assertEquals(0, chopper.chop(1, testList));
		assertEquals(1, chopper.chop(3, testList));
		assertEquals(2, chopper.chop(5, testList));
		assertEquals(3, chopper.chop(7, testList));
		
		assertEquals(-1, chopper.chop(0, testList));
		assertEquals(-1, chopper.chop(2, testList));
		assertEquals(-1, chopper.chop(4, testList));
		assertEquals(-1, chopper.chop(6, testList));
		assertEquals(-1, chopper.chop(8, testList));
	}

}
