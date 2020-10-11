	/**
	 * 
	 * 
	 * This class is where the Fibonacci Recursive and its related methods are.
	 * The Goal of this class is to run a Fibonacci Recursive and record the time;
	 * 	
	 *  */

public class FibonacciRecursive {
	
	
	//variables
	private static long startTime;
	private static long endTime;
	//setters&getters
	/**
	 * This is a method retrieving the saved nanosecond time of the initial
	 * Fibonacci Recursive method.
	 * @return the initial nanosecond time in type long
	 */
	public static long getStartTime() {
		return startTime;
	}
	/**
	 * This is a method to set the initial time of the
	 * Fibonacci Recursive method.
	 * @param startTime is the passed <code>System.nanoTime()</code>
	 */
	public static void setStartTime(long startTime) {
		FibonacciRecursive.startTime = startTime;
	}
	/**
	 * This is a method retrieving the saved nanosecond time of the final 
	 * second of the Fibonacci Recursive method.
	 * @return the final nanosecond time in type long
	 */
	public static long getEndTime() {
		return endTime;
	}
	/**
	 * This is a method to set the final time of the
	 * Fibonacci Recursive method.
	 * @param endTime is the passed <code>System.nanoTime()</code>
	 */
	public static void setEndTime(long endTime) {
		FibonacciRecursive.endTime = endTime;
	}

	
	//recursive method
	/**
	 * This is the method for the Fibonacci Recursive
	 * 
	 * @param n is an int used as an index of the sequence
	 * @return the sum of the values in int of the function once it defines itself.
	 */
	public static int Recursive(int n)
	{
		
	    if (n == 0) {
	    	return 0;
	    }
	    
	    if (n == 1) return 1;
	    
	    return Recursive(n - 1) + Recursive(n - 2);
	}
	
	//time method
	/**
	 * This is the main method used that represents the use of the recursive method
	 * the setting of the time variables and as well as the totaling time it took.
	 * @param n a int value use for the number of index the recursive will have
	 * @return a long type value will be returned representing the total time efficiency the Fibonacci Recursive took.
	 */
	public static long finalTime(int n)
	{
		FibonacciRecursive.setStartTime(System.nanoTime());
		FibonacciRecursive.Recursive(n);
		FibonacciRecursive.setEndTime(System.nanoTime());
		return (FibonacciRecursive.getEndTime() - FibonacciRecursive.getStartTime());
		
	}
	
	
	
	
	
	/*
	 * old code
	public static void printStart()
	{
		System.out.println("-----Fibonacci recursion----");
		//	FibonacciRecursive.setStartTime(System.nanoTime());
	}*/
	

}
