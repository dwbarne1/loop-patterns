import java.util.Scanner;
public class Loops 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Part 1 - Odd Numbers");
		
		for(int i = 1; i <= 20; i += 2) 
		{
			System.out.printf("%d ", i);
		}
		// end for loop
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part 2 - Even Numbers");
		
		int counter = 1;
		
		while(counter <= 20)
		{
			
			if(counter % 2 == 0) 
			{
			System.out.printf("%d ", counter);
			}
			
			counter++;
			
		}
		// end while loop
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part 3 - factorial");
		
		int factorialNumber = 0;
		// To be input by the user
		int factorialResult = 1;
		// Will be used in the next for loop to acquire the final factorial value
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number for the factorial: ");
		factorialNumber = Integer.parseInt(scan.nextLine());
				
		for(int i = factorialNumber; i >= 1; i--)
		{
			factorialResult *= i;
		}
		// end for loop
		
		System.out.printf("The factorial is %d ", factorialResult);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part 4 - Triangle");
		
		// The following nested for loop prints a triangle starting with ten asterisks on top.
		for(int col = 0; col < 10; col++)
		{
			
			for(int row = 10; row > col; row--)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}
		// end nested for loop
		
		System.out.print("\nPress Enter for next page...");
		scan.nextLine();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part 5 - Average calculator");
		
		System.out.println("\nThis program will ask you to enter 2 scores each for 3 students.\n");
		
		double studentScore = 0;
		double combinedScore = 0;
		double average = 0;
		// All three variables to be utilized in the following nested for loop
		
		// This following nested for loop takes in each student score and calculates the average of all the student scores combined.
		for(int student = 1; student <= 3; student++)
		{
			
			for(int score = 1; score <= 2; score++) 
			{
				System.out.printf("Student %d, score %d: ", student, score);
				studentScore = Double.parseDouble(scan.nextLine());
				combinedScore += studentScore;
				
				if(student == 3 && score == 2)
				{
					average = combinedScore/(student*score);
				}
			}
					
		} // end nested for loop
		
		System.out.printf("\nThe average of all scores is %.2f ", average);
		
		System.out.print("\n\nPress Enter for next page...");
		scan.nextLine();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Part 6 - Multiplication Table\n");
		
		int multTableResult = 0;
		
		// The following nested for loop prints a multiplication table, with the first set of values from 5 to 10 and the second set from 10 to 50 counting by tens.
		for(int i = 5; i <= 10; i++)
		{
			
			for(int j = 10; j <= 50; j += 10)
			{
				multTableResult = i * j;
				System.out.printf("%5d * %d = %5d\n", i, j, multTableResult);
			}
			
			System.out.println("");
			
		} // end nested for loop
		
		System.out.print("Press Enter to exit...");
		scan.nextLine();
		
		scan.close();
		
	}

}
