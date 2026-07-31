import java.util.Scanner;

public class whileloopdemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of times to print your name: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println("Rutuja");
            i++;
        }

    }
}