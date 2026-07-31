import java.util.Arrays;
import java.util.Scanner;

public class maximumarray {  	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)			
		{										
			System.out.println("enter a number");
			arr[i]=sc.nextInt();
		}	

		System.out.println(Arrays.toString(arr));
			
		int max=arr[0];
	
		for(int i=1;i<arr.length;i++)			
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		
		System.out.println("\nmaximum number from array is " + max);
		}
}