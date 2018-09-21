
public class smultiple 
{
	public static void main(String[] args) {
	   int lcm=11;
		int n,m;
		for(int i=1;i<20;i++)
		{
			n=lcm;
			m=i;
			while(n!=m)
			{
				if(n>m)
				{
					n=n-m;
				}
					
				else
				{
					m=m-n;
				}
					
			}
			lcm=(lcm*i)/n;
		}
		System.out.println("LCM= "+lcm);
	}


	
}
