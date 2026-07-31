import java.util.*;
public class array1 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows :");
        int rows=sc.nextInt();   //5
        System.out.println("Enter columns :");
        int cols=sc.nextInt();   //5
        int arr[][]=new int[rows][cols];    //[5][5]   

        twoDArray(arr);

    }
        
        public static void twoDArray(int arr[][])
        {
             Scanner sc=new Scanner(System.in);
        //get values from user and sotre them in 2d array
       for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)  
          {
            System.out.print("enter "+i+"th row "+j+"th col element :-");
               arr[i][j]=sc.nextInt();
          }
          
        }
            

       //display the 2d values
       System.out.println("2D array is :-");
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)  
          {
        System.out.print(arr[i][j] +" ");
          }
          System.out.println(" ");
        }


// Display Even and Odd Numbers
int evenSum = 0;
int oddSum = 0;

System.out.println("Even Numbers are:");
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] % 2 == 0) {
            System.out.print(arr[i][j] + " ");
            evenSum += arr[i][j];
        } else {
            System.out.print("_ ");
        }
    }
    System.out.println();
}

System.out.println("Sum of Even Numbers = " + evenSum);

System.out.println("\nOdd Numbers are:");
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] % 2 != 0) {
            System.out.print(arr[i][j] + " ");
            oddSum += arr[i][j];
        } else {
            System.out.print("_ ");
        }
    }
    System.out.println();
}

System.out.println("Sum of Odd Numbers = " + oddSum);
           
    
    }
}