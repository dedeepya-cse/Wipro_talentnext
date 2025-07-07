package Arrays;
import java.util.*;
public class Question7 {
	public static void main(String[] args) {
		        int[] arr = {12, 34, 12, 45, 67, 89};

		        System.out.println("Array without duplicates:");

		        for (int i = 0; i < arr.length; i++) {
		            boolean isDuplicate = false;
		            for (int j = 0; j < i; j++) {
		                if (arr[i] == arr[j]) {
		                    isDuplicate = true;
		                    break;
		                }
		            }
		            if (!isDuplicate) {
		                System.out.print(arr[i] + " ");
		            }
		        }
		    }
		}

		


