import java.util.Scanner;
public class IT24100892Lab5Q3
{
	public static void main(String[]arg)
		{
		double end, start, noofdays, amount, discount ;							//declare variables

		final double chargeperday = 48000 ;								//declare constants
		final double payment_3to4 = 0.1;
		final double payment_5tomore = 0.2;
		
		Scanner input = new Scanner(System.in);								

		System.out.print("Enter Start Date (1-31): ");							//user instructions
		start = input.nextInt();									// tacking inputs from keyboards
	
		System.out.print("Enter End Date (1-31): ");							//user instructions
		end = input.nextInt();										// tacking inputs from keyboards			
		
		 if (start <=31 && start >= 1 && end <= 31 && end >= 1 )					//to check end and start date in between1-31
	
			{ if ( start < end )									//to check start date is smaller than end date
			    {
				noofdays = end - start ;
				if(noofdays >= 5)								//to calculate discount and the final amount according to data

					{ discount= (chargeperday * noofdays ) * payment_5tomore; 
					  amount  = ( chargeperday * noofdays ) - discount ;}

				else if ( noofdays >= 3 )

					{ discount= ( chargeperday * noofdays ) * payment_3to4; 
					  amount  = ( chargeperday * noofdays ) - discount ;}

		
				else
					{ amount = ( chargeperday * noofdays); }
				System.out.print ("\nRoom Charge Per Day: Rs."+chargeperday+"/="+"\n");		//print the information that process
				System.out.print ("Number of Days Reserved: " +noofdays +"\n");
				System.out.print ( "Total Amount to be Paid: " +amount+"\n");
			    }
			 else { System.out.print ("Error : Start Date must be less than End Date ");}
					
			}
		 else
			{System.out.print ("Error : Days must be between 1 and 31 ");}

		
			
		
		}
}


/*we can use OR Gate for first if, like if start date and end date is higher than 31 and less than 1 program end and display "Error : Days must be between 1 and 31 " else run the program according ,this is just other logic to consider*/