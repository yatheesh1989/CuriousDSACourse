package LinkedList;

import java.util.Scanner;

public class SortListBy012 {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
		//Not completed
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
		Node result = sortLinkedList(head);
		while(result !=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	static 	Node sortLinkedList(Node head) {
		if (head == null || head.next == null) 
            return head; 

        // Create three dummy nodes to point to beginning of 
        // three linked lists. These dummy nodes are created to 
        // avoid null checks. 
        Node zeroD = new Node(0); 
        Node oneD = new Node(0); 
        Node twoD = new Node(0);

        // Initialize current pointers for three 
        // lists 
        Node zero = zeroD, one = oneD, two = twoD; 

        // Traverse list 
        Node curr = head; 
        while (curr != null) { 
            if (curr.data == 0) { 
                  
                // If the data of current node is 0, 
                // append it to pointer zero and update zero
                zero.next = curr; 
                zero = zero.next; 
            } 
            else if (curr.data == 1) { 
                  
                // If the data of current node is 1, 
                // append it to pointer one and update one
                one.next = curr; 
                one = one.next; 
            } 
            else { 
                  
                // If the data of current node is 2, 
                // append it to pointer two and update two
                two.next = curr; 
                two = two.next; 
            } 
            curr = curr.next; 
        } 

        // Combine the three lists
        zero.next = (oneD.next != null) ? (oneD.next) : (twoD.next); 
        one.next = twoD.next; 
        two.next = null; 
          
        // Updated head 
        head = zeroD.next; 
        return head; 
    } 
}
