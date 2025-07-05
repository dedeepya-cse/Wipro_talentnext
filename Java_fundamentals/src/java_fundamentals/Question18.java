package java_fundamentals;
import java.util.Scanner;
public class Question18 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a number:");
		        int num = sc.nextInt(); // Read number
		        int sum = 0;

		        while (num > 0) {
		            sum += num % 10; // Get last digit
		            num = num / 10;// Remove last digit
		        }

		        System.out.println(sum); // Print sum
		    }
		}

		    

		    

	
