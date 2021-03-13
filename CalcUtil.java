package io.junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcUtil {

	@Test
	void testadd() {
		Calculator cal = new Calculator();
		int expected = 6;
		int actual = cal.add(3, 3);
		assertEquals(expected, actual, "This Method should add two Integers");
	}

	@Test
	void testsub() {
		Calculator cal = new Calculator();
		int expected = 0;
		int actual = cal.sub(3, 3);
		assertEquals(expected, actual, "This Method should subtarct two Integers");
	}
}
