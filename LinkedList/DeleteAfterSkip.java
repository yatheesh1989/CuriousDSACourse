package LinkedList;

import java.util.Scanner;

public class DeleteAfterSkip {

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
		Node result = linkedDelete(head, 1,3);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	static Node linkedDelete(Node head, int m, int n) {
//		Node curr = head;
//        Node t;
//        int count;
//        while (curr != null) {
//            for (count = 1; count < m && curr != null;
//                 count++)
//                curr = curr.next;
//            if (curr == null)
//                return head;
//            t = curr.next;
//            for (count = 1; count <= n && t != null;
//                 count++) {
//                Node temp = t;
//                t = t.next;
//                temp = null;
//            }
//
//            curr.next = t;
//            curr = t;
//        }/*
         Node t1=head;
		Node t2=head;
		int skip = 1;
		int del = 1;
		while(t2!=null) {
			if(skip == m) {
				if(del<=n) {
					Node t = t2.next;
					t2=t;
					del++;
				}
				del=1;
				skip=1;
				t1.next=t2;
				t1=t2;
			}else {
//				if(del==1)
				skip++;
				t1=t1.next;
				t2=t2.next;
			}
		}
        return head;
	}

}
