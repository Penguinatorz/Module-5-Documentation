/**
 * This class Fibonacci Iterative represents the set of code for the Iterative methods and its relatable
 * 
 *
 */
public class FibonacciIterative {
	//variables
	private static long startTime;
	private static long endTime;
	/**
	 * This is a method retrieving the saved nanosecond time of the initial
	 * Fibonacci Iterative method.
	 * @return the initial nanosecond time in type long
	 */
	public static long getStartTime() {
		return startTime;
	}
	/**
	 * This is a method to set the initial time of the
	 * Fibonacci Iterative method.
	 * @param startTime is the passed <code>System.nanoTime()</code>
	 */
	public static void setStartTime(long startTime) {
		FibonacciIterative.startTime = startTime;
	}
	/**
	 * This is a method retrieving the saved nanosecond time of the final 
	 * second of the Fibonacci Iterative method.
	 * @return the final nanosecond time in type long
	 */
	public static long getEndTime() {
		return endTime;
	}
	/**
	 * This is a method to set the final time of the
	 * Fibonacci Iterative method.
	 * @param endTime is the passed <code>System.nanoTime()</code>
	 */
	public static void setEndTime(long endTime) {
		FibonacciIterative.endTime = endTime;
	}
	//Iterative method
	/**
	 * This is the method for the Fibonacci Iterative
	 * 	
	 * @param n is an int used as the limit to the iterations.
	 * @return the sum of the values that is stored in the int b once it finishes going through its n iterations.
	 */
	public static int Iterative(int n) 
    { 
        int a = 0, b = 1, c; 
        if (n == 0) 
            return a; 
        for (int i = 2; i <= n; i++) 
        { 
            c = a + b; 
            a = b; 
            b = c; 
        } 
        return b; 
    } 

	//time method
	/**
	 * This is the main method used that represents the use of the iterative method
	 * the setting of the time variables and as well as the totaling time it took.
	 * @param n a int value use for the number of index the recursive will have
	 * @return a long type value will be returned representing the total time efficiency the Fibonacci iterative took.
	 */
	public static long finalTime(int n)
	{
		FibonacciIterative.setStartTime(System.nanoTime());
		FibonacciIterative.Iterative(n);
		FibonacciIterative.setEndTime(System.nanoTime());
		return (FibonacciIterative.getEndTime() - FibonacciIterative.getStartTime());
	}

	
	/*old code
	 * public static void printStart()
	{
		System.out.println("\n-----Fibonacci iterative----");
		//FibonacciIterative.setStartTime(System.nanoTime());
	}*/
	
	
	
	
}
