class admin
{
	public static void main(String args[])
	{
		int s1=74,s2=56,s3=82,s4=65,s5=70,s6=96,maxmarks=600,fee=74000;
		double total=s1+s2+s3+s4+s5+s6;
		double percentage=(total/600.0)*100;
		if(percentage>80)
		{
			char section='A';
			int scholarship=10000;
			int donation=0;
			String grade="distinction";
			int feetobepaid=fee-scholarship;
			System.out.println(feetobepaid);
		}
		else
		{
			char section='B';
			int scholarship=0;
			int donation=10000;
			String grade="pass";
			int feetobepaid=fee+donation;
			System.out.println(feetobepaid);	
		}
		System.out.println(percentage);
	}
}