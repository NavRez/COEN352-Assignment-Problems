package Problem_1_4_12;

import java.util.*;

/**
 *This portion tackles problem 1.4.12
 *It creates two arrays in one of the methods and depends entirely on the user's input (array1 and array2) 
 */

public class Fourtwelve {

	
	
	
	public static void main(String [] args) {
		

		solvearray();//solves array problem
		
	}
	
	public static void solvearray() {// merges two arrays in order
		
		int [] array1 = {1,3,5,7,9,11,13,15,17}; // creates randome sorted array 1
		int [] array2 = {2,4,6,8,10,12,14,9999}; // creates random sorted array 2
		
		int []  ar = newarr(array1,array2);// merges array
		
		for (int i = 0; i < ar.length; i++) {// loops through array and outputs values 
			
			System.out.print(ar[i] + " ");
		}
	}
	
	public static int [] newarr(int [] a1, int [] a2) {// takes in two arrays and conducts merging operation
		
		int startl = 0;//sets the start of the left array to 0
		int startr = 0;//sets the start of the right array to 0
		int [] newarray = new int [a1.length + a2.length];// creates a new array that has a size equal to the sum of both arrays
		
		
		for(int i = 0; i < newarray.length; i++) {//loops through through the newly created array
			
			if(startr == a2.length) {// if array2 is empty, just put in everything from array 1
				
				newarray[i] = a1[startl++];
			}
			else if(startl == a1.length) {// if array1 is empty, just put in everything from array 2
				
				newarray[i] = a2[startr++];
			}
			else if(a1[startl] <= a2[startr] ) // if the content of array 1 is smaller than array two, insert the value of array 1 to the new array
			{
				
				newarray[i] = a1[startl++];
			}
			else {// if the content of array 2 is smaller than array one, insert the value of array 2 to the new array
				
				newarray[i] = a2[startr++];
			}
			
			//increment the startl or startr of each respective array everytime the respective if statement is triggered
		}
		
		
		
		return newarray;// return the new array
	}
	
	
}
