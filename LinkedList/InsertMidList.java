package LinkedList;

import java.util.Scanner;

public class InsertMidList {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1

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
//		System.out.println("Enter the data to insert");
//		int x = sc.nextInt();
//		Node result = insertMiddle(head, x);
		Node result = moveToFront(head);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	static Node insertMiddle(Node head, int x) {
		if(head == null) {
			return head = new Node(x);
		}
		Node temp, temp1;
		temp =head;
		temp1=head.next;
		while(temp1!=null && temp1.next!=null) {
			temp=temp.next;
			temp1=temp1.next.next;
		}
		Node temp2 = new Node(x);
		temp2.next = temp.next;
		temp.next = temp2;
		return head;
	}
	
	public static Node moveToFront(Node head) {
        Node tail = head;int count=1;
        while(tail.next!=null){
            tail=tail.next;
            count++;
        }
//        Node temp = head;
        tail.next=head;
        for(int i=1;i<count;i++) {
        	head=head.next;
        }
        head.next=null;
        return head;
    }
}
