package com.example.suite;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.example.FirstDayAtSchool;

public class PrepareMyBagTest {

	FirstDayAtSchool school = new FirstDayAtSchool();
	String[] bag = { "Books", "Notebooks", "Pens" };
	
	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag, school.prepareMyBag());
	}
}