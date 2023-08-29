class app
{
	public static void main(String args[])
	{
		String appname="uber";
		int charge=30;
		String carname="xuv";
		String pickup="hitechcity";
		String drop="jubleehills"; 
		System.out.println("Pickup="+ pickup);
		System.out.println("Drop ="+drop);
		double distance=10.5;
		double price=(charge*distance);
		System.out.println(price);
		double discount=0;
		if(price<200)
		{
			discount=((10.0/100)*price);
		}
		else
		{
			System.out.println(price);
		}
		double finalprice=(price-discount);
		double extracharge=100;//extra passenger 
		System.out.println(finalprice); 
		double totalprice=(price+extracharge);
		System.out.println(totalprice);
	}
}