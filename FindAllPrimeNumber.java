package CouriousDsa;

import java.util.Scanner;

public class FindAllPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inObj = new Scanner(System.in);
		int n = inObj.nextInt();
		boolean flag = true;
		for(int i=2;i<=n;i++) {
			for(int j=2;j<i;j++) {				
				if(i%j ==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(i + " ");
			}
			flag = true;
		}
	}

}
