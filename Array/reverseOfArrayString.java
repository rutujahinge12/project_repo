import java.util.Arrays;
import java.util.Scanner;

public class reverseOfArrayString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int result[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int rev = 0;

            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }

            result[i] = rev;
        }

        System.out.println("Reversed Numbers:");

        for (int n : result) {
            System.out.print(n + " ");
        }

        sc.close();
    }
}





// import java.util.Arrays;
// import java.util.Scanner;

// public class reverseOfArrayString {  	

// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);	
// 		System.out.println("Enter size of Array");
// 		int size=sc.nextInt();
		
// 		int arr[]=new int[size];
		
// 		for(int i=0;i<arr.length;i++)			
// 		{										
// 			System.out.println("enter a number");
// 			arr[i]=sc.nextInt();
// 		}	

// 		System.out.println(Arrays.toString(arr));
//     sumOfArray(arr);
// }

// private static void sumOfArray(int[]arr1){
//     int arr2=new int[arr1.length];
    
//     for(int i=1;i<arr.length;i++)			
// 		{
//             sumOfArray(arr1[i]);
//             arr2=ans;
//         }
// }

//     public static void sumOfDigit(int[]arr1){
//     int arr2[]=new int[arr1.length];
    
//     for(int i=1;i<arr.length;i++)			
// 		{
            
            
//         }
// }	
           