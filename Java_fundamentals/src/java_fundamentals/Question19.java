package java_fundamentals;
import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter an integer number:");
		        int n = sc.nextInt();

		        for (int row = 1; row <= n; row++) {
		            for (int col = 1; col <= row; col++) {
		                System.out.print(" * ");
		            }
		            System.out.println(); 
		        }
		    }
		}


	


