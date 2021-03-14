package io.junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestReporter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class CalcUtilTest {
	Calculator cal;
	 TestInfo testinfo;
	 TestReporter testReporter;

	@BeforeAll
	static void Parentinit() {
		System.out.println("Needs to be run in begining");
	}

	@BeforeEach
	void init(TestInfo testinfo,TestReporter testReporter) {
		this.testinfo= testinfo;
		this.testReporter= testReporter;
		cal = new Calculator();
		testReporter.publishEntry("Running"+testinfo.getDisplayName()+"with tags"+testinfo.getTags());
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up......");
	}

	@Nested
	class AddTest {
		@Test
		@Tag("Math")
		@Order(1)
		@DisplayName("Adding two numbers")
		void testAddingTwoPositives() {
			assertEquals(2, cal.add(1, 1), "Add method should return the sum of two numbers");
		}

		@Test
		@Tag("Math")
		@DisplayName("Adding Two Negative Number")
		void testAddingTwoNegatives() {
			int expected = -2;
			int actual=cal.add(-1, -1);
			assertEquals(expected,actual,()->"should return "+expected+" but returned"+actual);
		}

		@Test
		@Tag("Math")
		void testAddingAPositiveAndANegative() {
			assertEquals(0, cal.add(-1, 1), "Add method should return the sum of two numbers");
		}
	}

	@Test
	@Tag("Math")
	@DisplayName("Product of two numbers")
	void multiply() {
		System.out.println("Running"+testinfo.getDisplayName()+"with tags"+testinfo.getTags());
		assertAll(() -> assertEquals(4, cal.multiply(2, 2)), () -> assertEquals(0, cal.multiply(2, 0)),
				() -> assertEquals(-2, cal.multiply(2, -1)));
	}

	@Test
	@Tag("Math")
	@Order(2)
	@DisplayName("Subtracting number")
	void testsub() {

		int expected = 0;
		int actual = cal.sub(3, 3);
		assertEquals(expected, actual, "This Method should subtarct two Integers");
	}

	@Test
	@Tag("Math")
	@Order(3)
	@DisplayName("Division program")
	
	void dividebyzero() {
		cal.dividebyzero(4, 2);
		assertThrows(Exception.class, () -> cal.dividebyzero(1, 0), "Divide by zero");
	}
	@Test
	@Tag("circles")
	void area() {
		assertEquals(314.1592653589793, cal.area(10),"This Method Calculates area of circle");
	}
	@AfterAll
	void end() {
		System.out.println("Closing Calculator Bye!!!!!!!!!");
		
	}
}
