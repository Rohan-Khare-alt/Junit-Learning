package io.junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
class CalcUtilTest {
	Calculator cal;
	
	@BeforeAll
	static void Parentinit()
	{
		System.out.println("Needs to be run in begining");
	}
	@BeforeEach
	void init()
	{
	cal =  new Calculator();
	}
	@AfterEach
	void cleanup()
	{
		System.out.println("Cleaning up......");
	}
	@Test
	@Order(1)
	@DisplayName("Adding two numbers")
	void testadd() {
		int expected = 6;
		int actual = cal.add(3, 3);
		assertEquals(expected, actual, "This Method should add two Integers");
	}

	@Test
	@Order(2)
	@DisplayName("Subtracting number")
	void testsub() {
		
		int expected = 0;
		int actual = cal.sub(3, 3);
		assertEquals(expected, actual, "This Method should subtarct two Integers");
	}
	
@Test
@Order(3)
@DisplayName("Division program")
@Disabled
	void dividebyzero()
	{
	cal.dividebyzero(4, 2);
	assertThrows(Exception.class, () -> cal.dividebyzero(1,0),"Divide by zero");
	}
@AfterAll
void end()
{
	System.out.println("Closing Calculator Bye!!!!!!!!!");
}
}
