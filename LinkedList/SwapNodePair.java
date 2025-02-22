package LinkedList;

import java.util.Scanner;

public class SwapNodePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		Node move = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			if(head == null) {
				head = new Node(sc.nextInt());
				move=head;
			}else {
				Node temp = new Node(sc.nextInt());
				move.next=temp;
				move=temp;
			}
			n--;
		}
		Node result=swapPair(head);
		while(result!=null) {
			System.out.println(result.data);
			result=result.next;
		}
	}
	
	static Node swapPair(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node link=null;
		Node temp1=head;
		Node temp2=head.next;
		if(temp2.next==null) {
			temp1.next=temp2.next;
			temp2.next = temp1;
			head=temp2;
			return head;
		}
		while(temp1!=null && temp2!=null) {
			if(link==null) {
				temp1.next=temp2.next;
				temp2.next = temp1;
				head=temp2;
				link=temp1;
				temp1=temp1.next;
				temp2=temp1.next;
			}else {
				temp1.next=temp2.next;
				temp2.next = temp1;
				link.next=temp2;
				link=temp1;
				temp1=temp1.next;
				if(temp1!=null) {
					temp2=temp1.next;
				}
				
			}
		}
		return head;
	}

}
