package Arrays;
import java.util.*;
public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

		        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

		        for (int num : arr) {
		            if (num < min1) {
		                min2 = min1;
		                min1 = num;
		            } else if (num < min2) {
		                min2 = num;
		            }
		            if (num > max1) {
		                max2 = max1;
		                max1 = num;
		            } else if (num > max2) {
		                max2 = num;
		            }
		        }

		        System.out.println("Smallest two: " + min1 + ", " + min2);
		        System.out.println("Largest two: " + max1 + ", " + max2);
		        sc.close();
		    }
		}


	
