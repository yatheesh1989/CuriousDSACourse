package LinkedList;

import java.util.Scanner;

public class InsertHeadPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		temp = head;
//		Node temp =null;
		Node result = insertAtHeadPosition(temp);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
//		head = result;
//		while(head !=null) {
//			System.out.println(head.data);
//			head = head.next;
//		}
	}
	
	public static Node insertAtHeadPosition(Node node) {
		Node newHead = null;
		if(node !=null) {			
			newHead = new Node(100);
			newHead.next = node;
		}else {
			newHead = new Node(100);
		}
		return newHead;
	}

}
