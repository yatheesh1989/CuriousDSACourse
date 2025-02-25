package StackQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NGEByTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		HashMap<Integer,Integer> ng = new HashMap<>();
		Stack<Integer> s = new Stack<Integer>();
		int[] mod = new int[nums2.length];
		int[] res = new int[nums1.length];
//		for(int a=0;a<nums1.length;a++) {
//			s.removeAllElements();
//			for(int i=nums2.length-1;i>=0;i--){
//				while(!s.isEmpty() && s.peek() <= nums2[i]){
//					s.pop();
//				}
//				if(s.isEmpty()){
//					mod[i] = -1;
//					if(nums1[a]==nums2[i]) {
//						res[a] = -1;
//						break;
//					}
//				}else{
//					mod[i] = s.peek();
//					if(nums1[a]==nums2[i]) {
//						res[a] = s.peek();
//						break;
//					}
//				}
//				s.push(nums2[i]);
//			}
//		}
		
		for(int i=nums2.length-1;i>=0;i--){
			while(!s.isEmpty() && s.peek() <= nums2[i]){
				s.pop();
			}
			if(s.isEmpty()){
				ng.put(nums2[i],-1);

			}else{
				ng.put(nums2[i],s.peek());
			}
			s.push(nums2[i]);
		}
		for(int a=0;a<nums1.length;a++) {
			res[a]=ng.get(nums1[a]);
		}
		System.out.println(Arrays.toString(res));
		System.out.println(ng);
	}

}
