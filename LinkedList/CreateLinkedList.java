package LinkedList;

public class CreateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(4);
//		head.data = 4;
//		head.next =null;
		System.out.println(head.next);
		System.out.println(head.data);
		
		Node temp = new Node(6);
//		temp.data=6;
		head.next = temp;
		System.out.println(head.next.data);
		System.out.println(head.next.next);

	}

}

//class Node{
//	int data;
//	Node next;
//	Node(int data){
//		this.data=data;
//		this.next=null;
//	}
//}