package LinkedList;

import java.util.Scanner;

public class RemoveEveryKthElement {

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
		Node result = sortedInsert(head, 19);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	static Node removeEveryKthNode(Node head, int k) {
		Node p =null;
		Node c=head;
		int count =0;
		while(c!=null) {
			count++;
			if(count == k) {
				p.next=c.next;
				count=0;
			}
			if(count!=0) {
				p=c;
			}
			c=p.next;
		}
		return head;
	}
	
	static Node sortedInsert(Node head, int key) {
		if(head==null) {
			return head=new Node(key);
		}
        // Add your code here.
        Node prev = null;
        Node current = head;
        while(current !=null){
            if(current.data >= key){
            	 Node temp = new Node(key);
                 temp.next=current;
                 if(prev!=null) {
                     prev.next=temp;
                     return head;
             	}
                 return head=temp;
            }else{
                prev =current;
                current = current.next;
            }
            
        }
        Node temp = new Node(key);
        prev.next=temp;
        
        return head;
    }

}
