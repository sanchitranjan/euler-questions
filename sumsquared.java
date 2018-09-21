
public class sumsquared
{

	public static void main(String[] args)
	{
		int i,sum1=0,sum2=0,diff;
		for(i=1;i<=100;i++)
		{
			sum1+=i;
		}
		sum1*=sum1;
		for(i=1;i<=100;i++)
		{
			sum2+=(i*i);
		}
		diff=sum1-sum2;
		System.out.println("diff between sum of square of first 100 natural no and square of sum is ="+diff);  

	}
}
