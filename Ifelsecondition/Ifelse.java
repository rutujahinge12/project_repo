///Use if else condition and write the code of a salary of a person as
// 1 lak -->excellent
//75--->v.good
//50--->good
//25--->accepted
//Below 25--->low income

import java.util.Scanner;

public class Ifelse{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary:: ");
        int salary = sc.nextInt();
        if(salary>=100000){
            System.out.println("Excellent");
        }
        else if(salary>=750000){
            System.out.println("Very Good");
        }
        else if(salary>=50000 ){
            System.out.println("Good");
        }
        else if(salary>=25000){
            System.out.println("accepted");
        }
        else{
            System.out.println("Low Income");

        }
        

    }

}