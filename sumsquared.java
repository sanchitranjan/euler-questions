/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
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
