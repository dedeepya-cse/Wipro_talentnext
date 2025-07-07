package Arrays;
import java.util.*;
public class Question4 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of ASCII values: ");
		        int n = sc.nextInt();
		        int[] asciiValues = new int[n];

		        System.out.println("Enter " + n + " ASCII values:");
		        for (int i = 0; i < n; i++) {
		            asciiValues[i] = sc.nextInt();
		        }

		        System.out.print("Characters: ");
		        for (int val : asciiValues) {
		            System.out.print((char) val);
		        }

		        sc.close();
		    }
		}

		   



