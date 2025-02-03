package LinkedList;

import java.util.Scanner;

/**
 * 
 */
/**
 * 
 */
public class InsertBeforePosition {

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
		/* BrouteForce solution
		int count =0;
		temp=head;
		while(temp!=null) {
			if(temp.data == 4) {
				count--;
				break;
			}
			count++;
			temp = temp.next;
		}
		temp = head;
		int i=0;
		while(temp!=null) {
			if(i == count) {
				Node tep = new Node(3);
				tep.next = temp.next;
				temp.next = tep;
				break;
			}
			i++;
			temp = temp.next;
		}
		while(head !=null) {
			System.out.println(head.data);
			head = head.next;
		}*/
		
		
		// Two-pointer solution
		Node prev = null;
		Node current = head;
		int key =4;
		while(current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		if(prev !=null) {
			Node temp1 = new Node(3);
			temp1.next = current;
			prev.next=temp1;
		}
		
		while(head !=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}
