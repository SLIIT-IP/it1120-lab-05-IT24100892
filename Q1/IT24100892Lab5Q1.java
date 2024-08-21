import java.util.Scanner;
public class IT24100892Lab5Q1
{
	public static void main(String[]arg)
	{
		Scanner input = new Scanner (System.in);
		int num_1, num_2, num_3, min, max ;					//declare variables
		System.out.print("Enter the firt integer : ");				//user instructions to enter value
		num_1 = input.nextInt();						//tacking inputs from keyboard
		System.out.print("Enter the second integer : ");			//user instructions to enter value
		num_2 = input.nextInt();						//tacking inputs from keyboard
		System.out.print("Enter the third integer : ");				//user instructions to enter value
		num_3 = input.nextInt();						//tacking inputs from keyboard
		System.out.println("User entered numbers are : "+num_1 + " "+num_2 + " "+num_3);
		if (num_1 > num_2)							//logic to find greatest or smallest
		{
		max = num_1;
		min = num_2;
		}
		else
		{
		max = num_2 ;
		min = num_1 ;
		}
		if (num_3 > max)
		{
		max = num_3;
		}
		else 
		{
		min = num_3;
		}
		System.out.println("The Smallest number is : "+ min);			// display output
		System.out.println("The Largest numbrer is : "+max);
	}
}
