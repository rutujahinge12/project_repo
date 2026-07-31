//sum of digit till it reduces to a single digit
import java.util.Scanner;

public class NestedForDemo2{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while(num>9){
            int sum=0;
            while(num>0){
                int digit =num%10;
                sum=sum+digit;
                num=num/10;
                    
            }
            num=sum;
        }
        System.out.println("Single digit is:" + num);        
    }
}