//sum of an array

import java.util.Scanner;

public class arraydemo4{
    public static void main(String[]args){
        
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the size of array:");
       int size=sc.nextInt();
       int arr[]=new int[size];

       //accept the array
       for(int i=0;i<arr.length;i++){
            System.out.println("Enter a number");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
       //System.out.println(Arrays.toString(arr));
       //int sumOfOdds,sumOfAll,
       int sumOfAll=0;
       int sumOfOdds=0;
       int sumOfEvens=0;
       for(int i=0;i<arr.length;i++){
        sumOfAll=sumOfAll+arr[i];
        if(arr[i]%2==0)
        sumOfEvens+=arr[i];

        if(arr[i]%2==1)
        sumOfOdds+=arr[i];
            
        }
       System.out.println("Sum of All numbers is:"+ sumOfAll);
       System.out.println("Sum of All Even numbers is:"+ sumOfOdds);
       System.out.println("Sum of All Odd numbers is:"+ sumOfEvens);
    }
}
