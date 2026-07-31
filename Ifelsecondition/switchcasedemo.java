import java.util.Scanner;

public class switchcasedemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 :English ");
        System.out.println("2 :Hindi ");
        System.out.println("3 :Marathi ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have selected English.");
                break;
            case 2:
                System.out.println("You have selected Hindi.");
                break;
            case 3:
                System.out.println("You have selected Marathi.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
            