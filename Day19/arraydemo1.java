//currency exchange
import java.util.Scanner;

public class arraydemo1{
    public static void main(String[]args){
        int currency[]={500,200,100,50,20,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the exchange amount:");
        int amount = sc.nextInt();

        calculateExchange(currency,amount);
    }

    public static void calculateExchange(int currency[],int amount){
        int notes[]=new int[currency.length];
      
            for(int i=0;i<currency.length;i++){
                if(amount>0){
                    notes[i]= amount/currency[i];
                    amount=amount/currency[i];
                }else{
                    break;
                }
            }
            int sum=0;
            for(int i=0;i<currency.length;i++){
                if (notes[i]!=0){
                    System.out.println(currency[i] + " X " + notes[i]);
                    sum+=notes[i];
                }
            }
            System.out.println("Total notes:" + sum);
            System.out.println("Changes:" + amount);
    }
}