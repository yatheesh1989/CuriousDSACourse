package DSA_Course;
import java.util.*;

public class SmallElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		int[] arr = new int[n];
		while(i<n) {
			arr[i] = sc.nextInt();
			i++;
		}
		int small = arr[0];
//		for(int k=0;k<n;k++) {
//			if(small>arr[k]) {
//				small = arr[k];
//			}
//		}
		for(int k=0;k<n;k++) {
			small=Math.min(small, arr[k]);
		}
		System.out.println(small);
		
	}

}
