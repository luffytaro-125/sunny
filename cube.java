class cube
{
	public static void main(String args[])
	{
		int a=16;
		double b=Math.cbrt(a);
		if(a%b==0)
		{
			System.out.println("Perfect cube");
		}
		else
		{
			System.out.println("Not perfect cube");
		}
	}
}