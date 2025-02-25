package StackQueue;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.geeksforgeeks.org/problems/sort-a-stack/1?page=1&category=Stack&sortBy=submissions	
		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(1);
		s.push(2);
		s.push(4);
		System.out.println(sort(s));
	}
	
	public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> res = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        while(!s.isEmpty()){
            while(!res.isEmpty() && res.peek() > s.peek()){
                temp.push(res.pop());
            }
            res.push(s.pop());
            while(!temp.isEmpty()){
                res.push(temp.pop());
            }
        }
        return res;
    }

}
