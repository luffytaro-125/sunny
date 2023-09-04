class perfect
{
	public static void main(String args[])
	{
		int x=1,n=8,sum=0;
		while(x<n)
		{
			if(n%x==0)
			{
				sum=sum+x;
			}
			x++;
		}
		if(sum==n)
		System.out.println("perfect number");
		else
		System.out.println("not perfect number");
	}
}
