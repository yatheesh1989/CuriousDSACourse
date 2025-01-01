package DSA_Course;

public class FindPowerOfNumberRecursion {

	static int i=1;
	public static void main(String[] args) {
		/*
		 * Write a Program to find the power of a number recursively. Take two inputs, number and the power.

			Example:
			Input: 2 3
			
			Output: 8
			
			Explanation : 2^3 is 8
			
		 */
		System.out.println(findPower(3,4));
		findPower1(3,4);
		System.out.println(i);
	}
//	Without return 
	public static void findPower1 (int n, int power) {
		if(power == 0 ) {
			return;
		}
		i = i*n;
		findPower1(n, power-1);
	}
	
//	With return
	public static int findPower(int n, int power) {
		if(power == 0) {
			return 1;
		}
		return n * findPower(n, power -1);
	}

}
