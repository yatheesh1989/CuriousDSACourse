package LinkedList;

import java.util.Scanner;

public class DeleteNodeByData {

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
		int key = sc.nextInt();
		Node result = deleteNodeByDataMatch(temp, key);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	private static Node deleteNodeByDataMatch(Node temp, int key) {
		Node current = temp;
		Node prev = null;
		while(current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		
		if(prev != null && current.data == key) {
			prev.next=current.next;
		}
		
		return temp;
	}
		

}

	
