package Abstraction_Interface_Day2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("github repo added successfully...");
		ArithmeticOperation ao=new Calculator();
		boolean flag=true;
		//<--by using if-else statement-->
		while(flag) {
			System.out.println("<--CALCULATOR-->");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.EXIT");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			System.out.println("new changes");
	
		if (ch==1) {
			ao.add();
			
		}
		else if (ch==2) {
			ao.sub(0,0);
		}
		else if(ch==3)
		{
			ao.mul(0);
		}
		else if(ch==4)
		{
			ao.div(0);
		}
		else if(ch==5)
		{
			System.out.println("successfully exit");
			flag=false;
		}
		else {
			System.out.println("Invalid choice");
		}
		}
		//<--by using switch statement-->
//		while(flag) {
//			System.out.println("<--CALCULATOR-->");
//			System.out.println("1.Addition");
//			System.out.println("2.Substraction");
//			System.out.println("3.Multiplication");
//			System.out.println("4.Division");
//			System.out.println("5.EXIT");
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter Your Choice");
//			int ch=sc.nextInt();
//		switch (ch) {
//		case 1:
//			ao.add();
//			break;
//		case 2:
//			ao.sub(0, 0);
//			break;
//		case 3:
//			ao.mul(0);
//			break;
//		case 4:
//			ao.div(0);
//			break;
//		case 5:
//			System.out.println("thank you");
//			flag=false;
//            break;
//		
//		default:
//			System.out.println("Invalid input");
//			break;
//		}
////		
		}
	}

