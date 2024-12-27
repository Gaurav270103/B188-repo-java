package Abstraction_Interface_Day2;

import java.util.Scanner;

public class Calculator implements ArithmeticOperation{
	Scanner sc=new Scanner(System.in);

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("<---ADDITION-->");
		System.out.println("Enter Value of a");
		int a=sc.nextInt();
		System.out.println("Enter Value of b");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition is-->"+c);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("<--SUBSTRACTION-->");
		System.out.println("Enter Value of a");
		a=sc.nextInt();
		System.out.println("Enter value of b");
		b=sc.nextInt();
		int c=a-b;
		System.out.println("Substraction is-->"+c);
		
	}

	@Override
	public void mul(int c) {
		// TODO Auto-generated method stub
		System.out.println("<--MULTIPLICATION-->");
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		System.out.println("Enter Value of b");
		int b=sc.nextInt();
		c=a*b;
		System.out.println("Multiplication is-->"+c);
		
		
	}

	@Override
	public int div(int c) {
		
		System.out.println("<--DIVISION-->");
		System.out.println("Enter Value of a");
		int a=sc.nextInt();
		System.out.println("Enter Value of b");
		int b=sc.nextInt();
		c=a/b;
		System.out.println("Division is-->"+c);
		return 0;
		// TODO Auto-generated method stub
		
	}

	

}
