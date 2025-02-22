package LinkedList;

import java.util.Scanner;

public class ReverseListII {

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
		Node result = reverseBetween(head, 3, 3);
		while(result!=null) {
			System.out.println(result.data);
			result=result.next;
		}
		
	}
	public static Node reverseBetween(Node head, int left, int right) {
        Node temp1=head;
        Node temp2=null;
        Node move = head;
        Node pre = null;
        Node next = null;
        Node rev=null;
        int count=0;
        while(temp1!=null){
            count++;
            if(count==left){
                temp2=temp1;
                while(temp2!=null){
                    if(count==right){
                        next = temp2.next;
                        temp2.next=null;
                        rev=reveseList(temp1, next); 
                        break;
                    }else{
                        temp2=temp2.next;
                    }
                    count++;
                }
                break;
            }else{
                pre= temp1;
                temp1=temp1.next;
            }
        }
        if(pre!=null){
        	while(move!=pre) {
        		move=move.next;
        	}
        	move.next=rev;
            return head;
        }else {
        	head=rev;
        }
        return head;
    }

    public static Node reveseList(Node t, Node nextN){
        Node prev=nextN;
        Node front=null;
        Node temp=t;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }

}
