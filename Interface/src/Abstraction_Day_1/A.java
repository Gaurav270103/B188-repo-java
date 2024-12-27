package Abstraction_Day_1;

import java.util.Scanner;

public class A implements I{
	Scanner sc=new Scanner(System.in);

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method m1-A");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	
		System.out.println(I.x);
		System.out.println("method m2-A");
	}

	@Override
	public void Addition(int a, int b) {
		// TODO Auto-generated method stub
//		a=100;
//		b=200;
		int c=a+b;
		
		System.out.println("Addition of a and b---"+c);
		
	}

	@Override
	public void Substraction(int a, int b) {
		// TODO Auto-generated method stub
		a=100;
		b=50;
		int c=a-b;
		System.out.println("Substraction of a and b --"+c);
		
	}

	@Override
	public void Multiplication(int a, int b) {
		// TODO Auto-generated method stub
		a=100;
		b=50;
		int c=a*b;
		System.out.println("Multiplication of a and b --"+c);
		
		
	}

	@Override
	public void Division() {
		// TODO Auto-generated method stub
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println("Division of a and b --"+c);
		
		
	}
	

}
