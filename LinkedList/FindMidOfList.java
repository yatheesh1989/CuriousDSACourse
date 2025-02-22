package LinkedList;

import java.util.Scanner;

public class FindMidOfList {

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
		System.out.println(getMiddle(head));
	}
	
	static int getMiddle(Node head) {
//        Node temp = head;
//        int count =1;
//        while(temp.next !=null){
//            count++;
//            temp=temp.next;
//        }
//        System.out.println(count);
//        count=(count/2)+1;
//        System.out.println(count);
//        int i=1;
//        while(head!=null){
//            if(count ==i){
//                return head.data;
//            }
//            head=head.next;
//            i++;
//        }
//        return 0;
//		Node temp, temp1;
//        temp=head;
//        temp1=head.next;
//        while(temp1!=null && temp1.next!=null){
//            temp=temp.next;
//            temp1=temp1.next.next;
//        }
//        if(temp1==null){
//            return temp.data;
//        }
//		return temp.next.data;
		Node s=head;Node f=head;
		while(f!=null &&f.next!=null) {
			
			f=f.next.next;
			s=s.next;
		}
        return s.data;
    }

}
