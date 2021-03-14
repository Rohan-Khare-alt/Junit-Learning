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
	public int multiply(int a,int b)
	{
		int mul=(a*b);
		System.out.println("The Product of 2 numbers"+mul);
		return mul;
	}
	public double area(double r)
	{
		double Ar=(Math.PI*r*r);
		System.out.println(("area of circle ="+Ar));
		return(Ar);
				
	}
	
}
