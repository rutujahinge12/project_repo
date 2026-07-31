import java.util.Scanner;

public class switchcasepizza {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please select your order from the menu given below:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Fries");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            // ---------------- PIZZA ----------------
            case 1:
                System.out.println("\nWhich Pizza do you want?");
                System.out.println("1. Veg Pizza");
                System.out.println("2. Non-Veg Pizza");
                System.out.print("Enter your choice: ");
                int pizzaChoice = sc.nextInt();

                switch (pizzaChoice) {

                    case 1:
                        System.out.println("\nChoose Pizza Size");
                        System.out.println("1. Medium");
                        System.out.println("2. Large");
                        System.out.print("Enter your choice: ");
                        int vegSize = sc.nextInt();

                        switch (vegSize) {
                            case 1:
                                System.out.println("You ordered a Medium Veg Pizza.");
                                break;

                            case 2:
                                System.out.println("You ordered a Large Veg Pizza.");
                                break;

                            default:
                                System.out.println("Invalid Size.");
                        }
                        break;

                    case 2:
                        System.out.println("\nChoose Pizza Size");
                        System.out.println("1. Medium");
                        System.out.println("2. Large");
                        System.out.print("Enter your choice: ");
                        int nonVegSize = sc.nextInt();

                        switch (nonVegSize) {
                            case 1:
                                System.out.println("You ordered a Medium Non-Veg Pizza.");
                                break;

                            case 2:
                                System.out.println("You ordered a Large Non-Veg Pizza.");
                                break;

                            default:
                                System.out.println("Invalid Size.");
                        }
                        break;

                    default:
                        System.out.println("Invalid Pizza Choice.");
                }
                break;

            // ---------------- BURGER ----------------
            case 2:
                System.out.println("\nChoose Burger Size");
                System.out.println("1. Medium");
                System.out.println("2. Large");
                System.out.print("Enter your choice: ");
                int burgerSize = sc.nextInt();

                switch (burgerSize) {
                    case 1:
                        System.out.println("You ordered a Medium Burger.");
                        break;

                    case 2:
                        System.out.println("You ordered a Large Burger.");
                        break;

                    default:
                        System.out.println("Invalid Size.");
                }
                break;

            // ---------------- FRIES ----------------
            case 3:
                System.out.println("\nChoose Fries Size");
                System.out.println("1. Medium");
                System.out.println("2. Large");
                System.out.print("Enter your choice: ");
                int friesSize = sc.nextInt();

                switch (friesSize) {
                    case 1:
                        System.out.println("You ordered Medium Fries.");
                        break;

                    case 2:
                        System.out.println("You ordered Large Fries.");
                        break;

                    default:
                        System.out.println("Invalid Size.");
                }
                break;

            default:
                System.out.println("Invalid Main Menu Choice.");
        }

            // sc.close();
    }
}






// import java.util.Scanner;

// public class switchcasepizza{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("**What is your Choice ??**");
//         System.out.println("1 :Pizza ");
//         System.out.println("2 :Burger ");
//         System.out.println("3 :Fries ");
//         int choice = sc.nextInt();
//         switch (choice) {
//             case 1:
//                 System.out.println("**Which pizza u want??**");
//                 System.out.println("1 :veg");
//                 System.out.println("2 :nonveg ");
//                 //int choice1 =sc.nextInt();
//                 switch(choice){
//                     case 1:
//                     System.out.println("**What should be the size of your pizza ??**");
//                     System.out.println("1 :Medium");
//                     System.out.println("2 :Large ");
//                     break;
//                 }
        
//             case 2:
//                 System.out.println("**What should be the size of your Burger ??**");
//                 System.out.println("1 :Medium");
//                 System.out.println("2 :Large ");
//                // break;
//                 //int choice2 =sc.nextInt();
//                 switch(choice){
//                     case 1:
//                     System.out.println("**What should be the size of your pizza ??**");
//                     System.out.println("1 :Medium");
//                     System.out.println("2 :Large ");
//                     break;
//                 }
//             case 3:
//                 System.out.println("**What should be the size of your Fries ??**");
//                 System.out.println("1 :Medium");
//                 System.out.println("2 :Large ");
//                 //break;
//                 //int choice3 =sc.nextInt();
//                 switch(choice){
//                     case 1:
//                     System.out.println("**What should be the size of your pizza ??**");
//                     System.out.println("1 :Medium");
//                     System.out.println("2 :Large ");
//                     break;
//                 }
//             default:
//                 System.out.println("Invalid choice.");
//         }
//     }
// }