package Arrays;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("Enter " + n + " integers:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double average = (double) sum / n;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

		sc.close();
	}
}
