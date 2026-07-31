import java.util.Scanner;

public class SchoolChocolate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int rno=1;rno<=5;rno++){
            System.out.println("Rno" + rno + "how many chocolates you have bought?");
            int chocolate=sc.nextInt();
            sum=sum+chocolate;
        }
        System.out.println("Total Choclates " + sum);
       }
}