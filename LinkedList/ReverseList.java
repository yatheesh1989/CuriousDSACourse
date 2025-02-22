package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseList {

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
		Node t=null;
		Node c=head;
		Node nxt =null;
		while(c !=null) {
			nxt = c.next;
			c.next=t;
			t.next=null;
			t=c;
			c=nxt;
		}
		head=t;
		//Working code
//		Node temp=null;
//        Node newNode = null;
//        while(head!=null){
//            newNode = head.next;
//            head.next = temp;
//            temp=head;
//            head=newNode;
//        }
	}

}
