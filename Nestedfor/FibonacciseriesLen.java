import java.util.Scanner;

public class FibonacciseriesLen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Fibonacci series:");
        int length = sc.nextInt();

        int n1 = 0;
        int n2 = 1;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 3; i <= length; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);

            n1 = n2;
            n2 = n3;
        }

        sc.close();
    }
}