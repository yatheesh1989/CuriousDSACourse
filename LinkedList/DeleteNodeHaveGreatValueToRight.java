package LinkedList;

import java.util.Scanner;

public class DeleteNodeHaveGreatValueToRight {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1
		//not completed
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
		Node result = removeNodeGreaterValue(head);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	static Node removeNodeGreaterValue(Node head) {
		Node temp=null;
		Node prev = head;
		Node cur = head.next;
		while(cur!=null) {
			if(prev.data < cur.data) {
				if(temp==null) {
					head = cur;
					prev=cur;
					cur=cur.next;
					temp=cur;
				}else {
					temp.next=cur.next;
//					temp=
				}
			}else {
				prev=prev.next;
				cur=cur.next;
			}
		}
		return head;
	}

}
