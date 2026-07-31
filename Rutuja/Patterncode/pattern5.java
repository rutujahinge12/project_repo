//     1  
//    2 2  
//   3 3 3  
//  4 4 4 4  
// 5 5 5 5 5 


import java.util.Scanner;

public class pattern5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            ///left side space
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            ///center numbers=+
            for(int j=0;j>=1;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print( j+" ");
            }
            System.out.println();

        }
    }
}

