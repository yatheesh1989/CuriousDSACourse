package DSA_Course;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSumOfPrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int L=s.nextInt(); int R=s.nextInt();
		ArrayList<Integer> list = new ArrayList<>(R+1);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<R+1;i++){
            list.add(1);
        }
        for(int i=2;i<=(int)Math.sqrt(R);i++) {
			if(list.get(i)==1) {
				for(int j=i*2;j<R+1;j+=i) {
					list.set(j, 0);
				}
			}
		}
		for(int k=2;k<=R;k++){
		    if(list.get(k) == 1){
		        result.add(k);
		    }
		}
		int sum=0;
		for(int k=L;k<=R;k++){
		    if(list.get(k) == 1){
		       sum=sum+k;
		    }
		}
		System.out.println(sum);
	}

}
