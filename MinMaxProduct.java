package DSA_Course;

import java.util.Scanner;

public class MinMaxProduct {

	public static void main(String[] args) {
		// Find Max in arr1 and Min from arr2 and return product of max and min.
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int n2 = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n2];
		int i =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(i<n) {
			arr1[i] = in.nextInt();
			max = Math.max(max, arr1[i]);
			i++;
		}
		int k=0;
		while(k<n2) {
			arr2[k] = in.nextInt();
			min = Math.min(min, arr2[k]);
			k++;
		}
		System.out.println(max +"====="+min);
		System.out.println(max * min);
		
	}

}
