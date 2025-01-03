package Recursion;

import java.util.Arrays;

public class ReverseArraryRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(reverseSwap(arr, 0, arr.length-1)));
	}

	public static int[] reverseSwap(int[] a, int i, int j){
        if(i>j){
            return a;
        }
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
        return reverseSwap(a, i+1, --j);
    }
}
