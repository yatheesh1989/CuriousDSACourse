package CouriousDsa;

import java.util.Scanner;

public class FindCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inObj = new Scanner(System.in);
		int a = inObj.nextInt();
		int b = inObj.nextInt();
		if(a < b) {
			System.out.println(GCD(a,b));
		}else {
			System.out.println(GCD(b,a));
		}
	}
	
	public static int GCD(int a, int b) {
		int gcdValue = 1;
		for(int i=2;i<=a;i++) {
			if(a%i == 0 && b%i ==0) {
				gcdValue = i;
			}
		}
		return gcdValue;
	}

}
