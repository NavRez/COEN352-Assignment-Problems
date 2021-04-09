package Problem_1_3_20_and_problem_1_3_27;


public class Node {

	protected int value;// intitalize a int value
	
	protected Node next;// creates a node pointer to the next node
	
	
	public Node() {//creates a node by setting the value to a negatibe and the next value to null
		
		value = -1;
		
		next = null;
		
	}
	
	public Node(int valtoenter, Node newnode) {// takes in a value ot enter and a newnode to point to next
		
		value = valtoenter;
		
		next = newnode;
		
	}
	
	
	
	public int getValue() {//getter of the int value
		return value;
	}

	public void setValue(int value) {//setter of the int value
		this.value = value;
	}

	
	
	
	
	
}

