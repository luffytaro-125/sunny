rclass quad
{
	public static void main(String args[])
	{
		int a=2,b=7,c=4;
		double d=(Math.pow(b,2))-(4*a*c);
		double Q=(-b+(Math.sqrt(d)))/(2*a);
		double q=(-b-(Math.sqrt(d)))/(2*a);
		System.out.println("Q="+Q+" "+"q="+q);
	}
}