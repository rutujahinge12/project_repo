///** ** */
///** ** */
///** ** */
import java.util.Scanner;

public class pattern1{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Character you want to print:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<6;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}