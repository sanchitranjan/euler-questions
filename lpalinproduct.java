
public class lpalinproduct
{

	public static void main(String[] args) 
	{
		int i,j,dig,r=0,n=0,m,max=0  ;
		for(i=100;i<=999;i++)
		{
			for(j=101;j<=999;j++)
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
			 {
			     if(n>max)
			    	 max=n;
			 }
			  r=0;
	    	}
		}
		System.out.println("largest palindrome product="+max);

	}

}
