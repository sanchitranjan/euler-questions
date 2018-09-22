/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/
public class primesummation 
{
	 static boolean pcheck(long n)
	    {
	        boolean s = true;
	        for (int i = 3; i<=Math.sqrt(n);i+=2)
	        {
	            if (n%i==0)
	            {
	                s=false;
	                break;
	            }
	        }
	        return s;
	    }
	    public static void main(String args[])
	    {
	        
	        long sum = 2;
	        for(long i = 3 ;i<=2000000;i+=2)
	        {
	            if(pcheck(i))
	            {
	                sum = sum +i;
	            }
	        }
	        System.out.println(sum); 
	   }
}
