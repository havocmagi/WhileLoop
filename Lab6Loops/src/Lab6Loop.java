import java.util.Scanner;
//
// Import the class that holds the min and max integer values.
public class Lab6Loop
{
		public static void main( String args [] )
		{
			/*
		1. Initialize variables for the:
		a. “count”,
		b. minimum,
		c. maximum,
		d. running sum.
		2. Write a while-loop to prompt for each score:
		If the score is not the exit or stop string, then
		a. Count it.
		b. Sum it.
		c. Check to determine if it is the minimum.
		d. Check to determine if it is the maximum.
		4. Compute the Average. This is not part of the loop.
		5. Display your results.
		*/
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int count = 0;
		System.out.print("Enter score from 0 to 100 or 'stop' to exit: ");
		String input = console.next();
		while(!input.equalsIgnoreCase("stop"))
		{
			sum += Integer.parseInt(input);
			++ count;
			if(Integer.parseInt(input)<min)
			{
				min=Integer.parseInt(input);
			}
			if(Integer.parseInt(input)>max)
			{
				max=Integer.parseInt(input);
			}
			System.out.print("Enter score from 0 to 100 or 'stop' to exit: ");
			input = console.next();
		}
		System.out.println("Count is = " + count);
		System.out.println("Sum is = " + sum);
		double avg = ((double)sum)/count;
		System.out.println("Average is = " + avg);
		System.out.println("Minimum is = " + min);
		System.out.println("Maximum is = " + max);
		}
}