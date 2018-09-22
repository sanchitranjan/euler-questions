/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
public class prime 
{
	public static void main(String[] args) 
	{
		int n=3,i,c=0,prime=0,lprime=0;
		while(prime!=10001)
		{
			for(i=3;i<n;i++)
			{
				if(n%i==0)
			    c++;
			}
			if(c==0)
			{
				prime++;
				lprime=n;
			}
			c=0;
			n++;
		}
       System.out.println("largest prime="+lprime);
	

	}
}
