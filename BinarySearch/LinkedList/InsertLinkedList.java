package LinkedList;

import java.util.Scanner;

public class InsertLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		Node temp =null;
		Scanner sc = new Scanner(System.in);
		int dataCount = sc.nextInt();
		System.out.println(dataCount);
		while(dataCount>0){
			if(head == null) {
				head = new Node(sc.nextInt());
//				head.data = sc.nextInt();
//				head.next = null;
				temp = head;
			}else {
				Node temp1 = new Node(sc.nextInt());
//				temp1.data=sc.nextInt();
//				temp1.next = null;
				temp.next = temp1;
				temp = temp1;
			}
			dataCount--;
		}
		temp=head;
		while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
	}

}

//class Node{
//	int data;
//	Node next;
//}