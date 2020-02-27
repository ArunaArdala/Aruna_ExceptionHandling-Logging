package logger.houseconstruction;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Main extends constructioncost{
	Scanner sc=new Scanner(System.in);
	public static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String args[])
	{
		constructioncost constructor=new constructioncost();
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter the standards of materials\n1.standard\n2.above standards \n3.high standards \n4.high standards and fully automated house");
		int s=sc.nextInt();
		LOGGER.info("Enter the area for house");
		float area=sc.nextInt();
		int cost;
		float housecost;
		int flag1;
		switch(s)
		{
			case 1: LOGGER.info("Enter you want fully automated house");
					flag1=sc.nextInt();
					cost=constructor.automated(flag1);
					housecost=constructor.construction_cost(1200,cost,area);
					LOGGER.info("Construction cost of house is "+housecost);
					break;
			case 2:LOGGER.info("Enter you want fully automated house");
					flag1=sc.nextInt();
					cost=constructor.automated(flag1);
					housecost=constructor.construction_cost(1500,cost,area);
					LOGGER.info("Construction cost of house is "+housecost);
					break;
			case 3:LOGGER.info("Enter you want fully automated house");
				   flag1=sc.nextInt();
				   cost=constructor.automated(flag1);
				   housecost=constructor.construction_cost(1800,cost,area);
				   LOGGER.info("Construction cost of house is "+housecost);
				   break;
			case 4:
				   housecost=2500*area;
				   LOGGER.info("Construction cost of house is "+housecost);
				   break;
			default:return;
					
				   
		}
	}


}
