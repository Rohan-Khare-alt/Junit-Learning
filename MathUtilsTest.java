package io.junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void add() {
	AddTwoIntegers math =new AddTwoIntegers();
	int expected=6;
	int actual =math.add(3, 3);
	assertEquals(expected, actual);
	}

}
