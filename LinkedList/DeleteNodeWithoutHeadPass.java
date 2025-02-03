package LinkedList;

import java.util.Scanner;

public class DeleteNodeWithoutHeadPass {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/delete-without-head-pointer/1

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
		int dataToDelete = sc.nextInt();
		Node del_node = findNodeToDelete(head, dataToDelete);
		System.out.println(del_node.data);
		deleteNode(del_node);
		while(head !=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	private static Node findNodeToDelete(Node temp, int x) {
		Node current = temp;
		while(current!=null) {
			if(current.data == x) {
				return current;
			}
			current =current.next;
		}
		return temp;
	}
	
	private static void deleteNode(Node delNode) {
//		Node current = temp;
		if(delNode == null) // If linked list is empty 
	      return; 
	    else{ 
	      if(delNode.next == null){ 
	        return; 
	      } 
	    } 
		delNode.data = delNode.next.data; 
		delNode.next = delNode.next.next; 
	}

}
