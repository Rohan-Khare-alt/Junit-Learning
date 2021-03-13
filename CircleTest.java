package io.junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testarea() {
		CircleArea arecal= new CircleArea();
		assertEquals(314.1592653589793, arecal.area(10),"This Method Calculates area of circle");
	}

}
