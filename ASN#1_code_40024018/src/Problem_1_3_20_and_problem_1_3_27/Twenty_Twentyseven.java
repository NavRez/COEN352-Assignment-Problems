package Problem_1_3_20_and_problem_1_3_27;
import java.util.*;

/**
 *@author N_REZ
 * This portion of the code deals with problems 1.3.20 and 1.3.27
 * below is a linked list with various numbers added to it, the delete and max functions are doing what thge problems asked them to
 * try it out yourself, simply compute list.add(value), where value is a number you choose, then delete (value) and use max() to find the greatest value 
 */

public class Twenty_Twentyseven {

	public static void main(String [] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(56);
		list.add(92);
		list.add(45);
		list.add(7);
		list.add(7);
		list.add(78);
		list.add(798);
		list.add(912);
		list.display();
		System.out.println();
		list.remove();
		list.display();
		System.out.println();
		list.delete(7);
		list.display();
		list.max();
		
	}
}
