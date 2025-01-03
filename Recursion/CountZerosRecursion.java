package Recursion;

public class CountZerosRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=(int)02500;
		System.out.println(countZero(n));
	}
	
	static int countZero(int n) {
		if(n == 0) {
			return 0;
		}
		if(n%10 == 0) {
			int v = countZero(n/10);
			return 1+ v;
		}else {
			return countZero(n/10);
		}
	}

}
