package io.junit5test;
public class AddTwoIntegers {

   public int add(int first,int second) {
        

        System.out.println("Enter two numbers: " + first + " " + second);
        int sum = first + second;

        System.out.println("The sum is: " + sum);
		return sum;
    }
}