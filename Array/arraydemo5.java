import java.util.Scanner;

public class arraydemo5{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string of an array");
        int size =sc.nextInt();

        System.out.println("Enter the mobile number");
        Long arr[]=new Long[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLong();
        }
        
        for(int j=0;j<arr.length;j++){
            long num =arr[j];
            long odd=0;
            long even=0;
            long rem;
            while(num>0){

                rem=num % 10;
                if(rem%2==0){
                    even =even+1;
                }else{
                    odd =odd+1;
                }
                num=num/10;

            }
                      
            System.out.println("For:" + arr[j]+" : " + " even numbers: " + even + " odd Number:" + odd );
            //arr[i]=sc.nextInt();
        }

    }
}