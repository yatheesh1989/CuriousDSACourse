package Recursion;

public class NthFibinacciRecursion {

	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int index =4;
//		int count = 0;
//		while(index>0) {
//			count = count + findFibonacci(index);
//			index--;
//		}
//		System.out.println(count);
		System.out.println(findFibonacci(5));
//		System.out.println(sum);
	}
	
	static int findFibonacci(int n) {
		if(n==1) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		if(n>1) {
			int fiboValue = findFibonacci(n-1) + findFibonacci(n-2);
			System.out.println("===" + fiboValue);
			sum = sum + fiboValue;
			return fiboValue;
		}
		return 0;
	}

}
