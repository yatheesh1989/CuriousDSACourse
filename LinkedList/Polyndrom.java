package LinkedList;

import java.util.Scanner;

public class Polyndrom {
	public static void main(String[] args) {
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
		System.out.println(isPalindrome(head));
	}
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head, fast = head;

        while (fast.next != null 
               && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = reverseList(slow.next);
        slow.next = null;

        boolean ret = isIdentical(head, head2);

        head2 = reverseList(head2);
        slow.next = head2;

        return ret;
    }

    static Node reverseList(Node head) {
    	Node prev = null;
    	Node curr = head;
    	Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to check if two lists are identical
    static boolean isIdentical(Node n1, Node n2) {
        while (n1 != null && n2 != null) {
            if (n1.data != n2.data)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }
}
