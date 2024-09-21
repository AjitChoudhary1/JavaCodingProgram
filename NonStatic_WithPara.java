package automation_testing_batch;
public class NonStatic_WithPara 
{
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void sub(int a, double b)
	{
		double result=a+b;
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		NonStatic_WithPara n1=new NonStatic_WithPara();
		n1.add(2, 5);
		n1.sub(5, 6.2);
	}

}
