package DSA_Course;

import java.util.*;

public class ArrayAlternateOrder {

	public static void main(String[] args) {
		// Print alternate elements from index 0
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int i =0;
		while(i<n) {
			arr[i] = in.nextInt();
			i++;
		}
		int[] result = getAlternateElements(arr);
		System.out.println(Arrays.toString(result));

	}

	public static int[] getAlternateElements(int[] arr) {
		if (arr.length <= 2) {
			return new int[] {arr[0]};
		}
		int sizeN = arr.length % 2 == 0 ? arr.length / 2 : (arr.length / 2) + 1;
		int[] arrNew = new int[sizeN];
		int indexNew = 0;
		for (int i = 0; i < arr.length; i += 2) {
			arrNew[indexNew] = arr[i];
			indexNew++;
		}
		return arrNew;
	}

}
