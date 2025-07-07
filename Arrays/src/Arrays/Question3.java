package Arrays;
import java.util.*;
public class Question3 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a elements:");
				int n = sc.nextInt();
				int[] arr = new int[n];
				System.out.print("Enter array elements:");
				for(int i = 0;i < n;i++) {
					arr[i]=sc.nextInt();
				}
				int m = sc.nextInt();
				int index = -1;
				for(int i = 0;i<n;i++) {
					if(arr[i]==m) {
						index=i;
					}
				}
				System.out.println(index);
				
			}
		}
    