package day18;

import java.util.Arrays;
import java.util.Scanner;

public class arraydemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days shop open in a week");
		int size = sc.nextInt();

		int income[] = new int[size];
		
		
		for (int i = 0; i < income.length; i++) 
		{
			System.out.println("enter income for day "+ (i+1));
			income[i] = sc.nextInt();
		}

		System.out.println("Weekly Income " +Arrays.toString(income));  
		targets(income);

	}

	private static void targets(int[] income) {
		Scanner sc = new Scanner(System.in);            
		System.out.println("Enter number of targets");  
		int targetCount = sc.nextInt();
		int sum=0;
		int k=0;
		for(int i=1;i<=targetCount;i++)					
		{
			System.out.println("Enter Target " + i);
			int target=sc.nextInt();  	
			int flag=0;									
			for(int j=k;j<income.length;j++)			
			{											
				sum+=income[j];
				if(sum>=target)
				{
					System.out.println("Target achieved on day "+(j+1));
					flag=1;
					sum=sum-target;
					k=j+1;
					break;										
				}
			}										
			
			if(flag==0)
				System.out.println("Mission Impossible");
		}
		
	}

}