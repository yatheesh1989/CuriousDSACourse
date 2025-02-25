package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		int[] arr = {1,2,3,4,5,5};
		Object[] obj = new Object[2];
		for(int i=0;i<arr.length;i++) {
			q2.add(arr[i]);
			obj = insertQ1toQ2(q1, q2);
			q1=(Queue<Integer>) obj[0]; q2=(Queue<Integer>) obj[1];
			obj = swapQue(q1, q2);
			q1=(Queue<Integer>) obj[0]; q2=(Queue<Integer>) obj[1];
		}
		System.out.println(q1);
	}
	
	static Object[] insertQ1toQ2(Queue<Integer> qq1, Queue<Integer> qq2) {
		while(!qq1.isEmpty()) {
			int val = (int) qq1.remove();
			qq2.add(val);
		}
		return new Object[] {qq1, qq2};
	}
	
	static Object[] swapQue(Queue<Integer> qq1, Queue<Integer> qq2) {
		Queue<Integer> temp;
		temp = qq1;
		qq1=qq2;
		qq2=temp;
		return new Object[] {qq1, qq2};
	}

}
