package LinkedList;

import java.util.Scanner;

public class InsertAfterPosition {

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
		temp=head;
		while(temp!=null) {
			if(temp.data == 3) {
				Node tep = new Node(4);
				tep.next = temp.next;
				temp.next = tep;
				break;
			}
			temp = temp.next;
		}
		while(head !=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}


class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}