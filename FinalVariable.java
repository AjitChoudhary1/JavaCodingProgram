package automation_testing_batch;
public class FinalVariable 
{
	final static double pi=3.14;
	
	static void area1()
	{
		int r=5;
		double area=pi*r*r;
		System.out.println(area);
				
	}
	public static void main(String[] args) 
	{
		final int projectno=10;
		    //  projectno=11;    It's final Can't change the value
		System.out.println(projectno);
		
		area1();
	}

}
