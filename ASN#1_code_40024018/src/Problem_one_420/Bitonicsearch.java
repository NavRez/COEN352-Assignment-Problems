package Problem_one_420;


public class Bitonicsearch {

	
	protected static int [] array = {1,2,3,4,5,-1,-2,-3,-4,-5,-6,-7};//random bitonic array
	
	public static void main(String [] args) {
		
		System.out.println(binarybitoner());// this is a test of the bitonic finder
		
		binarysearch(-7,binarybitoner());// this is a test of a binary search in a bitonic array
	}

	
	static int binarybitoner() {//this is used to find the bitonic point, the point that is in between the increase and decrease
		
		int left = 0;// sets left to first index of array
		int right = array.length -1;// // sets right to last index of array
		int mid = (left+right)/2;//sets midpoint values
		
		while (array[mid-1] > array[mid] || array[mid] < array[mid + 1]) {// checks to see if array[mid] is bitonic
			
			if (array[mid-1] > array[mid]) {// if the midpoint is smaller than the left value
				
				right = mid;//sets the right value as the midpoint
				mid = (left+right)/2;//reset the value of the midpoint
				
			}
			else {// if the midpoint is greater than the left value
				
				left = mid;//sets the left value to the midpoint
				mid = (left+right)/2;//reset the value of the midpoint
				
			}
			
			
			if(array[mid-1] <= array[mid] && array[mid] >= array[mid + 1]) {//if the midpoint is found, return it
				
				return mid;
			}
			
			
		}
		
		return mid;//returns midpoint, created initially to prevent error problems
	}
	
	static void binarysearch(int tosearch,int num) {// takes an integer number (not the index , the actual number) and the index of the bitonic point (num)
		int mycounter = 0;// sets a counter to zero
		
		
		int left = 0;// sets left to first index of array
		int right = array.length -1;// // sets right to last index of array
		int mid = num;// sets the midpoint to the bitonic index
		
		if(tosearch > array[num]) {//checks to see if the number is greater than the bitonic one
			
			System.out.println("Doesn't exist");// if so the number can't exist
		}
		else {
			
			if(tosearch == array[num]) {// if the bitonic value is the search value, out put nuumber
				
				System.out.println("Number " + tosearch + " found");
			}
			else {
			boolean found = false;//sets the found bool to false
			right = mid -1;// sets the right value to mid-1 
			int val = logbase2(mid);// sets a counter refernce val as the log base 2 value of 0 to mid
			mid = (left+right)/2;// sets the newmidpoint
			
			//this loop checks the left side of the array
			while (mycounter != val) {// if the counter is not equal to Log(mid)
				
				if(tosearch == array[mid]) {// if the bitonic value is the midpoint, outputs it and sets found to true, break loop
					
					System.out.println("Number " + tosearch + " found");
					found = true;
					break;
				}
				
				if(tosearch > array[mid]) {// if the value to search for is greater than the midpoint
					
					left = mid +1;//set left to mid -1
					mid = (left+right)/2;// reset midpoint
				
				}
				else if(tosearch < array[mid]) {// if the value to search for is smaller than the midpoint
					
					right = mid -1;//set left to mid -1
					mid = (left+right)/2;// reset midpoint
					
				}
				
				mycounter++;
			}
			
			
			mycounter = 0;//sets the found bool to false
			right = array.length - 1;// sets the right value to array length-1 
			left = num + 1;// sets the leftt value to the bitonic index plus 1
			mid = (left+right)/2;// sets midpoint
			val = logbase2(right - left);// sets log base 2 as the difference between right and left
			
			
			//this loop checks the right side
		while (mycounter != val && found == false) {// if the counter is not equal to Log(mid) and the found value is false
				
				if(tosearch == array[mid]) {// if the bitonic value is the midpoint, outputs it and sets found to true, break loop
					
					System.out.println("Number " + tosearch + " found");
					found = true;
					break;
				}
				
				if(tosearch > array[mid]) {// if the value to search for is greater than the midpoint
					
					right = mid - 1;//set right to mid +1
					mid = (left+right)/2;
				
				}
				else if(tosearch < array[mid]) {
					
					left = mid +1;//set left to mid +1
					mid = (left+right)/2;
					
				}
				
				mycounter++;//increments counter
			}
			
			
			
			
		if(mycounter == val && found == false) {//if the counter is equal to the initial log value and found isn't true
			
			System.out.println("Number " + tosearch + " not found");// output not found
			
		}
			
			
			}			
			
			
			
			
		}
		
		
	}
	
	
	static int logbase2(int n) {//returns the log base 2 value of a number n
		
		int count = 0;//sets counter to 0
		
		while (n != 0) {// divide n by 2, increase counter until n = 0
			
			n = n/2;
			count++;
			
		}
		
		return count;//return the counter, which is now log base 2
		
	}
	
}
