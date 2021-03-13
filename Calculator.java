package io.junit5test;

public class Calculator {

	public int add(int a, int b)
	{
		int sum= a+b;
		System.out.println("Added value = "+sum);
		return(sum);
	}

	public int sub(int a, int b)
	{
		int sub= a-b;
		System.out.println("sub value = "+sub);
		return(sub);
	}

	
}
