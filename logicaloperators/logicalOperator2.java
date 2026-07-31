package day8;

import java.util.Scanner;

public class logicalOperator2 {
public static void main(String[] args) {

	
	int age;
	double height;
	int nepotism;
    int gender;
    int graduation;
    int salary;

	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Gender [0=male, 1=female]");						//45
	gender=sc.nextInt();		
	
    System.out.println("Enter Your age ");						//45
	age=sc.nextInt();
	
    System.out.println("Enter Your Graduation (graduated==0 or pgraduated==1 or higher==2)");			//4.3
	graduation=sc.nextInt();	
	
	System.out.println("What is your salary?");			//1
	salary=sc.nextInt();	
	
	if(gender==0 && age<30 && (graduation==0 || graduation==1 || graduation == 2) && salary>50000|| (gender==1 && age<30 && (graduation==1 ||  graduation == 2)&& salary>30000))
	{
		System.out.println("U are eligible for Loan");
	}
	else
	{
		System.out.println("Not Eligible for loan");
	}
}
}