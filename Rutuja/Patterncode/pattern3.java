//****** */
//*    *
//*    *
//*    *
//****** */
import java.util.Scanner;

public class pattern3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i==row || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}









// import java.util.*;
// class UpgradDemo
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter rows :-");
//         int row=sc.nextInt();
//          System.out.println("enter columns :-");
//         int col=sc.nextInt();

//         for(int i=0;i<row;i++)
//         {
//             for(int j=0;j<col;j++)
//             {
//                 if(i==0 || i==row-1 ||j==0 ||j==col-1)
//                 {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
        
//         }
//     }
// }