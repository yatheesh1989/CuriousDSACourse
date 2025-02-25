package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RotateKElementQue {

	public static void main(String[] args) {
		 Queue<Integer> q = new LinkedList<Integer>();
		 q.add(1);
		 q.add(2);
		 q.add(3);
		 q.add(4);
		 q.add(5);
		 q.add(6);
		 int k=3;
		System.out.println(modifyQueue(q,k));
	}
	
	public static  Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
		if(k==0) {
			return q;
		}
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<k;i++){
            if(!q.isEmpty()){
                s.push(q.remove());
            }
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        int d = q.size()-k;
        for(int i=0;i<d;i++){
            q.add(q.remove());
        }
        return q;
    }

}
