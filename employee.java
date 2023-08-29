class employee
{
	public static void main(String args[])
	{
		int basicsalary=45000;
		double ta=((15/100.0)*basicsalary);
		double da=((12/100.0)*basicsalary);
		double hra=((19/100.0)*basicsalary);
		double totalsalary=ta+da+hra+basicsalary;
		double pf=0,tax=0;
		if(totalsalary>40000)
		{
			pf=((11/100.0)*basicsalary);
			tax=((5/100.0)*basicsalary);
		}
		else
		{
			pf=((7/100.0)*basicsalary);
			tax=((2.5/100.0)*basicsalary);
		}
		double grosssalary=totalsalary-pf-tax;
		double yearsalary=grosssalary*12;
		System.out.println(grosssalary);
		System.out.println(yearsalary);
	}
}