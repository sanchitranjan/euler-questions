/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
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
