package StackQueue;

import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.Stack;

public class NextMajorElement {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(3);
		s.push(2);
		s.push(4);
	}
	
	public static ArrayList<Integer> nextLargerElement(int[] arr) {
		// Using monotonic order
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] result = new int[arr.length];
        for(int i=arr.length-1; i>=0;i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i]=-1;
                s.push(arr[i]);
            }else{
                result[i]=s.peek();
                s.push(arr[i]);
            }
            
        }
        for(int k:result){
            list.add(k);
        }
        return list;
    }

}
