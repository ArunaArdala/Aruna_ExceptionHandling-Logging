package logger.interest;
public class interests {
	public float simpleInterest(int principle,float rate,int time)
	{
		float simpleinterest=(principle*rate*time)/100;
		return simpleinterest;
	}
	public double compoundInterest(int principle,float rate,int time,int n)
	{
		double compoundinterest=principle*Math.pow((1+rate/n),n*time);
		return compoundinterest;
	}

}
