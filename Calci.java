package calculator;

import java.util.Scanner;

public class Calci {

	public static int add(int a, int b)
	{
		return (a+b) ;
	}
	
	public static int sub(int a, int b)
	{
		return a-b;
	}
	public static int multiply(int a, int b)
	{
		return a*b; 
	}
	public static int div(int a, int b)
	{
		if(b==0)
		{
			System.out.println("Invalid operation!");
			return -1;
		}
		return a/b ;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter two numbers");
		Scanner scn = new Scanner(System.in); 
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(multiply(a,b));
		System.out.println(div(a,b));
	}
}
