/////sum of an array


import java.util.Scanner;

public class arraydemo3{
    public static void main(String[]args){
        
       int arr[]=new int[10];
       Scanner sc =new Scanner(System.in);
       //accept the array
       for(int i=0;i<arr.length;i++){
            System.out.println("Enter a number");
            arr[i]=sc.nextInt();
        }
       int sum=0;
       for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
       System.out.println("Sum of arrau  is:"+ sum);
    }
}









//sum of an array

// import java.util.Scanner;

// public class arraydemo3{
//     public static void main(String[]args){
        
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the size of array:");
//        int size=sc.nextInt();
//        int arr[]=new int[size];

//        //accept the array
//        for(int i=0;i<arr.length;i++){
//             System.out.println("Enter a number");
//             arr[i]=sc.nextInt();
//         }
        
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//        System.out.println("Sum of arrau  is:"+ sum);
//     }
// }