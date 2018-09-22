/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
public class pythagoreantriplet
{

	public static void main(String[] args)
	{
		int i, j, c;
		for( i=1;i<1000;i++)
		{
			for( j=i+1;j<1000;j++)
			{
				 c= 1000-i-j;
				if (i*i + j*j == c * c)
				{
					System.out.println(i*j*c);
				}
			}
		}
		

}
}
