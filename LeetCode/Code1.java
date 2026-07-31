//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store

//Constraints:
//n == height.length
//2 <= n <= 105
//0 <= height[i] <= 104
 
import java.util.Scanner;

public class Code1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;
        int maxArea = 0;

        while (start < end) {

            int width = end - start;
            int minHeight;

            if (height[start] < height[end]) {
                minHeight = height[start];
            } else {
                minHeight = height[end];
            }

            int area = width * minHeight;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println("Maximum Water = " + maxArea);

        sc.close();
    }
}
