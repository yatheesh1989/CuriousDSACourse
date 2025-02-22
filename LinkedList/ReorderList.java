package LinkedList;

import java.util.Scanner;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		Node move = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			if(head == null) {
				head = new Node(sc.nextInt());
				move=head;
			}else {
				Node temp = new Node(sc.nextInt());
				move.next=temp;
				move=temp;
			}
			n--;
		}
		Node result = reorderList(head);
		while(result!=null) {
			System.out.println(result.data);
			result=result.next;
		}
	}
	
	public static Node reorderList(Node head) {
        Node mid = findMiddle(head);
        Node afterMidRevd = reversrMiddle(mid.next);
        mid.next=null;
        Node c1 = head;
        Node c2 = afterMidRevd;
        Node f1 = null;
        Node f2 = null;
        while(c1!=null && c2!=null) {
        	f1=c1.next;
        	f2=c2.next;
        	c1.next = c2;
            c2.next = f1;
            
            c1 = f1;
            c2 = f2;
        }
        return head;
    }

    public static Node findMiddle(Node head){
        Node s=head;Node f=head.next;
		while(f!=null &&f.next!=null) {
			
			f=f.next.next;
			s=s.next;
		}
        return s;
    }
    public static Node reversrMiddle(Node mid){
        Node pre = null; Node temp=mid;
        while(temp!=null){
            Node front = temp.next;
            temp.next=pre;
            pre=temp;
            temp=front;
        }
        return pre;
    }

}
