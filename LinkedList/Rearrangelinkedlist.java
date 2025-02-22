package LinkedList;

import java.util.Scanner;

public class Rearrangelinkedlist {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/rearrange-linked-list-in-place/1
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
//		Node result = removeNthFromEnd(head, 3);
		Node mid = findMiddle(head);
		Node midReversed = reverseMid(mid);
		Node result = splitAndMerge(head, midReversed);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}

	}
	private static Node reverseMid(Node head) {
		Node temp = head;
		Node t=null;
		while(temp!=null) {
			Node newNode = temp.next;
			temp.next=t;
			t=temp;
			temp=newNode;
			
		}
		return t;
	}
	private static Node splitAndMerge(Node head, Node midReversed) {
		Node t1=head;Node t2=head.next; Node m= midReversed;
		while(t1!=m && t2!=m) {
			Node newNode = m;
			newNode.next = t2;
			t1.next = newNode;
			t1=t2;
			t2=t1.next;
			m=m.next;
		}
		if(t1==m) {
			t1.next=null;
		}else {
			t2.next=null;
		}
		return head;
	}
	static Node findMiddle(Node head) {
		Node s,f=null;
		s=head;
		f=head.next;
		while(f!=null && f.next!=null) {
			s=s.next;
			f=f.next.next;
		}
		return s;
	}
	
	public static Node removeNthFromEnd(Node head, int n) {
		Node fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
