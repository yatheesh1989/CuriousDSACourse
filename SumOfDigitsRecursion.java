package DSA_Course;

public class SumOfDigitsRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 342;
		System.out.println(sumDigits(n));
	}
	
	static int sumDigits(int n) {
		if(n > 0) {
			return (n%10)+ sumDigits(n/10);
		}
		return 0;
	}

}
