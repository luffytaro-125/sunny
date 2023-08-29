class leap
{
	public static void main(String args[])
	{
		double a=1500;
		if(a%400==0||a%4==0&&a%100!=0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	}
}