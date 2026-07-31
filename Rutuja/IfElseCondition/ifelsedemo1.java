import java.util.Scanner;

public class ifelsedemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a bracket: ");
        char ch = sc.next().charAt(0);

        if (ch == '(' || ch == ')') {
            System.out.println("Round Bracket");
        }
        else if (ch == '{' || ch == '}') {
            System.out.println("Curly Bracket");
        }
        else if (ch == '[' || ch == ']') {
            System.out.println("Square Bracket");
        }
        else {
            System.out.println("Invalid Character");
        }

        sc.close();
    }
}