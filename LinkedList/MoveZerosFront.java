package LinkedList;

import java.util.Scanner;

public class MoveZerosFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=null;
		Node temp=null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			if(head == null) {
				head = new Node(sc.nextInt());
				temp=head;
			}else {
				Node temp1 = new Node(sc.nextInt());
				temp.next=temp1;
				temp=temp1;
			}
			n--;
		}
		moveZerosFront(head);
	}

	private static void moveZerosFront(Node head) {
		int count=0;
		Node temp = head;
		Node ptr = null;
		if(temp.data ==0) {
			temp=head.next;
			ptr=head.next;
			count++;
		}else {
			temp=head;
			ptr=head;
		}
		
		while(temp!=null) {
			count++;
			if(temp.data == 0) {
				Node nNode = new Node(0);
				nNode.next = head;
				temp = temp.next;
				ptr.next = temp;
				ptr=temp;
				head=nNode;
			}else {
				if(temp.next != null && temp.next.data ==0) {					
					temp=temp.next;
				}else {
					ptr = ptr.next;
					temp=temp.next;
				}
			}
		}
		System.out.println("count=="+count);
		int i=1;
		while(head !=null) {
			System.out.println(head.data);
			head = head.next;
			if(i==count) {
				head=null;
			}
			i++;
		}
	}
}
