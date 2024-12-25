package DSA_Course;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int[] arr = new int[n];
			int i =0;
			while(i<n) {
				arr[i] = in.nextInt();
				i++;
			}
			
			System.out.println("Enter the index key to find the value");
			int key = in.nextInt();
			if(key < arr.length) {				
				System.out.println(arr[key]);
			}else {
				System.out.println("The give key not in range of array size. INVALID KEY");
			}
		}
		
	}

}
