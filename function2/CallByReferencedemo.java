package day3;

public class CallByReferencedemo {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.println( arr[0]);
        test(arr);
        System.out.println( arr[0]);
    }

    public static void test(int arr[]) {
        System.out.println( arr[0]);
        arr[0] = 99;
        System.out.println(arr[0]);
    }
}






// package day3;
// public class CallByReferencedemo{

//   int arr[]={10,20,30,40,50};
//   System.out.println(arr[0]);
//   test(arr);
//   System.out.println(arr[0]); 

// }
// public static void main(int zrr){

//   System.out.println(zrr[0]);
//   zrr[0]=99;
//   System.out.println(zrr[0]);
// }