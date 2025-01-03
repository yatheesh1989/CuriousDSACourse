package Recursion;

import java.util.ArrayList;

public class PrintDivisorRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12;
		printDivr(n, 1);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println();
		System.out.println(printDivisor(n, 1, list));
	}
	
	public static void printDivr(int n, int i) {
		if(i<=n){
			if(n%i == 0) {
				System.out.print(i + " ");
			}
			printDivr(n, i+1);
		}
	}
	
	public static ArrayList<Integer> printDivisor(int n, int i, ArrayList<Integer> list) {
		if(i<=n){
			if(n%i == 0) {
				list.add(i);
			}
			printDivisor(n, i+1, list);
		}
		return list;
	}
}
