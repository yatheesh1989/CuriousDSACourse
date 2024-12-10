package CouriousDsa;
import java.util.*;
public class FindNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inObj = new Scanner(System.in);
		int n = inObj.nextInt();
		int count=0;
        while(n>0){
            int d =n%10;
            n=n/10;
            count++;
        }
        System.out.println(count);

	}

}
