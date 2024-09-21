package automation_testing_batch;
public class Google 
{
	
  // Parametrized Constructors
	
	Google(String a)
	{
		System.out.println("parametrized");
	}
	
	Google(int a, int b)
	{
		System.out.println("Second Parametrized");
	}
	
	Google(double a, float b)
	{
		System.out.println("Third parametrized");
	}
	public static void main(String[] args) 
	{
		new Google("Aj");
		new Google(10, 20);
		new Google(1.5, 2.5f);
	}

}
