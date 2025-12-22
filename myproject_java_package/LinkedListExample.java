package myproject_java_package;

public class LinkedListExample {
class Node{
	int data;// data
	Node next;// pointer
	
	Node(int data){
		this.data=data;// stores the value
		this.next=null;// next initial empty
	}
}
	
	Node head;// node fixed to be at head
	
	void insertAtBeginning(int data) {
		Node newNode = new Node(data);//create a new node
		newNode.next = head;// new node's next -> current node
		head = newNode;// move head pointer to new node
	}
	
	void insertAtEnd(int data) {
		Node newNode = new Node(data);// create a new node
		if(head==null) {// if head equals to null = newNode
			head = newNode;
			return;
		}
		// traverse to last node (where newt = null)
		// attach new node at the end 
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//delete
	// case 1 : delete head node
	// if head contains the key
	// head = head.next
	// case 2 : delete middle or last
	// keep two pointers 
	// temp -> current node
	// prev -> previous node
	// when key found 
	// node gets removed from the chain
	void delete(int key) {
		Node temp = head,prev = null;
		if(temp!=null && temp.data==key) {
			head = temp.next;
			return;
		}
		
		while(temp!=null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp==null) {
			System.out.println("Element not found");
			return;
		}
		prev.next = temp.next;
	}

	//SEARCHING AN ELEMENT
	
	// Start from head
	// Traverse node by node
	// If match found -> return true
	// If traversed entire list and not found the element -> return false
	
	boolean search(int key) {
		Node temp = head;
		while(temp!=null) {
			if(temp.data==key) {
				return true;
			}
		}return false;
	}
	
	// length of the list
	int length() {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	//display list
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data +" -> "); 
			temp = temp.next;
		}
		System.out.println("null");
		
	}
	// reverse a list
	void reverse() {
		Node prev = null,curr = head,next;
		while(curr!=null) {
			next = curr.next; // Save next
			curr.next = prev; // Reverse pointer
			prev = curr; // Move prev forward 
			curr= next; // move curr forward
			head = prev;
		}
	}

		public static void main(String[] args) {
			LinkedListExample list = new LinkedListExample();
			list.insertAtBeginning(10);
			list.insertAtBeginning(20);
			list.insertAtEnd(40);
			list.insertAtEnd(50);
			list.display();
			list.reverse();
			list.display();
			list.delete(20);
			list.display();
		
	}

	}








