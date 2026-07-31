/* class Patterns
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=6;j++)
            {
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}  
    

 */
/* O/P:-

******  
******  
******  
******  */



/* class Patterns
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1 || i==4 || j==1 ||j==4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
} */

/* 
O/P :-

**** 
*  * 
*  * 
**** 
 */



/* class Patterns
{
    public static void main(String args[])
        {
           for(int i=1;i<=4;i++)
           {
            for(int j=1;j<=i;j++)       
            {
                System.out.print("*");
            }
            System.out.println(" ");
           }
        }
    
} */


/* O/P:-    
*
**
***
**** 
*/



/* class Patterns
{
     public static void main(String args[])
    {
            for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        } 

             for(int i=4;i>=1;i--)
           {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
           }
    }
} */


/* 
    O/P:-

****    
*** 
** 
*

 */

  
/* 

  class Patterns
{
    public static void main(String args[])
    {
         for(int i=1;i<=4;i++)
         {
            for(int j=1;j<=4-i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println(" ");
         }
    }
}

*/

/* 

O/P:-

    * 
   ** 
  *** 
 **** 
 
  */

/* 

 class Patterns
 {
    public static void main(String args[])
    {
    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
 } */


/*
1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5
*/



/* class Patterns
{
    public static void main(String args[])
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(j+" ");
            }
          System.out.println(" ");
        }
    }
}

or

 class Patterns
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
              for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(j+" ");
            }
          System.out.println(" ");
        }
    }
}

 */

/*
 O/P:-
1 2 3 4 5  
1 2 3 4  
1 2 3  
1 2  
1  
*/


/* 

class Patterns
 {
    public static void main(String args[])
    {
       int num=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               
                System.out.print(num+" ");
                 num=num+1;
            }
            System.out.println(" ");
        }
    }
 }

 */


/*

1  
2 3  
4 5 6  
7 8 9 10  
11 12 13 14 15 

*/



/* 
class Patterns
 {
    public static void main(String args[])
    {
       
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }

            }
            System.out.println(" ");
        }
    }
 }
 */

/* 
1 
01 
101 
0101 
10101 
 */



/* 

class Patterns{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {   
                System.out.print("*");
            }
            System.out.println(" ");
        }



         for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }

        
    }
} */


/*  

class Patterns
    {
        public static void main(String[] args) {
            int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print("*");
                }
                for(int s=0;s<2*(n-i);s++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");

            }


            for(int i=n;i>=1;i--)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print("*");
                }
                for(int s=0;s<2*(n-i);s++)
                {
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");

            }

        }


    } 
    
*/

/* 
O/P:-    

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


 */



/*
class Patterns
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
           for(int s=1;s<=5;s++)
           {
            System.out.print("*");
           }
           System.out.println(" ");
        }
    }
}

*/


/* 

O/P:-

     ***** 
    ***** 
   ***** 
  ***** 
 ***** 
 
 */


/* 
public class Patterns
{
    public static void main(String args[])
    {
        int n=5;
         int a=1;
        for(int i=n;i>=1;i--)
        {
           for(int j=1;j<=i;j++)
           {
            System.out.print(" ");
           }
           
            for(int s=1;s<=n-i+1;s++)
            {
            System.out.print(a+" ");
           }a++;
           
           System.out.println(" ");
        }
    }
} */

/* 

O/P:-
     1  
    2 2  
   3 3 3  
  4 4 4 4  
 5 5 5 5 5 
 
 */

/* 

 public class Patterns
 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            
            for(int s=i;s>=1;s--)
            {
                System.out.print(s+" ");
            }
            for (int q=2; q<=i; q++){
                System.out.print(q+" ");
            }

            System.out.println();
        }
    }
 }

 
 */

/* 
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 

   */
