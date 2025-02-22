package LinkedList;

import java.util.Scanner;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
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
		Node result = removeDuplicates(head);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

	private static Node removeDuplicates(Node head) {
		// TODO Auto-generated method stub
		Node temp, temp1;
		temp = head; temp1=head.next; int find=temp.data;
		while(temp1 != null) {
			if(temp1.data != find) {
				temp=temp.next;
				temp1=temp.next;
				find=temp.data;
			}else {
				temp1=temp1.next;
				temp.next=temp1;
			}
		}
		return head;
	}

}
