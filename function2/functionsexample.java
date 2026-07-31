//Function case 1 :accept temperature in celcius and convert it to fahrenheit
// import java.util.Scanner;

// public class functionsexample {
//     public static void convert() {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter temperature in Celsius: ");
//         double c = sc.nextDouble();

//         double f = (c * 9 / 5) + 32;

//         System.out.println("Temperature in Fahrenheit is: " + f);
//     }

//     public static void main(String[] args) {
//         convert();
//     }
// }



// Case 2
// import java.util.Scanner;

// public class functionExample {

//     static void convert(double c) {
//         double f = (c * 9 / 5) + 32;

//         System.out.println("Temperature in Fahrenheit is: " + f);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter temperature in Celsius: ");
//         double c = sc.nextDouble();

//         convert(c);
//     }
// }



//case 3
import java.util.Scanner;

public class functionExample {
    static double convert(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = convert(c);

        System.out.println("Temperature in Fahrenheit is: " + f);
    }
}