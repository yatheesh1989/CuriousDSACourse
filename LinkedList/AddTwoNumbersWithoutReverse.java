package LinkedList;

import java.util.Scanner;

public class AddTwoNumbersWithoutReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = null;
		Node move1 = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			if(head1 == null) {
				head1 = new Node(sc.nextInt());
				move1=head1;
			}else {
				Node temp = new Node(sc.nextInt());
				move1.next=temp;
				move1=temp;
			}
			n--;
		}
		
		Node head2 = null;
		Node move2 = null;
		Scanner sc2 = new Scanner(System.in);
		int n2 = sc2.nextInt();
		while(n2>0) {
			if(head2 == null) {
				head2 = new Node(sc2.nextInt());
				move2=head2;
			}else {
				Node temp1 = new Node(sc2.nextInt());
				move2.next=temp1;
				move2=temp1;
			}
			n2--;
		}
//		int l1_count=getCount(head1);
//		int l2_count=getCount(head2);
//		System.out.println(getCount(head1));
//		System.out.println(getCount(head2));
//		System.out.println(getNodePosition(head1, 1, l1_count).data);
		addTwoNumbers(head1, head2);
		
	}
	
	public static Node addTwoNumbers(Node l1, Node l2) {
		Node sumNode = null;
		int l1_count=getCount(l1);
		int l2_count=getCount(l2);
		int carry=0;
		int position=1;
		while(position <= l1_count || position <= l2_count || carry!=0) {
			int sum = getNodePosition(l1,position, l1_count) + getNodePosition(l2,position, l2_count) +carry;
			Node result = new Node(sum%10);
			if(sumNode==null) {
				sumNode=result;
			}else {
				result.next=sumNode;
				sumNode=result;
			}
			carry=sum/10;
			position++;
		}
        return sumNode;
    }
	public static int getCount(Node node) {
		int count=0;
		Node temp=node;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}
	public static int getNodePosition(Node node, int p, int countTotal) {
		if(p>countTotal) {
			return 0;
		}
		Node s=node;
		Node temp = node;
		for(int i=1;i<=countTotal;i++) {
			if(i==p) {
				while(temp.next!=null) {
					s=s.next;
					temp=temp.next;
				}
				return s.data;
			}
			temp=temp.next;
		}
		return 0;
	}

}
