import java.util.Scanner;

public class forloopdemosimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        for (int i = 1; i <= 3; i++) {    
        System.out.println("Candidate"+ i);
        System.out.print("Enter the principle value: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = sc.nextInt();
        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        int simpleInterest = (p * r * y) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
        }
    }
}