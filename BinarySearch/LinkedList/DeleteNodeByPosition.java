package LinkedList;

import java.util.Scanner;

public class DeleteNodeByPosition {

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
		int position = sc.nextInt();
		Node result = deleteNodeByPosition(temp, position);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	private static Node deleteNodeByPosition(Node temp, int position) {
		int count = 1;
		Node current = temp;
		Node prev = null;
		while(current != null && count != position) {
			prev = current;
			current = current.next;
			count=count+1;
		}
		
		if(prev != null && count == position) {
			prev.next=current.next;
		}else {
			return current.next;
		}
		
		return temp;
	}

}
