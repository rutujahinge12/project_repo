import java.util.Scanner;

public class forloopdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times to print your name: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rutuja");
            
        }

    }
}