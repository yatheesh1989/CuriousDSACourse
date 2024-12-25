package DSA_Course;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		// Check array is palindrome
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] arrN = new int[n];
		int i =0;
		while(i<n) {
			arr[i] = in.nextInt();
			i++;
		}
		int j =n-1; int k=0;
		while(j>=0) {
			arrN[k] = arr[j];
			j--;
			k++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrN));
		System.out.println(Arrays.equals(arr, arrN));
	}

}
