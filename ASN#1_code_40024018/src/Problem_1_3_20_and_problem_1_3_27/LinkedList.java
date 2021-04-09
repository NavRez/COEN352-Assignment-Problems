package Problem_1_3_20_and_problem_1_3_27;


public class LinkedList {

	protected Node head;//creates head node
	
	protected Node tail;//creates tail node
	
	public LinkedList() {//sets head and tail to null
		
		head = null;
		tail = null;
		
	}
	
	
	public boolean isEmpty() {//checks to see if the the linkedlist is empty, return false otherwise
		
		if(head == null) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public void add(int val) {//adds a number (val) to a linkedlist 
		
		Node addnode = new Node(val,null);//creates a new node to hold the value 
		Node current = head;// creates a pointer to the head
		
		if(isEmpty()) {//if the list is empty then set head to the addnode
			
			head = addnode;
			
		}
		else {
			
			Node hold = current;//creates a new pointer to the current value
			
			while(current != null) {//loops until the current pointer is null
				
				current = current.next;
				
			}
			
			current = addnode;// sets the currnet pointer to the addnode
			
			while(hold.next != null) {//loops through the hold nod until the next node is null
				
				hold = hold.next;
				
			}
			
			hold.next = current;//makes the next pointer of the hold array equal to current
			
			tail = hold.next;// sets the tail to the next pointer of hold
			
			
		}
		
		
	}
	
	
	public void remove() {//removes the node 
		
		Node curr = head;//creates a current pointer that points to the head
		
		if(isEmpty()) {//if empty returns error message
			
			System.out.print("Error- Empty LinkedList");
			
		}
		else {
		
	if(curr.next != null) {//checks to see if the current pointer is not pointing to an empty Node
		while(curr.next.next!=null) {//loops to until the pointer after the pointer the current pointer is pointing to is empty
			
			curr = curr.next;// moves the curr pointer to the next pointer
			
			}
		
				tail = curr;// sets tail to the current pointer 
		
				tail.next = null;//sets the next pointer as null
			}else {// if the head is the only non-empty pointer, erase the head
				
				head = null;
			}
		
		}
		
	}
	
	public void display() {//displays the linkedlis's values in order
		
		Node curr = head;// points to head
		
		while(curr!=null) {//loops through pointer until is null
			
			System.out.print(" " + curr.value);//outputs the value of the current node
			
			curr = curr.next;//points to next node
			
			
		}
		
		
	}
	
	
	public void delete(int k) {//deletes the k'th value of the array assuming the head is k = 1
		
		Node reference = new Node();//creates a reference node
		
		int num = 1;// sets the num counter to 1
		
		Node curr = head;
		
		
		if(k==1) {// if k = 1, delete head
			
			head = head.next;
			
		}
		else {
		
		while(num != k +1) {//loops as long as the counter is not equal to k+1
			
			
			
			
			if (num == k-1) {// if the counter reaches  k-1, the reference points to the current pointer
				
				reference = curr;
			}
			else if(num == k) {//if the counter is equal to k
				
				if(tail == curr) {// checks to see if the tail is the current poinbter
					
					tail = reference;//sets tail to the reference pointer
					
				}
				
				reference.next = curr.next;//sets the next value of reference (k-1) as the node that comes after k, so the k +1 th' node 
				break;//break loop
				
			}
			else if(curr == null) {// if the current pointer is null, the looping ends and there are no values to delete
				
				System.out.println("Error- out of bounds");
				break;
			}
			curr = curr.next;// point to next node until the k'th is or is not found
			num++;//increase counter
		}
	}
		
		
		
		
	}
	
	public void max() {//max node from problem
		
		int bigval = 0;
		Node curr = head;
		
		if(isEmpty()) {//if the node is empty then return 0
			
			System.out.println(0);
		}else {
			
			while(curr != null) {//loops through the linkedlist
				
				if(bigval < curr.value) {//checks to see if the value of the current node is bigger than bigval
					
					bigval = curr.value;//if so, bigaval is now set to that current value 
				}
				
				curr = curr.next;//moves to the next pointer
			}
			
			System.out.println("\nThe greatest value is " + bigval);//outputs the greatest value
			
		}
		
	}
	
}
