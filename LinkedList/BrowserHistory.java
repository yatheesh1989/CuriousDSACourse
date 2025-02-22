package LinkedList;

public class BrowserHistory {
	String homePage=null;
	Node head=null;
	Node current=null;
	int size;

	public BrowserHistory(String homepage) {
        this.homePage=homepage;
        this.size=0;
        head=new Node(this.homePage);
        current=head;
    }
    
    public void visit(String url) {
        Node visit = new Node(url);
        current.next=visit;
        visit.prev=current;
        current=visit;
        size+=1;
        System.out.println("Im at "+current.url);
    }
    
    public String back(int steps) {
    	while(steps>0) {
    		if(current.prev!=null)
    			current=current.prev;
    		steps--;
    	}
    	return current.url;
        
    }
    
    public String forward(int steps) {
    	while(steps>0) {
    		if(current.next!=null)
    			current=current.next;
    		steps--;
    	}
    	return current.url;
    }
    
    private class Node{
    	Node next=null;
    	Node prev=null;
    	String url;
    	
    	Node(String url){
    		this.url=url;
    	}
    }
}


