package Problem_1_3_9;

/**
* @author Navid Reza
* ProbThree is a class that tackles problem 1.3.9 of the questions in Algorithms 4th edition
* It uses a few functions for the bulk of its work
*/

import java.util.*;
public class ProbThree {

	public static void main (String [] args) {
		/**
		 * NOTE : for the incomplete mathematical formula [[[[ as in 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) ) ]]]], it is necessary to put a space between each input in the eclipse command prompt
		 * IMPORTANT : it is vital to write the symbol * as '*' with single quotation marks, not doing so will not allow the program to compile
		*/
		
		fixer(args); //uses the args inputed through command prompt to fix the brackets
	
	}
	
	
	public static void fixer(String [] array) {
		
		int parancount = 0;//counts the number of paranthesis
		int anothercount = 0;//counts the number of paranthesis to check if it is appropriate to add another one 
		int thirdcount = 0;
		for (int i = array.length - 1; i > -1; i--) {
			
			if(array[i].equals(")")) {//check to see if leftmost side is a )
				parancount++;//increase paranthesis counter 
				
				if(array[i].equals(")") && array[i-1].equals(")")) {// check to see if there are two ')'
					
					anothercount++;// incremet counter if so
				}
				
			}
			else if(isnumer(array[i]) && array[i-2].equals(")")) {// if not check if aaray[i] is a number and two th
				
				array[i] = "( " + array[i];//puts a column on the right side of the array[i]
				parancount--;//increase the paranthesiscount
				thirdcount++;//tracks values for outer paranthesis
				
				if(thirdcount >= 2 && parancount > 0) {//if thirdcount is greater than 2 and the paranthesis is greater than zero, add a paranthesis and add respective counters
					
					array[i] = "( " + array[i];
					parancount--;
					anothercount--;
					thirdcount++;
					
				}
				
			}
			else {
				
				if((i-1) == 0 && parancount > 0) {//if none of those conditions are ture, just add a paranthesis
					
					while (parancount != 0) {
						
						array[i-1] = "( " + array[i-1];
						parancount--;
						
					}
				}
				
			}
			
			
		}
		
		
		
		for (int i = 0; i < array.length; i++ ) {//checks to see if there is a '*' in the input, and changes outputs it as *
			
			String val = "'*'";
			
			if(array[i].equals(val)) {
				
				array[i] = "*";
				
				System.out.print("*" + " ");
				
			}
			else {
			
			System.out.print(array[i] + " ");
			}
		}
		
		
	}
	
	public static boolean isnumer (String number) {// checks to see if arg is a number
		
		try {
			
			int value = Integer.parseInt(number);//tries to convert srting to number
			
		}
		catch(NumberFormatException error) {
		
	
			return false;//returns false if it couldn't 
			
	}
		
		
		return true;// return true if the string is a number
		
	}
	
}
