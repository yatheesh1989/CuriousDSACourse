package LinkedList;

import java.util.Scanner;

public class MergeTwoLL {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // Node list1 = createLL(N, sc);
        Node head = null;
        Node temp = null;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        while(j<N){
                if(head==null) {
                    head = new Node(arr[j]);
                    temp=head;
                }else {
                    Node temp1 = new Node(arr[j]);
                    temp.next = temp1;
                    temp = temp1;
                }
            j++;
        }
        Node head1 = null;
        Node tempk = null;
        int K = sc.nextInt();
        int[] arr1 = new int[K];
        for(int i=0;i<K;i++){
            arr1[i]=sc.nextInt();
        }
        int j1=0;
        while(j1<K){
                if(head1==null) {
                    head1 = new Node(arr1[j1]);
                    tempk=head1;
                }else {
                    Node temp2 = new Node(arr1[j1]);
                    tempk.next = temp2;
                    tempk = temp2;
                }
            j1++;
        }
        // Node list2 = createLL(K, sc);
        Node result = sortList(head, head1);
        while(result!=null){
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
    static Node sortList(Node head1, Node head2){
        Node move=null;
        Node correct = null;
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                if(correct == null){
                    correct = new Node(head1.data);
                    move=correct;
                }else{
                    Node node = new Node(head1.data);
                    move.next=node;
                    // correct=move;
                    move=node;
                }
                head1=head1.next;
            }else{
                if(correct == null){
                    correct = new Node(head2.data);
                    move=correct;
                    // correct = node;
                }else{
                    Node node = new Node(head2.data);
                    move.next=node;
                    // correct=move;
                    move=node;
                }
                head2=head2.next;
            }
        }
        while(head1!=null) {
        	Node node = new Node(head1.data);
            move.next=node;
            move=node;
            head1=head1.next;
        }
        while(head2!=null) {
        	Node node = new Node(head2.data);
            move.next=node;
            move=node;
            head2=head2.next;
        }
        return correct;
    }
}
