


import java.util.*;
class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int flag=isPrime(num);
        if(flag==0)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
}
public static int isPrime(int num)
{
    int flag=0;
    for(int i=2;i<=Math.sqrt(num);i++)
    {
        if(num%i==0)
        {
            flag=1;
            return flag;
        }
    }
    return flag;



    }
}
