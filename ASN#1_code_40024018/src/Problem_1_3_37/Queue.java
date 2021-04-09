package Problem_1_3_37;

public class Queue {
	
	protected int head; //head of queue
	protected int tail;// tail of queue
	protected int [] arry;//array to hold values
	protected int size;// size of queue
	protected int retainindex;//retains previous index from the "dequeue"
	
	public int getSize() {//returns the size of the queue
		return size;
	}

	protected int counter;
	
	
	public Queue(int siz) {//takes in an input and makes it the sizw of the queue
		
		arry = new int [siz];//creates an array of size "siz"
		
		for(int i = 0; i < arry.length; i++) {//fills the array with its respective index (0 to N-1)
			
			arry[i] = i;
			
		}
		
		size = siz;// sets the size to "siz"
		
		head = 0;//sets the head to zero
		
		tail = arry.length - 1;// sets the tail to the last number of the arrat
		counter = 0;
		retainindex = 0;
	}
	
	public int deQueue(int num) {
		
		int hold = 0;//intitialized for later use
		
		for(int i = 0; i < size; i++) {// loop until i s equal to size-1
			
			if(num == size && (retainindex == 0 || retainindex == size -1)) {// checks to see if the input num is equal to the size and if the index is placed in the end or the front of the remaining array
				
				
				hold = arry[retainindex];//if so holds on to the last array at the last returned index
				
				if(retainindex +1 == size) {// if the last index returned is equal to the size of the array
					
					arry[retainindex] = -1;// erase that index value
					retainindex = retainindex -1;// reset the index to the value just before it
					break;
					
				}else {
					
					for(int j = (retainindex)%size ; j < size; j++) {//loop from the modulo of the last index returned to the size
						
						
						
						if(j < size-1) {// shift each value from j to size-1 towards the left
						arry[j] = arry[j+1];
						}					
						
					}
					
					arry[size -1] = -1;
					break;
					
				}
				
			}
			else if(i == (num+retainindex)%size ) {
				
				
				
				hold = arry[i];//hold on to the array at index i
				retainindex = i;// sets the last index returned to i
				
				
				
				for(int j = (retainindex)%size ; j < size; j++) {//loop from the modulo of the last index returned to the size
					
					
					
					if(j < size-1) {// shift each value from j to size-1 towards the left
					arry[j] = arry[j+1];
					}					
					
				}
				
				arry[size -1] = -1;// eliminates the last input of the array
				
				break;//breaks loop
			}
			
		}
		
		
		size--;// decrease size after dequeue
		counter+=num;
		
		return hold;//returns the number that was deleed
		
	}
	
}