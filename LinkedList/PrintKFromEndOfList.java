package LinkedList;

import java.util.Scanner;

public class PrintKFromEndOfList {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
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
		System.out.println("Enter k value");
		int k = sc.nextInt();
		
		System.out.println(getKthElementFromEndOfLinkedList(head, k));
	}
	
	static int getKthElementFromEndOfLinkedList(Node head, int k) {
		Node temp;
		temp = head;
		int count =1;
		if(head == null) {
			return -1;
		}
		if(temp.next == null) {
			if(k>1) {
				return -1;
			}
			return temp.data;
		}
		while(temp.next !=null) {
			++count;
			temp=temp.next;
//			System.out.println(count);
		}
		count=count-(k-1);
		int i=1;
		while(head !=null) {
			if(i==count) {
				return head.data;
			}
			i++;
			head=head.next;
//			System.out.println(count);
		}
		return -1;
	}

}
