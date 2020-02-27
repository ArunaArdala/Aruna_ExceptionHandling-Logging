package logger.interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public class interestcalculation extends interests{
	public static final Logger LOGGER=LogManager.getLogger(interestcalculation.class);
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter Number of operations you want to be perform");
		interests Interest=new interests();
		int operations=sc.nextInt();
		while(operations>0)
		{
			LOGGER.info("Enter the principle amount");
			int principle=sc.nextInt();
			LOGGER.info("Enter the rate of interest");
			float rate=sc.nextInt();
			LOGGER.info("Enter the time");
			int time=sc.nextInt();
			LOGGER.info("You want to be simple interest or compound interest");
			LOGGER.info("1.Simple Interest \n2.Compound Interest \n 3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:float simple=Interest.simpleInterest(principle,rate,time);
						LOGGER.info(simple);
						break;
				case 2:System.out.println("Enter number of times per year");
						int n=sc.nextInt();
						double compound=Interest.compoundInterest(principle,rate,time,n);
						LOGGER.info(compound);
						break;
				default:
						LOGGER.info("Please Enter the correct option");
						return;
			}
			operations-=1;
		}+
			
			
			
			
			
	}

}
