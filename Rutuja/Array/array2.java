// You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1]


import java.util.Scanner;

public class array2{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();

        int nums[]= new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int target =sc.nextInt();

        findTwoSum(nums,target);
    }
    public static void findTwoSum(int nums[],int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){    
                if(nums[i] + nums[j] == target){
                    //System.out.println("["+ i +","+ j+"]");
                    return  new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
        public static void display(int result[]){

        }
       
        System.out.println("No pair founds:");
    }
}