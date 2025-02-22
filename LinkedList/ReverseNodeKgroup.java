package LinkedList;

import java.util.Scanner;

public class ReverseNodeKgroup {

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
		Node result = reverseGroup(head, 3);
		while(result!=null) {
			System.out.println(result.data);
			result=result.next;
		}
	}
	
	static Node reverseGroup(Node head, int k) {
		Node temp=head;
		Node prev=null;
		Node nextNode;
		while(temp!=null) {
			Node kthNode=findKthNode(temp, k);
			if(kthNode==null) {
				if(prev!=null) {
					prev.next=temp;
				}
				break;
			}
			nextNode = kthNode.next;
			kthNode.next=null;
			Node rev=revers(temp);
			if(temp==head) {
				head=rev;
			}else {
				prev.next=rev;
			}
			prev=temp;
			temp=nextNode;
		}
		return head;
	}
	static Node findKthNode(Node node, int k) {
		k--;
		while(node!=null&&k>0) {
			k--;
			node=node.next;
		}
		return node;
	}

	static Node revers(Node node) {
		Node next=null;
		Node c=node;
		Node pr =null;
		while(c !=null) {
			next = c.next;
			c.next=pr;
			pr=c;
			c=next;
		}
		return pr;
	}

}
