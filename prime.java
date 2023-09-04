class prime
{
	public static void main(String args[])
	{
		int x=1,n=7,count=0;
		while(n>=x)
		{
			if(n%x==0)
			{
				count++;
			}
			x++;
		}
		if(count==2)
		System.out.println("prime numbers");
		else
		System.out.println("not prime numbers");
	}
}