//each class has a quota of 20 chocolates, once the quota is reached stop the collection
//if any extra chocolates are collected return them back to the CT
package day8;

import java.util.Scanner;

public class SchoolChocolate3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int sum=0;
	int quota=20;
	for(int rno=1;rno<=5;rno++)														
    	{																				
		System.out.println("Rno  " + rno + " how many chocolates you have bought?");
		int chocolate=sc.nextInt();													
		sum=sum+chocolate;	
		if(sum>=20)
			break;																	
	}																				
	System.out.println("Total Extra chocolates "+ (sum-quota));						
}													
}													