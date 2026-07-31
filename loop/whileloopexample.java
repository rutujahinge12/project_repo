import java.util.Scanner;

public class whileloopexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of the candidate: ");
        int n = sc.nextInt();
        //int i=0;
        for(i=1;i<=n;i++){
            if(n<=18){
                System.out.println("You are not adult");
            }else if(n>18 && n<=60){
                System.out.println("You are adult");
        }

    }
}
}