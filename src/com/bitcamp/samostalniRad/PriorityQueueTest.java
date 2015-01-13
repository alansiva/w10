package com.bitcamp.samostalniRad;

/*
 *  Priority Queue test class
 */

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue sta = new PriorityQueue();

		/* testing 'push' method' */

						//Priority:
		sta.push(2,8);  
		sta.push(4,3);	// (last)	
		sta.push(6,7);	
		sta.push(2,9);	// (first)
		sta.push(3,9);	

		System.out.println("Peek" + sta.peek());
		
		if(sta.contains(7)){
			System.out.println("Contains ");
		}else System.out.println("No such value");
		
		/*Getting size of the list*/
		
		System.out.println("\nQueue size: " + sta.getSize());
		
		/* testing 'pop' method 
		 * if queue gets empty, method throws 
		 * illegal state exception with message "Empty queue"*/
		
		System.out.println("\n"+sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		System.out.println(sta.pop());
		
		/*Getting size of the list after last pop*/
		
		System.out.println("\nQueue size: " + sta.getSize());
		
		/* Checking if list is empty */
		
		if (sta.isEmpty()){
			System.out.println("Empty queue");
		}

	}

}
