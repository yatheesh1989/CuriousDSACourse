package BinarySearch;

import java.util.Arrays;

public class CeilAndFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int[] arr= {5,6,8,8,5,5,6};
		System.out.println(Arrays.toString(getFloorAndCeil(x, arr)));

	}

	public static int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int s=0; int e= arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m] == x){
                return new int[]{arr[m], arr[m]};
            }else if(arr[m] < x){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        if(e<0){
            return new int[]{-1,arr[s]};
        }else if(s>arr.length-1){
            return new int[]{arr[e],-1};
        }
        return new int[]{arr[e],arr[s]};
    }
}
