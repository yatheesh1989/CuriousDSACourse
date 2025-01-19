package BinarySearch;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,5,7,8};
		System.out.println(missingNumber(arr));
	}
	
	static int missingNumber(int arr[]) {
        // code here
		if(arr[0]!=1)
			return 1;
        int i=0; int j=arr.length-1;
        while(i<=j) {
        	int m = (i+j)/2;
        	if(arr[m] == m+1) {
        		i=m+1;
        	}else {
        		j=m-1;
        	}
        }
        return arr[j]+1;
    }

}
