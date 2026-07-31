// //function case 1
// import java.util.Scanner;
// public class functionExample{
//     public static void main(String []args){
//         simpleinterest();

//     }
//     public static void simpleinterest(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of principle amount");
//         double p=sc.nextDouble();

//         System.out.println("Enter the value of rate of interest");
//         double r=sc.nextDouble();

//         System.out.println("Enter the number of years");
//         double t=sc.nextDouble();

//         double si=(p*r*t)/100;
//         System.out.println("The Simple Interest is:"+ si);   
//     }
// }





//Function case 3

// import java.util.Scanner;
// public class functionExample{
//     public static void main(String []args){ 
//         double ans = simpleinterest();
//         System.out.println("The returned Simple Interest is: " + ans);
//     }
//     public static double simpleinterest(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of principle amount");
//         double p=sc.nextDouble();

//         System.out.println("Enter the value of rate of interest");
//         double r=sc.nextDouble();

//         System.out.println("Enter the number of years");
//         double t=sc.nextDouble();

//         double si=(p*r*t)/100;
        
//         return si;  
//     }
// }




//Function case 3

import java.util.Scanner;
public class functionExample{
    public static void main(String []args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principle amount");
        double p=sc.nextDouble();

        System.out.println("Enter the value of rate of interest");
        double r=sc.nextDouble();

        System.out.println("Enter the number of years");
        double y=sc.nextDouble();

       // double ans = simpleinterest();
        int ans=(int) simpleinterest(p,r,y);
        System.out.println("The returned Simple Interest is: " + ans);
    }
    public static double simpleinterest( double p, double r, double y){
       
        double si=(p*r*y)/100;
        
        return si;  
    }
}