package Arrays;
import java.util.*;
public class Question8 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter " + n + " elements:");
		        for(int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        int sum = 0;
		        for(int i = 0; i < n; i++) {
		            if (arr[i] == 6) {
		                i++;
		                for (; i < n; i++) {
		                    if (arr[i] == 7) {
		                        break;
		                    }
		                }
		            } else {
		                sum += arr[i];
		            }
		        }

		        System.out.println("Sum: " + sum);
		        sc.close();
		    }
		}

		


