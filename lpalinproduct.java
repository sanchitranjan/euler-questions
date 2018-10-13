/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
public class lpalinproduct
{
   public static void main(String[] args) 
	{
		int i,j,n,m,dig,r=0,max=0;
		for(i=1000;i>100;i--)
		{
			for(j=999;j>100;j--)
			{
				 
			  n=i*j;
			  m=n;
			  while(m!=0)
			  {
				dig=m%10;
				r=r*10+dig;
				m=m/10;
			  }
			  if(r==n) 
				  if(r>max)
					  max=r;
			   r=0;
			 }
		}
		System.out.println("largest palindrome product="+max);

	}
}

