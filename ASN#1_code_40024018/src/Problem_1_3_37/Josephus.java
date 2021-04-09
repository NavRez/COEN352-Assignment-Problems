package Problem_1_3_37;

import java.util.*;
/**
 *This is the Josephus problem, 1.3.37
 *enter two numbers in the command prompt separated by a space
 */
public class Josephus {



	
	public static void main(String [] args) {

		
		int num1 = Integer.parseInt(args[0]);//sets the first command line input to an int
		int num2 = Integer.parseInt(args[1]);//same but for second command line input
		
		Queue q = new Queue(num1);// creates a new queue of the size of the first input of the command line
		
		while(q.getSize() != 0) {//loops until the size of the queue is zero
			
			System.out.print(q.deQueue(num2 - 1) + " ");//outputs the josephus problem
			
		}
		
		
	}
	
}
