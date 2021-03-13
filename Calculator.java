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

	public double dividebyzero(int a, int b) {
		// TODO Auto-generated method stub
		double divide=(a/b);
		System.out.println("Divided value= "+divide);
		return divide;
		
	}

	
}
