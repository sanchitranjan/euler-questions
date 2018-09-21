
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
