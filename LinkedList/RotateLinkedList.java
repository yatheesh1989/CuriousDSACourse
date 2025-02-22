package LinkedList;

import java.util.Scanner;

public class RotateLinkedList {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1

		Node head = null;
		Node temp = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			if(head==null) {
				head = new Node(sc.nextInt());
				temp=head;
			}else {
				Node temp1 = new Node(sc.nextInt());
				temp.next = temp1;
				temp = temp1;
			}
			n--;
		}
		System.out.println("---------");
		int k=sc.nextInt();
		Node result = rotateList(head, k);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
//	static Node rotateList(Node head, int k) {
//		Node temp = head;
//		int count=1;
//		while(temp.next!= null) {
//			temp=temp.next;
//			count ++;
//		}
//		temp.next = head;
//		if(k>count)
//			k=k%count;
////		k=count-k; for right rotate
//		/*
//		 * left rotate 1->2->3->4->5 ==> 5->1->2->3->4 rotate by 4
//		 * right rotate 1->2->3->4->5 ==> 2->3->4->5->1 rotate by 4
//		 */
//		while(k>=0) {
//			temp=temp.next;
//			k--;
//		}
//		head = temp.next;
//		temp.next = null;
//		
//		return head;
//	}
	static Node rotateList(Node head, int k) {

		if(head==null || head.next==null || k==0) {
			return head;
		}
		
		Node temp = head;
		Node s=head;
		Node f=head;
		Node prev = null;
		int count=1;
		while(temp.next!= null) {
			temp=temp.next;
			count ++;
		}
		if(k>count) {
			k=k%count;
		}
		if(k==0) {
			return head;
		}
		temp = head;
		for(int i=1;i<=count;i++) {
			if(i==k) {
				break;
			}
			temp=temp.next;;
		}
		
		while(temp.next!= null) {
			prev = s;
			s=s.next;
			temp=temp.next;
		}
		if(prev!=null) {
			temp.next=head;
			prev.next=null;
		}
		
		return s;
	}

}
