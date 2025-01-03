package Recursion;

public class CountDigitsRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=353445242;
		System.out.println(countDigits(n));
	}
	
	static long countDigits(long n) {
		if(n>0) {
			return 1+countDigits(n/10);
		}
		return 0;
	}

}
