
public class lprime 
{

	public static void main(String[] args)
	{
     long n=600851475143L;
     int  i,c=0,max=0 ,j    ;
     for(i=2;i<n;i++)
     {
    	while(n%i==0)
    	{
    		
    		n=n/i;
    	}
     }
     System.out.println(i);
    
     
	}

}
