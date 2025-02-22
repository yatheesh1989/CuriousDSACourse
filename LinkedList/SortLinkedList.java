package LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class SortLinkedList {

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
//		System.out.println(getMiddle(head).data);
////		Node mid = getMiddle(head);
		Node result = oddEvenList(head);
		while(result!=null) {
			System.out.println(result.data);
			result=result.next;
		}
	}
	
	static Node sortList(Node node) {
		if (node == null || node.next == null) {
            return node;
        }
		Node mid = getMiddle(node);
		Node left = sortList(node);
		Node right = sortList(mid);
		return merge(left, right);
	}
	
	static Node merge(Node left, Node right) {
		Node dummy = new Node(-1);
		Node list = dummy;
		while(left!=null && right!=null) {
			if(left.data < right.data) {
				list.next=left;
				left= left.next;
				list=list.next;
			}else {
				list.next=right;
				right=right.next;
				list=list.next;
			}
		}
		list.next = (left != null) ? left : right;
		return dummy.next;
	}
	
	static Node getMiddle(Node head) {
		Node s=head;Node f=head;Node midPrev = null;
		while(f!=null &&f.next!=null) {
			midPrev=s;
			s=s.next;
			f=f.next.next;
		}
		Node mid = s;
		midPrev.next=null;
		return mid;
//		Node midPrev = null;
//	        while (head != null && head.next != null) {
//	            midPrev = (midPrev == null) ? head : midPrev.next;
//	            head = head.next.next;
//	        }
//	        Node mid = midPrev.next;
//	        midPrev.next = null;
//	        return mid;
  }
	
	
	public static Node oddEvenList(Node head) {
		
        if(head==null || head.next==null){
            return head;
        }
        Node o=head;
        Node e=head.next;
        Node evenStart =e;
        while(e.next!=null && e!=null){
            o.next=e.next;
            o=o.next;
            e.next=o.next;
            e=e.next;
        }
        o.next=evenStart;
        return head;
    }

}
