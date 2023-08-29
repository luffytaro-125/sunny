class product
{
	public static void main(String args[])
	{
		int item1=450,item2=160,item3=100;
		double total=(item1+item2+item3);double discount;
		System.out.println(total);
		if(total<1000)
		{
		 discount=((10/100.0)*total);	
		}
		else
		{
		 discount=((5/100.0)*total);
		}
		double finaltotal=(total-discount);
		System.out.println(finaltotal);
	}
}