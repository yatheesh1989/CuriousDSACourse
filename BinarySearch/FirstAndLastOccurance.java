package BinarySearch;

import java.util.ArrayList;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		System.out.println(find(arr, 100));
	}
	static ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = findccurance(arr, x, true);
        int b = findccurance(arr, x, false);
        list.add(a);
        list.add(b);
        return list;
    }
	
	static int findccurance(int arr[], int x, boolean first) {
		int s=0; int e= arr.length-1;int ans = -1;
		while(s<=e) {
			int m =s+(e-s)/2;
			if(arr[m] == x) {
				ans = m;
				if(first) {					
					e=m-1;
				}else {
					s=m+1;
				}
			}else if(arr[m] < x) {
				s=m+1;
			}else {
				e = m-1;
			}
		}
//		if(first) {
//			return s;
//		}else {
//			return e;
//		}
		return ans;
	}

}
