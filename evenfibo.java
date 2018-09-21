
public class evenfibo 
{

	public static void main(String[] args)
	{
		int i;
		int a=0,b=1,sum1=0, sum2=0   ;
		while(sum1<4000000)
		{
		sum1= a+b;
		a=b;
		b=sum1;
		if(sum1%2==0)
		{
			sum2=sum2+sum1;
		}
			
			
		}
		System.out.println("sum="+sum2);

	}

}
