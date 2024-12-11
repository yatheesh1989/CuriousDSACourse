package CouriousDsa;
import java.lang.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=36;
		double sum=1;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				sum = sum+i;
				if(n/i != i) {
					sum = sum + (n/i);
				}
			}
		}
		System.out.println(sum);
		if(sum == n) {
			System.out.println("Its perfect number");
		}else {
			System.out.println("Not a perfect number");
		}

	}

}
