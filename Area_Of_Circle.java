package automation_testing_batch;
public class Area_Of_Circle 
{
	static double pi=3.14;
	
	static void circle1()
	{
		int r=6;
		double area=pi*r*r;
		System.out.println(area);
	}
	static void circle2()
	{
		int r=18;
		double area=pi*r*r;
		System.out.println(area);
	}
	static void circle3()
	{
		int r=9;
		double area=pi*r*r;
		System.out.println(area);
	}
	static void circle4()
	{
		int r=99;
		double area=pi*r*r;
		System.out.println(area);
	}
	static void circle5()
	{
		int r=1;
		double area=pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		
		circle1();
		circle2();
		circle3();
		circle4();
		circle5();
		
	}
}
