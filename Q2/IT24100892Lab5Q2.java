import java.util.Scanner;
public class IT24100892Lab5Q2
{
	public static void main(String[]arg)
	{
		Scanner input = new Scanner (System.in);
		int num ;
		System.out.print("Enter the number of new members introduced : ");		//user instructions
		num = input.nextInt();								//tacking input from keyboard
		

		if (num >= 0)									//if introduced people is higher than or equal 0 then this will execute
		{
		switch(num)									//declare output to every scenario
		{
		case 0 : System.out.println("\nNo Prize");
			break;
		case 1 : System.out.println("\nPrize is : Pen");
			break;
		case 2 : System.out.println("\nPrize is : Umbrella");
			break;
		case 3 : System.out.println("\nPrize is : Bag");
			break;
		case 4 : System.out.println("\nPrize is : Travelling Chair");
			break;
		default : System.out.println("\nPrize is : Headphone");
			break;
		}
		return;
		}
		else										//if not this going to be execute
		{
		System.out.println("Input must be a number 0 or greater");
		}
	}
}