package day8;

import java.util.Scanner;

public class LogicalOperators1 {
public static void main(String[] args) {
	
	//modeling camp
	//age 21 less
	//height 6.1 more
	
	int age;
	double height;
	int nepotism;
    int gender;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Gender [0=male, 1=female]");						//45
	gender=sc.nextInt();		
	
	System.out.println("Enter Your Height in Feet");			//4.3
	height=sc.nextDouble();	
	
	System.out.println("Is your parent in the Modelling Industry [1-yes, 0-No]");			//1
	nepotism=sc.nextInt();	
	//	      False            ||     True
	//   False &&  False              True
	//is 45<21   4.3>6.1              1==1
	if( (gender==1 && height>6.1) || (gender==1 && height>5.5) || (nepotism==1) )
	{
		System.out.println("U are eligible for Modeling");
	}
	else
	{
		System.out.println("Not Eligible for Modeling");
	}
}
}